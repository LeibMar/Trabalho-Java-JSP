package com.ifsp.petshop.utils.mail;

import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


public class SendMail {		
	
	public static void sendPlainTextEmail(String host, String port,
            final String userName, final String password, String toAddress,
            String subject, String message) throws AddressException,
            MessagingException {

        // sets SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
// *** BEGIN CHANGE
        properties.put("mail.smtp.user", userName);

        // creates a new session, no Authenticator (will connect() later)
        Session session = Session.getDefaultInstance(properties);
// *** END CHANGE

        // creates a new e-mail message
        Message msg = new MimeMessage(session);

        msg.setFrom(new InternetAddress(userName));
        InternetAddress[] toAddresses = { new InternetAddress(toAddress) };
        msg.setRecipients(Message.RecipientType.TO, toAddresses);
        msg.setSubject(subject);
        msg.setSentDate(new Date());
        // set plain text message
        msg.setText(message);

// *** BEGIN CHANGE
        // sends the e-mail
        Transport t = session.getTransport("smtp");
        t.connect(userName, password);
        t.sendMessage(msg, msg.getAllRecipients());
        t.close();
// *** END CHANGE

    }

}

/*	
 *	Exemplo para Google: 
 *		Host:	smtp.gmail.com 
 *		porta:	465, se estiver usando o SSL 
 *		porta: 	587, se estiver usando o TLS
 *	
 *	Secure Socket Layer (SSL) é um padrão global em tecnologia de segurança desenvolvida pela Netscape em 1994. 
 *	Ele cria um canal criptografado entre um servidor web e um navegador (browser) para garantir que todos os 
 *	dados transmitidos sejam sigilosos e seguros. 
 * 
 * 	O TLS (Transport Layer Security) é um protocolo criptográfico cuja função é conferir segurança para a 
 * 	comunicação na Internet para serviços como email (SMTP), navegação por páginas (HTTP) e outros tipos de 
 * 	transferência de dados.
 * 
 * 	O TLS tem a capacidade de trabalhar em portas diferentes e usa algoritmos de criptografia mais fortes como 
 * 	o keyed-Hashing for Message Authentication Code (HMAC) enquanto o SSL apenas Message Authentication Code (MAC). 
 * 
 */
