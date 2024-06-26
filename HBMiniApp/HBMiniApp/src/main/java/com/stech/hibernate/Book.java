package com.stech.hibernate;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
	private long bookId;
	private String title;
	private String author;
	private float price;
	
	// Empty Constructor
	public Book() {
		
	}

	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	// Getter/Setter For BookId
	public long getBookId() {
		return bookId;
	}
	
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	
	// Getter/Setter for Title
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	
	// Getter/Setter for Author
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	
	// Getter/Setter for Price
	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	
}
