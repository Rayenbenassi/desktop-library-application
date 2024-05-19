package com.banking.system.desktoplibraryapplication;

import java.util.Arrays;
import java.util.Scanner;

public class TestBooks {

    public static void main(String[] args) {
    	
        Book[] books = new Book[3];
        Book[]bookList =new Book[5];
        bookList[0]=new Book("Les misérables","Victor Hugo",45);
        bookList[1]=new Book("L'étranger","Albert Camus",56);
        bookList[2]=new Book("Stupeur et Tremblements","Amélie Nothomb",45);
        bookList[3]=new Book("Le Mur","Jean paul Sartre",56);
        bookList[4]=new Book("Notre Dame de Paris","Victor Hugo",45);
        Arrays.sort(bookList);
        for(Book book:bookList) {
        	
        	if(book.getAuthor()=="Victor Hugo") {
        		System.out.println("Book of \"Victor Hugo\" :");
        		System.out.println(book.toString());
        	}
        	if(book.getTitle().startsWith("L")) {
        		System.out.println("Book title starts with \"L\" :");
        		System.out.println(book.toString());
        	}
        	
        }
        
       
        try (Scanner scan = new Scanner(System.in)) {  
        	// Scanner declared here will be closed automatically
            for (int i = 0; i < books.length; i++) {
                books[i] = new Book();
                System.out.println("Complete info for book number: " + (i + 1));

                System.out.print("Title: ");
                books[i].setTitle(scan.nextLine());

                System.out.print("Author: ");
                books[i].setAuthor(scan.nextLine());

                System.out.print("Number of pages: ");
                while (true) {
                    try {
                        books[i].setNbPages(Integer.parseInt(scan.nextLine()));
                        break;
                    } catch (NumberFormatException e) {
                        System.out.print("Invalid input. Please enter a valid number of pages: ");
                    }
                }
            }
        }
        System.out.println("Books before tri :  " );
        for (int i = 0; i < books.length; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Number of pages: " + books[i].getNbPages());
        }
  
        
        //Sorting with sortBook
        //Book.sortBooks(books);
        //Sorting using predefine methodes Arrays.sort
        Arrays.sort(books);

        // Optionally print out the book details to verify input
        System.out.println("Books after tri :  " );
        for (int i = 0; i < books.length; i++) {
            System.out.println("\nBook " + (i + 1) + ":");
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Number of pages: " + books[i].getNbPages());
        }
    }
}
