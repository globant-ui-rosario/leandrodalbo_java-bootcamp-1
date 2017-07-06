package oop2_2;

import java.util.ArrayList;
import java.util.List;

public class TestBook {

	public static void main(String[] args) {
		List<Author> authors = new ArrayList<Author>();
		authors.add(new Author("Leandro", "leadalbo@gmail.com", 'm'));
		authors.add(new Author("Lucy", "lucy@gmail.com", 'f'));
		authors.add(new Author("tomy lee", "tom@gmail.com", 'm'));
		Book book1 = new Book("Tomy and his friends", authors, 2.34);

		System.out.println(book1.toString());
		System.out.println(book1.getAuthorsNames());
	}
}
