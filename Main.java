package com.abidjan.ci;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.abidjan.ci.entities.Person;

/**
 * com.abidjan.ci.Main
 * @author ADI
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("DEBUT EXECUTION");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("eclipselinkJPAU");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Person person = new Person();
		person.setId(2L);
		person.setName("Isaia Spield ");
		person.setImage(null);
		
		em.persist(person);
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
		System.out.println("FIN EXECUTION");
	}
}
