package application;

import java.sql.Connection;
import java.util.Date;

import db.DB;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("#### TEST 1: seller findbyId ####");
		Seller seller = sellerDao.findById(3); // buscando o vendedor de Id núnemro 3
		
		System.out.println(seller);

	}

}
