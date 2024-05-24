package application;

import java.sql.Connection;

import db.DB;
import model.entities.Department;

public class Program {

	public static void main(String[] args) {
		
		Department departmet = new Department(1, "Books");
		
		System.out.println(departmet);
		
		/*
		 Connection conn = DB.getConnection(); // conectando com o banco
		DB.closeConnection(); //desconectando com o banco
		
		System.out.println("Banco conectado com suscesso!!");
		*/
	}

}
