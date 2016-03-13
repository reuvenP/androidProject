package com.example.shmuel.javaproject;

/**
 * Created by shmuel on 08/03/2016.
 */
public class Book {
	String title;

	public Book(String title, int bookID, int year, String author, int pages, float price) {
		this.title = title;
		this.bookID = bookID;
		this.year = year;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	int bookID;
	int year;
	String author;
	int pages;
	float price;
}
