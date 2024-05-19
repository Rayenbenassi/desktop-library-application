package com.banking.system.desktoplibraryapplication;

import java.util.UUID;

public class Book {
	private String title, author;
	long code;
	private int nbPages;
	
	
	public int compare( Book b) {
		return this.getTitle().compareTo(b.getTitle());
		
	}
	public static int compare( Book b1,Book b2) {
		return b1.getTitle().compareTo(b2.getTitle());
		
	}

	public Book() {
		super();
		this.code = Math.abs(UUID.randomUUID().getMostSignificantBits());
	}

	public Book(String title, String author, int nbPages) {
		super();
		this.title = title;
		this.author = author;
		this.code = Math.abs(UUID.randomUUID().getMostSignificantBits());
		this.nbPages = nbPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setNbPages(int nbPages) {
		if(nbPages>0) {
		this.nbPages = nbPages;
		}
		else {
			System.err.println("nbPages should be > 0 !");
		}
		
	}
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public long getCode() {
		return code;
	}
	

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", code=" + code + "]";
	}

	public static void main(String[] args) {
		
	Book book1= new Book("Welcome to the jungle","Rayen Benassi",9999);
	Book book2= new Book("Do not be Evil","Olfa Elharzalli",10293);
	

	System.out.println("*********Books :*********");
	System.out.println(book1.toString());
	System.out.println(book2.toString());
	}
}
