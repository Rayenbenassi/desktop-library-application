package com.banking.system.desktoplibraryapplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {
	List<Book> listOfBooks=new ArrayList<Book>();
	List<Reader> listOfReaders=new ArrayList<Reader>();
	Map<Long,Integer> booksMap=new HashMap<Long,Integer>();
	Map<Long,BorrowedBookDetails> borrowedBooks = new HashMap<Long,BorrowedBookDetails>();
	
	
	public void addBook(Book b) {
		listOfBooks.add(b);
		if(booksMap.containsKey(b.getISBN())) {
			
			booksMap.replace(b.getISBN(), booksMap.get(b.getISBN()), booksMap.get(b.getISBN())+1);
		}
		else {
			booksMap.put(b.getISBN(), 1);
		}
	}
	public void borrowBook(long cin,Book b) {
		if(booksMap.get(b.getISBN())>0) {
			if(!borrowedBooks.containsKey(cin) ) {
				BorrowedBookDetails borrowedBookDetails=new BorrowedBookDetails(b,LocalDate.now());
				borrowedBooks.put(cin, borrowedBookDetails);
				booksMap.replace(b.getISBN(), booksMap.get(b.getISBN()), booksMap.get(b.getISBN())-1);
			}
			else { 
				System.out.println("Reader with Cin : " 
			    + cin 
			    + " is already have a book with ISBN :"
				+ borrowedBooks
				.get(cin)
				.getBorrowedbook()
				.getISBN());
			}
			
		}
		else {
			System.out.println("there is no more copies of this book");
		}
	
	}
	public void returnBook(Reader r,Book b){
		if(borrowedBooks.containsKey(r.getCIN())) {
			borrowedBooks.remove(r.getCIN());
			booksMap.replace(b.getISBN(), booksMap.get(b.getISBN()), booksMap.get(b.getISBN())+1);

		}
		else {
			System.out.println("ask the reader if he is here to donnate a book?");
		}
	}
	public int numberOfBorrowedBooks() {
		return borrowedBooks.size();
	}
    public int countBooksToReturnInNext7Days() {
        int count = 0;
        LocalDate now = LocalDate.now();
        for (BorrowedBookDetails details : borrowedBooks.values()) {
            if (!details.getReturnDate().isBefore(now) && !details.getReturnDate().isAfter(now.plusDays(7))) {
                count++;
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
        // Creating book instances
        Book book1 = new Book("Welcome to the Jungle", "Rayen Benassi", 9999, 1234567890L);
        Book book2 = new Book("Do Not Be Evil", "Olfa Elharzalli", 10293, 1234567891L);
        Book book3 = new Book("Another Book", "Another Author", 500, 1234567892L);
        

        // Creating reader instances
        Reader reader1 = new Reader(1111L, "John", "Doe");
        Reader reader2 = new Reader(2222L, "Jane", "Doe");
        Reader boss = new Reader(22232L, "Rourou", "Ben");
        Reader boss2 = new Reader(232L, "Rourou", "Ben");

        // Creating library instance
        Library library = new Library();

        // Adding books to the library
        System.out.println("********* Adding Books to the Library *********");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Displaying books in the library
        System.out.println("List of books in the library: " + library.listOfBooks);
        System.out.println("Books map: " + library.booksMap);

        // Borrowing books
        System.out.println("********* Borrowing Books *********");
        library.borrowBook(reader1.getCIN(), book1);
        library.borrowBook(reader2.getCIN(), book2);
        library.borrowBook(boss.getCIN(), book3);
        library.borrowBook(boss2.getCIN(), book3);
        library.borrowBook(reader2.getCIN(), book3); // This should print that reader2 already has a book

        // Displaying borrowed books
        System.out.println("Borrowed books: " + library.borrowedBooks);

        // Returning books
        System.out.println("********* Returning Books *********");
        library.returnBook(reader1, book1);
        library.returnBook(reader2, book3); // This should print a message asking if the reader is donating

        // Displaying books in the library after returning
        System.out.println("List of books in the library after returning: " + library.listOfBooks);
        System.out.println("Books map after returning: " + library.booksMap);

        // Number of borrowed books
        System.out.println("Number of borrowed books: " + library.numberOfBorrowedBooks());
     // Count books to return in the next 7 days
        System.out.println("Number of books to return in the next 7 days: " + library.countBooksToReturnInNext7Days());
    }
	
	
	

}
