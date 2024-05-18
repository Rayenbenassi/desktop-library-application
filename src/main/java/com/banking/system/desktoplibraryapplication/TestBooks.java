package com.banking.system.desktoplibraryapplication;

import java.util.Scanner;

public class TestBooks {

	public static void main(String[] args) {

		Book []books=new Book[3];
	
		for(int i =0 ;i<books.length;i++) {
			Scanner scan = new Scanner(System.in);
			books[i]=new Book();
			System.out.println("complete info for book number :"+ (i+1));
			System.out.println("Title : ?");
			books[i].setTitle(scan.nextLine());
			System.out.println("Athor : ?");
			books[i].setAuthor(scan.nextLine());
			System.out.println("nb of pages : ?");
			books[i].setNbPages(Integer.parseInt(scan.nextLine()));
			
			
		}

	}

}
