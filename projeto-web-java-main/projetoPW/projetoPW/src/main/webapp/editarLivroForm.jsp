<%@page import="com.projeto.catalogo.dao.LivroDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<title>Catálogo colaborativo</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">

<style>
#voltar{
	color: black;
	text-decoration:none;
	margin: 2rem;
}

</style>

</head>
<body>   
	<%@ page import="com.ifsp.petshop.dao.*, com.ifsp.petshop.model.*" %>
	<%
		String id = request.getParameter("id");
		Livro livro = LivroDao.procurarLivroPorId(Integer.valueOf(id));
	%>
	
	<jsp:include page="components/header.jsp"></jsp:include>
	<a id="voltar" class="p-2" href="javascript:history.back()"> < Voltar </a>
	
	<div class="container-sm pt-4">
		<h3>Atualizar registro &#129409</h3>
   
    	<hr class="my-4">
		
		<form action="editarLivroAction.jsp" method="post">
			<input type="hidden" name="id" value="<%=livro.getId()%>">

			<div class="form-group">
				<div class="col-sm-6">
					<label for="nome">Título</label>
					<input class="form-control" name="titulo" id="titulo" placeholder="Digite o título do livro"  required value="<%=livro.getTitulo()%>">
				</div>
				<div class="col">
				
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-6">
					<label for="raca">Autor</label>
					<input class="form-control" name="autor" id="autor" placeholder="Digite o nome do autor"  required value="<%=livro.getAutor()%>">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-6">
					<label for="idade">Local de publicação</label>   
				 	<input class="form-control" name="localPublicacao" id="locaPublicacao" type="number" placeholder="Digite o local de publicação do livro"  required value="<%=livro.getLocalPublicacao()%>">
				 </div>
			</div>
			<div class="form-group">
				<div class="col-sm-6">
					<label for="cor">Ano</label>
					<input class="form-control" name="ano" id="ano" placeholder="Digite o ano de publicação" required value="<%=livro.getAno()%>">   
				</div>
			</div>
			 <input type="submit" class="btn btn-primary btn-md mt-4" value="Atualizar">      
		</form>
	</div>
</body>
</html>