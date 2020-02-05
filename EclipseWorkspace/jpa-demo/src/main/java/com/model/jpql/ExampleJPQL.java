package com.model.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.Employee;

import com.util.JPAUtil;

public class ExampleJPQL {

	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		Employee emp = em.find(Employee.class,101);
		if(emp!=null) {
			System.out.println(emp);
		}
		
		String qryString = "SELECT e FROM Employee e";
		Query qry = em.createQuery(qryString);
		
		display(qry.getResultList());
		
		display(em.createQuery("SELECT e FROM Employee e WHERE e.basic>25000").getResultList());
		
		List<String> names = em.createQuery("SELECT  e.ename FROM Employee e").getResultList();
		for(String n : names) {
			System.out.println(n);
		}
		
		em.close();
		JPAUtil.shutdown();
		
	}
	
	static void display(List<Employee> data) {
		
		System.out.println("--------------------------------------");
		for(Employee e: data) {
			System.out.println(e);
		}
	System.out.println("--------------------------------------------");
	}

}
