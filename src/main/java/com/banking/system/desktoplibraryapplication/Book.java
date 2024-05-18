package com.banking.system.desktoplibraryapplication;

public class Book {
	private String title, author;
	private int nbPages;
	  
	public Book(String title, String author, int nbPages) {
		super();
		this.title = title;
		this.author = author;
		this.nbPages = nbPages;
	}

	public String getAuthor() {
		return author;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	public static void main(String[] args) {
		
	Book book1= new Book("Welcome to the jungle","Rayen Benassi",9999);
	Book book2= new Book("Do not be Evil","Olfa Elharzalli",10293);
	
	System.out.println("author of Book1: "+book1.getAuthor());
	System.out.println("author of Book2: "+book2.getAuthor());
		

	}

}
