<%@page import="com.projeto.catalogo.dao.LivroDao"%>
<%@page import="com.projeto.catalogo.model.Livro"%>
<jsp:useBean id="livro" class="com.projeto.catalogo.model.Livro"></jsp:useBean>
<jsp:setProperty property="*" name="livro"/>

<%
	LivroDao.editarLivro(livro);
	response.sendRedirect("index.jsp");
%>