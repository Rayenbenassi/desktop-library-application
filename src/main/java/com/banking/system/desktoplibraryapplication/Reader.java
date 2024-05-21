package com.banking.system.desktoplibraryapplication;

public class Reader {
	private long CIN;
	private String name;
	private String lastName;
	public Reader(long cIN, String name, String lastName) {
		super();
		CIN = cIN;
		this.name = name;
		this.lastName = lastName;
	}
	public Reader() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Reader [CIN=" + CIN + ", name=" + name + ", lastName=" + lastName + "]";
	}
	public long getCIN() {
		return CIN;
	}
	public void setCIN(long cIN) {
		CIN = cIN;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	

}
