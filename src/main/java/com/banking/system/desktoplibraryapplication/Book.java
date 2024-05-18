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


	public static void main(String[] args) {
		
	Book book1= new Book("Welcome to the jungle","Rayen Benassi",9999);
	Book book2= new Book("Do not be Evil","Olfa Elharzalli",10293);
	
	
	
	System.out.println("*********Books : *********");
	System.out.println(
			"author of  "+ book1.getTitle() + ": "+
	         book1.getAuthor() +"\n"+
			 "number of pages: " +
	         book1.getNbPages() 
			);
	
	System.out.println(
			"author of  "+ book2.getTitle() + ": "+
	         book2.getAuthor() +"\n"+
			 "number of pages: " +
	         book2.getNbPages() 
			);
	

	}


}
