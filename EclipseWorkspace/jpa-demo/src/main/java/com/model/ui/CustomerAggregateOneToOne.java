package com.model.ui;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.model.aggregate.BankAccount;
import com.model.aggregate.Customer;
import com.util.JPAUtil;

public class CustomerAggregateOneToOne {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		Customer cs = new Customer("888542323113","Priyanka",ba);
		ba.setAccno("SBIN820728474");
		ba.setCustomer(cs);
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(cs);
		txn.commit();
		JPAUtil.shutdown();

	}

}
