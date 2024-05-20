package com.banking.system.desktoplibraryapplication;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
  int nbBooks;
  List<Book> listOfBooks = new ArrayList<Book>();

public Shelf(int nbBooks) {
	super();
	this.nbBooks = nbBooks;
}

public void numberOfBooks() {
	System.out.println("This shelf contains "+this.nbBooks+" Books");
}
public void addBook(Book book) {
	if(listOfBooks.size()<nbBooks) {
		listOfBooks.add(book);
	}
	else {
		System.out.println("Sorry this shelf is full!");
	}
}

public Book returnBookByPostionInShelf(int positionInShelf) {
	try {
		return listOfBooks.get(positionInShelf-1);
	}catch (NullPointerException e) {
		System.out.println(e.getMessage());
		System.out.println("there is no bookat this position");
		return null;
	}catch(IndexOutOfBoundsException e) {
		System.out.println("position should be between 1 and "+ listOfBooks.size());
		return null;
		
	}

}
public int searchBook(String title,String author) {
	for(int i =0;i<listOfBooks.size();i++) {
		if(listOfBooks.get(i).getTitle().equals(title) && listOfBooks.get(i).getAuthor().equals(author)) {
			return i+1;
		}
	}
	return 0;
	
}
public Book delete(int positionInShelf) {
	if(this.listOfBooks.size()>=positionInShelf-1) {
		return listOfBooks.remove(positionInShelf-1);
		
	}
	else {
		System.out.println("this position is already emtpy!");
		return null;
	}
}
public Book delete(String title,String author) {
	if(searchBook(title, author)>0) {
		return listOfBooks.remove(searchBook(title, author)-1);
	}
	return null;
	
}

@Override
public String toString() {
	return "Shelf [nbBooks=" + nbBooks + ", listOfBooks=" + listOfBooks + "]";
}


 
}
