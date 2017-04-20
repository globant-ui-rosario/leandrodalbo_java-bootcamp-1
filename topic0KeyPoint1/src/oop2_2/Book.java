package oop2_2;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private String name;
	private List<Author> listOfAuthors = new ArrayList<Author>();
	private double price;
	private int qty;

	public Book(String name, List<Author> listOfAuthors, double price) {

		this.name = name;
		this.listOfAuthors = listOfAuthors;
		this.price = price;

	}

	public Book(String name, List<Author> listOfAuthors, double price, int qty) {

		this.name = name;
		this.listOfAuthors = listOfAuthors;
		this.price = price;
		this.qty = qty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public List<Author> getListOfAuthors() {
		return listOfAuthors;
	}

	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();

		stringBuilder.append("Book[name=");
		stringBuilder.append(this.getName()); 
		stringBuilder.append(",authors={");

		for (Author author : this.getListOfAuthors()) {
			stringBuilder.append("[name=");
			stringBuilder.append(author.getName());
			stringBuilder.append(",email=");
			stringBuilder.append(author.getEmail());
			stringBuilder.append(",gender=");
			stringBuilder.append(author.getGender());
			stringBuilder.append("]");
		}
		stringBuilder.append("},price=");
		stringBuilder.append(this.getPrice());
		stringBuilder.append("qty=");
		stringBuilder.append(this.getQty());
		stringBuilder.append("]");

		return stringBuilder.toString();
	}

	public String getAuthorsNames() {
		StringBuilder stringBuilder = new StringBuilder();
		for (Author author : this.getListOfAuthors()) {
			stringBuilder.append(author.getName() + " ");
		}
		return stringBuilder.toString();
	}
}
