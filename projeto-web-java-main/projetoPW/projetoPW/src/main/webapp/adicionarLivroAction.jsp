<%@page import="com.ifsp.petshop.dao.LivroDao"%>
<%@page import="com.ifsp.petshop.model.Livro"%>
<jsp:useBean id="animal" class="com.ifsp.petshop.model.Livro"></jsp:useBean>
<jsp:setProperty property="*" name="livro"/>

<%
	LivroDao.adicionarAnimal(livro);
	response.sendRedirect("index.jsp");
%>