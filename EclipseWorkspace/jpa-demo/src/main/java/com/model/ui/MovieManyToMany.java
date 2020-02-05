package com.model.ui;

import java.util.TreeSet;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.model.aggregate.Artist;
import com.model.aggregate.Movie;
import com.util.JPAUtil;

public class MovieManyToMany {

	public static void main(String[] args) {
		Artist a1 = new Artist(104,"Cameron Diaz",new TreeSet<Movie>());
		Artist a2 = new Artist(105,"Tom Cruise",new TreeSet<Movie>());
		Artist a3 = new Artist(106,"Toby Macguire",new TreeSet<Movie>());
		
		Movie m1 = new Movie(103,"Vanilla sky", new TreeSet<Artist>());
		Movie m2 = new Movie(104,"Spider Man", new TreeSet<Artist>());
		
		m1.getArtists().add(a1);
		m1.getArtists().add(a2);
		
		//m2.getArtists().add(a2);
		m2.getArtists().add(a3);
		
		a1.getMovies().add(m1);
		a2.getMovies().add(m1);
		//a3.getMovies().add(m1);
		a3.getMovies().add(m2);
		
		EntityManager em = JPAUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(a1);
		em.persist(a2);
		em.persist(a3);
		txn.commit();
		JPAUtil.shutdown();
	}

}
