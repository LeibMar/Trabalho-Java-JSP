<%@page import="com.ifsp.petshop.dao.UsuarioDao"%>
<%@page import="com.ifsp.petshop.model.Usuario"%>
<jsp:useBean id="usuario" class="com.ifsp.petshop.model.Usuario"></jsp:useBean>
<jsp:setProperty property="*" name="usuario"/>

<%
	Usuario login = UsuarioDao.procurarUsuarioPorEmailSenha(usuario.getEmail(), usuario.getSenha());
	if(login.getEmail() != null && !login.getEmail().isEmpty()){
		
		response.sendRedirect("index.jsp");
	}else{

		response.sendRedirect("login.jsp");
	}
	
%>