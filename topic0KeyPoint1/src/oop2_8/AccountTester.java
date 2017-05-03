package oop2_8;

public class AccountTester {

	public static void main(String[] args) {
		// Just for test account
		Account acc = new Account(001, new Customer(001, "lucy", 0));

		System.out.println(acc.getId() + "/" + acc.getCustomer().toString() + "/" + acc.getBalance());
		acc.setBalance(20);
		System.out.println(acc.toString());
		System.out.println(acc.getCustomerName());
		System.out.println(acc.deposit(33).toString());
		System.out.println(acc.withdraw(565).toString());

	}
}
