package application;

import java.sql.Connection;

import db.DB;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection(); // conectando com o banco
		DB.closeConnection(); //desconectando com o banco
		
		System.out.println("Banco conectado com suscesso!!");

	}

}
