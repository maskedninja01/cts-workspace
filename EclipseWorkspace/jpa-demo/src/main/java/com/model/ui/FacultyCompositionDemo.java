package com.model.ui;

import javax.persistence.EntityManager;

import com.model.composition.Address;
import com.model.composition.Faculty;
import com.util.JPAUtil;

public class FacultyCompositionDemo {

	public static void main(String[] args) {
		Faculty f = new Faculty("Santosh Matthew", new Address("2nd Main","1st Cross, Aswath Nagar, Marthahalli","Bangalore-560037"));
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.persist(f);
		
		em.getTransaction().begin();
		em.persist(f);
		em.getTransaction().commit();
		
		//em.flush();  //Commit all transactions
		System.out.println("Faculty saved");
		JPAUtil.shutdown();

	}

}
