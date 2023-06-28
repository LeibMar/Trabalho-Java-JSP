package com.ifsp.petshop.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.ifsp.petshop.model.Animal;
import com.ifsp.petshop.model.Usuario;
import com.ifsp.petshop.utils.mail.SendMail;

public class UsuarioDao {
	
public static Usuario procurarUsuarioPorEmailSenha(String email, String senha){
		
		String query = "SELECT * FROM TB_USUARIO WHERE email = ? AND senha = ?";
		
		PreparedStatement con;
        
        try {
        	
        	DbConnection dbConnection = new DbConnection();
        	
        	con = dbConnection.getConnection().prepareStatement(query);
        	con.setString(1, email);        	
        	con.setString(2, senha);   
        	
        	ResultSet resultSet = con.executeQuery();
        	
        	Usuario usuario = new Usuario();
        	
        	 while(resultSet.next()) {
        		 usuario.setId(resultSet.getInt("id"));
        		 usuario.setNome(resultSet.getString("nome"));
        		 usuario.setEmail(resultSet.getString("email"));
        		 usuario.setSenha(resultSet.getString("senha"));
             }
        	 
         	resultSet.close();
            con.close();
            
        	return usuario;
        	
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
		return null;
	}
	
public static void adicionarUsuario(Usuario usuario) throws AddressException, MessagingException{
	
	String query = "INSERT INTO TB_USUARIO (nome, email, senha) VALUES (?, ?, ?)";
	
	PreparedStatement con;
    
    try {
    	
    	DbConnection dbConnection = new DbConnection();
    	
    	con = dbConnection.getConnection().prepareStatement(query);

    	con.setString(1, usuario.getNome());
    	con.setString(2, usuario.getEmail());
    	con.setString(3, usuario.getSenha());
    	
    	con.executeUpdate();
    	con.close();	
    	//TLS - EMAIL - 587 
    	SendMail.sendPlainTextEmail("smtp.gmail.com", "587", "leandro.artilha@yahoo.com", "yahoo123Pw", usuario.getEmail(), "Bem Vindo!", "Seu cadastro foi concluído com sucesso!");
    	
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}