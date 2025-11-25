package chatgpt.class01;

public class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}
	
	public void printInfo() {
		System.out.println("제목 : " + title + " / 저자 : " + author);
	}
	
}
