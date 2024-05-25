package application;

import java.sql.Connection;
import java.util.Date;

import db.DB;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department departmet = new Department(1, "Books");
		Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.0, departmet);
		
		System.out.println(departmet);
		System.err.println();
		System.out.println(seller);
		
		/*
		 Connection conn = DB.getConnection(); // conectando com o banco
		DB.closeConnection(); //desconectando com o banco
		
		System.out.println("Banco conectado com suscesso!!");
		*/
	}

}
