<%@page import="com.ifsp.petshop.dao.UsuarioDao"%>
<%@page import="com.ifsp.petshop.model.Usuario"%>
<jsp:useBean id="usuario" class="com.ifsp.petshop.model.Usuario"></jsp:useBean>
<jsp:setProperty property="*" name="usuario"/>
<%
if(usuario.getSenhaRepetida().equals(usuario.getSenha()) ){

	//adiciona o user e manda email
	UsuarioDao.adicionarUsuario(usuario);
	
}

	response.sendRedirect("login.jsp");
%>