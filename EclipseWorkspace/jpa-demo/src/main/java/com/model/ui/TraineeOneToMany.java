package com.model.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.model.aggregate.Course;
import com.model.aggregate.Trainee;
import com.util.JPAUtil;

public class TraineeOneToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Course mca = new Course(101,"MCA", new TreeSet<Trainee>());
		Course mba= new Course(102,"MBA", new TreeSet<Trainee>());
		
		mca.getTrainees().add(new Trainee(201, "Anupam",mca));
		mca.getTrainees().add(new Trainee(202,"Bhisma",mca));
		mca.getTrainees().add(new Trainee(203,"Bindu", mca));
		
		mba.getTrainees().add(new Trainee(204, "Renuka",mba));
		mba.getTrainees().add(new Trainee(205, "Manas",mba));
		mba.getTrainees().add(new Trainee(206,"Tara",mba));
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(mca);
		em.persist(mba);
		txn.commit();
	}

}
