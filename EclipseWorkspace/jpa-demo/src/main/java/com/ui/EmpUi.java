package com.ui;

import java.util.Scanner;

import javax.persistence.EntityManager;

import org.apache.log4j.Logger;


import com.model.Employee;
import com.util.JPAUtil;


public class EmpUi {
	static Logger log = Logger.getLogger(EmpUi.class.getName());

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Employee e = new Employee();
		System.out.println("EmpId");
		e.setEmpId(scan.nextInt());
		System.out.println("EName: ");
		e.setEmpName(scan.next());
		System.out.println("Basic:");
		e.setBasic(scan.nextDouble());
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		
		em.getTransaction().begin();
		em.persist(e);
		log.info(e);
		log.debug(e+"This is debug message");
		em.getTransaction().commit();
		
		log.info("Emp Saved");
		JPAUtil.shutdown();
		scan.close();
	}

}
