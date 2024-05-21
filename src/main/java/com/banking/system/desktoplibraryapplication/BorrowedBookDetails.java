package com.banking.system.desktoplibraryapplication;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BorrowedBookDetails {
	Book borrowedbook;
	LocalDate borrowedDate;
	LocalDate returnDate;
	public BorrowedBookDetails(Book borrowedbook, LocalDate borrowedDate) {
		super();
		this.borrowedbook = borrowedbook;
		this.borrowedDate = borrowedDate;
        this.returnDate = this.borrowedDate.plus(7,ChronoUnit.DAYS);
	}
	public Book getBorrowedbook() {
		return borrowedbook;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	
	

}
