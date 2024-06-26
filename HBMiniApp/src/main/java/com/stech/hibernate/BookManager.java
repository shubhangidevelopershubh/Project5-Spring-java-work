package com.stech.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class BookManager {

	
	// Method For CRUD(C- create, R- read, U - update, D- delete)
	SessionFactory sessionFactory;


	void setup() {
		try {
			sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			sessionFactory.openSession();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void exit() {

	}

	// Creating Operation
	void create() {
		Book book = new Book();
		book.setTitle("Ramayan");
		book.setAuthor("Maharshi Valmiki");
		book.setPrice(125.00f);
	
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(book);

		session.getTransaction().commit();
		session.close(); // Session closed.
	}

	void read() {
		Session session = sessionFactory.openSession();

		long bookId = 2;

		Book book = session.get(Book.class, bookId);
		System.out.println("Book Id : " + book.getBookId());
		System.out.println("Book Title :" + book.getTitle());
		System.out.println("Book Author : " + book.getAuthor());
		System.out.println("Book Price : " + book.getPrice());

		session.close();
	}

	void update() {
		Book book = new Book();
		book.setBookId(1);
		book.setTitle("Java programming Language");
		book.setAuthor("Santosh Mali");
		book.setPrice(150.00f);

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.update(book);
		session.getTransaction().commit();

		session.close();
	}

	void delete() {
		Book book = new Book();
		book.setBookId(1);
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.delete(book);

		session.getTransaction().commit();
		session.close();
	}

	public static void main(String[] args) {

		BookManager manager = new BookManager();
		manager.setup();

		//manager.create();

		 manager.read();

	    // manager.update();

		// manager.read();

		// manager.delete();
		//System.out.println("Records Deleted Successfully");

	}

}
