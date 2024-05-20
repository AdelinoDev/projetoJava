package application;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null; // Conecta com o banco de dados
		Statement st = null; // Prepara a consulta SQL no banco de dados
		ResultSet rs = null; // Mostra o resultado da consulta
		
		
		//Recupera, Buscar os dados no banco de dados
		try {
			conn = DB.getConnection();
			
			st = conn.createStatement();
			
			rs = st.executeQuery("select * from department");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + "- " + rs.getString("Name"));
			}
		}
		catch (SQLException e) {
			e.printStackTrace(); // mostra na tela as mensagens de erro
		}
		finally {
			DB.closeResultSett(rs);
			DB.closeStatement(st);
			DB.closeConnection();
			
		}

	}

}
