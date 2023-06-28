<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
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

	<nav class="navbar navbar-dark bg-dark justify-content-between">
	<a class="navbar-brand p-2"> Adoção de Animais</a>
</nav>
	<a id="voltar" class="p-2" href="javascript:history.back()"> < Voltar </a>
	<div class="container-sm pt-4">
		<h3>Cadastro</h3>
   
    	<hr class="my-4">
		
		<form action="adicionarUsuarioAction.jsp" method="post">
			<div class="form-group">
				<div class="col-sm-6">
					<label for="nome">Nome</label>
					<input class="form-control" name="nome" id="nome"  required>
				</div>
				<div class="col">
				
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-6">
					<label for="email">Email</label>
					<input class="form-control" type="email" name="email" id="email"  required>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-6">
					<label for="senha">Criar Senha</label>   
				 	<input class="form-control" name="senha" id="senha"  type="password" required>
				 </div>
			</div>

			<div class="form-group">
				<div class="col-sm-6">
					<label for="senhaRepetida">Repetir Senha</label>   
				 	<input class="form-control" name="senhaRepetida" id="senhaRepetida"  type="password" required>
				 </div>
			</div>

			<input type="submit" class="btn btn-primary btn-md mt-4" value="Cadastrar">      
		</form>
	</div>
</body>
</html>