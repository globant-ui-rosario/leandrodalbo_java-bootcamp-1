package oop2_8;

public class CustomerTester {

	public static void main(String[] args) {
		/*
		 * This has been written with the purpose of testing the class Customer
		 */
		Customer c1 = new Customer(001, "leacustomer", 0);
		System.out.println(c1.getId());
		System.out.println(c1.getName());
		System.out.println(c1.getGender());
		System.out.println(c1.toString());
	}

}
