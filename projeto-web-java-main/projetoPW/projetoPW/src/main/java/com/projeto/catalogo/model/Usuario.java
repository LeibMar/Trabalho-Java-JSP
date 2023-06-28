package com.ifsp.petshop.model;

public class Usuario {
	
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private String senhaRepetida;


public Usuario(Integer id, String nome, String email, String senha, String senhaRepetida) {
	super();
	this.id = id;
	this.nome = nome;
	this.email = email;
	this.senha = senha;
	this.senha = senhaRepetida;
}

public Usuario() {
	super();
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getSenha() {
	return senha;
}
public void setSenha(String senha) {
	this.senha = senha;
}
public String getSenhaRepetida() {
	return senhaRepetida;
}
public void setSenhaRepetida(String senhaRepetida) {
	this.senhaRepetida = senhaRepetida;
}


}