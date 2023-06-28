package com.projeto.catalogo.model;

public class Livro {
	
	private Integer id;
	private String titulo;
	private String autor;
	private Integer localPublicacao;
	private String ano;
	
	public Livro(Integer id, String titulo, String autor, Integer localPublicacao, String ano) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.localPublicacao = localPublicacao;
		this.ano = ano;
	}
	
	public Livro() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getLocalPublicacao() {
		return localPublicacao;
	}
	public void setLocalPublicacao(Integer localPublicacao) {
		this.localPublicacao = localPublicacao;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
}
