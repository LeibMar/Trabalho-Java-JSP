package com.projeto.catalogo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ifsp.petshop.model.Livro;

public class LivroDao {

	public static List<Livro> listarLivros(){
		
		try {
			
			String query = "SELECT * FROM LIVRO";
			PreparedStatement con;
			
			DbConnection dbConnection = new DbConnection();
			
			con = dbConnection.getConnection().prepareStatement(query);
			
			ResultSet resultSet = con.executeQuery();
			
            ArrayList<Livro> listaLivros = new ArrayList<>();
            while(resultSet.next()) {
            	
            	Livro livro = new Livro();

            	livro.setId(resultSet.getInt("id"));
            	livro.setTitulo(resultSet.getString("titulo"));
            	livro.setAutor(resultSet.getString("autor"));
            	livro.setAno(resultSet.getString("ano"));
            	livro.setLocalPublicacao(resultSet.getInt("localPublicacao"));

            	listaLivros.add(livro);
            }
			
        	resultSet.close();
            con.close();

            return listaLivros;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public static Livro procurarLivroPorId(Integer id){
		
		String query = "SELECT * FROM LIVRO WHERE ID = ?";
		
		PreparedStatement con;
        
        try {
        	
        	DbConnection dbConnection = new DbConnection();
        	
        	con = dbConnection.getConnection().prepareStatement(query);
        	con.setInt(1, id);
        	
        	ResultSet resultSet = con.executeQuery();
        	
        	Livro livro = new Livro();
        	
        	 while(resultSet.next()) {
             	livro.setId(resultSet.getInt("id"));
             	livro.setTitulo(resultSet.getString("titulo"));
             	livro.setAutor(resultSet.getString("autor"));
             	livro.setAno(resultSet.getString("ano"));
             	livro.setLocalPublicacao(resultSet.getInt("localPublicacao"));
             }
        	 
         	resultSet.close();
            con.close();
            
        	return livro;
        	
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
		return null;
	}
	
	public static void deletarLivroPorId(Integer id){
		
		String query = "DELETE FROM TB_ANIMAL WHERE id = ?";
		
		PreparedStatement con;
        
        try {
        	
        	DbConnection dbConnection = new DbConnection();
        	
        	con = dbConnection.getConnection().prepareStatement(query);

        	con.setInt(1, id);
        	con.executeUpdate();
        	
        	con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	
	public static void adicionarLivro(Livro livro){
		
		String query = "INSERT INTO TB_ANIMAL (titulo, autor, localPublicacao, ano) VALUES (?, ?, ?, ?)";
		
		PreparedStatement con;
        
        try {
        	
        	DbConnection dbConnection = new DbConnection();
        	
        	con = dbConnection.getConnection().prepareStatement(query);

        	con.setString(1, livro.getTitulo());
        	con.setString(2, livro.getAutor());
        	con.setInt(3, livro.getLocalPublicacao());
        	con.setString(4, livro.getAno());
        	
        	con.executeUpdate();
        	con.close();	
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
		
	public static void editarLivro(Livro livro){
		String query = "UPDATE TB_ANIMAL SET titulo = ?, autor = ?, localPublicacao = ?, ano = ? WHERE ID = ?";
		
		PreparedStatement con;
		
        try {
        	
        	DbConnection dbConnection = new DbConnection();
        	
        	con = dbConnection.getConnection().prepareStatement(query);
        	
        	con.setString(1, livro.getTitulo());
        	con.setString(2, livro.getAutor());
        	con.setInt(3, livro.getLocalPublicacao());
        	con.setString(4, livro.getAno());
        	con.setInt(5, livro.getId());
        	
        	con.executeUpdate();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }	
	}
	
}
