package com.model.ui;

import javax.persistence.EntityManager;

import com.model.model2.ContractEmp;
import com.model.model2.Emp;
import com.model.model2.Manager;
import com.util.JPAUtil;

public class EmpUi {

	public static void main(String[] args) {
		Emp e= new Emp(100,"Dipesh",25000);
		Manager m = new Manager(102,"Anubhav",35000,9300);
		ContractEmp ce = new ContractEmp(194,"Penny",50000,21);
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		em.persist(m);
		em.persist(ce);
		em.getTransaction().commit();
		
		System.out.println("All Records Saved");
		JPAUtil.shutdown();

	}

}
