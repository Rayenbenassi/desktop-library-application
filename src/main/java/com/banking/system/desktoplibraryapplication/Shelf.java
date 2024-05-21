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
//public static void main(String[] args) {
//    // Creating book instances
//    Book book1 = new Book("Welcome to the Jungle", "Rayen Benassi", 9999);
//    Book book2 = new Book("Do Not Be Evil", "Olfa Elharzalli", 10293);
//    Book book3 = new Book("Another Book", "Another Author", 500);
//
//    // Creating a shelf with a capacity of 2 books
//    Shelf shelf = new Shelf(2);
//    System.out.println("********* Shelf Initialization *********");
//    shelf.numberOfBooks();
//    
//    // Adding books to the shelf
//    System.out.println("********* Adding Books *********");
//    shelf.addBook(book1);
//    shelf.addBook(book2);
//    shelf.addBook(book3);  // This should print "Sorry this shelf is full!"
//    System.out.println(shelf);
//
//    // Searching for a book
//    System.out.println("********* Searching for a Book *********");
//    int position = shelf.searchBook("Welcome to the Jungle", "Rayen Benassi");
//    System.out.println("Book found at position: " + position);
//
//    // Returning a book by position
//    System.out.println("********* Returning Book by Position *********");
//    Book returnedBook = shelf.returnBookByPostionInShelf(1);
//    System.out.println("Returned Book: " + returnedBook);
//
//    // Deleting a book by position
//    System.out.println("********* Deleting Book by Position *********");
//    Book deletedBook = shelf.delete(1);
//    System.out.println("Deleted Book: " + deletedBook);
//    System.out.println(shelf);
//
//    // Deleting a book by title and author
//    System.out.println("********* Deleting Book by Title and Author *********");
//    deletedBook = shelf.delete("Do Not Be Evil", "Olfa Elharzalli");
//    System.out.println("Deleted Book: " + deletedBook);
//    System.out.println(shelf);
//
//    // Trying to delete a non-existing book
//    System.out.println("********* Trying to Delete a Non-existing Book *********");
//    deletedBook = shelf.delete("Non-existing Title", "Non-existing Author");
//    System.out.println("Deleted Book: " + deletedBook);
//    System.out.println(shelf);
//}
//

 
}
