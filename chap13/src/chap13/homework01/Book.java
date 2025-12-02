package chap13.homework01;

import chap13.sec01.exam02.Student;

public class Book implements Comparable<Book>{
	private String title;
	private	String author;
	private String category;
	private int price;
	
	public Book() {
	}

	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	@Override
	public String toString() {
		return title + "(" + author + ")" + ", " + category + ", " + price;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public int compareTo(Book other) {	
		return this.title.compareTo(other.title);
	}
	
}
