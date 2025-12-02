package chap13.homework01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookController {
	List<Book> BookList = new ArrayList<Book>();
	
	
	public BookController() {
		BookList.add(new Book("느리게 나이드는 습관", "정희원", "인문", 16200));
		BookList.add(new Book("코스모스", "칼 세이건", "자연과학", 17910));
		BookList.add(new Book("나에게 들려주는 예쁜 말", "김종원", "어린이", 15610));
		BookList.add(new Book("혼자 공부하는 자바", "신용권", "기타", 25240));
	}
	
	public void insertBook(Book bk) {
		BookList.add(bk);
	}
	
	public List<Book> selectList() {
		return BookList;
	}
	
	public List<Book> searchBook(String keyword) {
		List<Book> searchList = new ArrayList<Book>();
		for (Book book : BookList) {
			if (book.getTitle().contains(keyword)) {
				searchList.add(book);
			} 
		}	return searchList;	
	}
	
	public Book deleteBook(String title, String author) {
		Book removeBook = new Book();
		for (Book book : BookList) {
			if (book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author)) {
				BookList.remove(book);
				removeBook = book;
			}
		}	return removeBook;
	}
	
	public int ascBook() {
		Collections.sort(BookList);
		return 1;
	}
	
	
	
	
	
	
	
	
}