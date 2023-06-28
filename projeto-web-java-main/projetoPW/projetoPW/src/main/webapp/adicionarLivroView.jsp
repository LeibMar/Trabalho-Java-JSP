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
	<jsp:include page="components/header.jsp"></jsp:include>
	<a id="voltar" class="p-2" href="javascript:history.back()"> < Voltar </a>
	<div class="container-sm pt-4">
		<h3>Adicionar livro &#129409</h3>
   
    	<hr class="my-4">
		
		<form action="adicionarLivroAction.jsp" method="post">
			<div class="form-group">
				<div class="col-sm-6">
					<label for="titulo">Título</label>
					<input class="form-control" name="titulo" id="titulo"  required placeholder="Digite o nome do livro">
				</div>
				<div class="col">
				
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-6">
					<label for="titulo">Titulo</label>
					<input class="form-control" name="autor" id="autor"  required placeholder="Digite o nome do autor">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-6">
					<label for="localPublicacao">Local de publicação</label>   
				 	<input class="form-control" type="number" name="localPublicacao" id="localPublicacao"  required placeholder="Digite o local de publicacao">
				 </div>
			</div>
			<div class="form-group">
				<div class="col-sm-6">
					<label for="ano">Ano</label>
					<input class="form-control" name="ano" id="ano"  required placeholder="Digite o ano de publicação">   
				</div>
			</div>
			<input type="submit" class="btn btn-primary btn-md mt-4" value="Salvar">      
		</form>
	</div>
</body>
</html>