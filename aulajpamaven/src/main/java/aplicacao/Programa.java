package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Adelino Neto", "adelino@gmail.com");
		Pessoa p3 = new Pessoa(null, "Amanda Litwak", "amanda@gamil.com");
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//inserindo os objetos no banco de dados 
		em.getTransaction().begin();//inicia a transacao com o banco
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();//para confirmar as alteraçoes que fiz
		
		System.out.println("OK!!");
	}

}
