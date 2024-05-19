package com.banking.system.desktoplibraryapplication;

import java.util.Arrays;
import java.util.Scanner;

public class TestBooks {

    public static void main(String[] args) {
    	
        Book[] books = new Book[3];

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
