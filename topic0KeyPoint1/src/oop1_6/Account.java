package oop1_6;

public class Account {

	private String id;
	private String name;
	private int balance;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public int credit(int amount) {

		this.balance += amount;
		return this.balance;
	}

	public int debit(int amount) {
		if (amount <= this.getBalance()) {
			this.balance -= amount;
		} else {
			System.out.println("Amount exceeded balance");
		}

		return balance;
	}

	public int transferTo(Account account, int amount) {
		if (amount <= this.getBalance()) {
			// transfer amount to to the given account
		} else {
			System.out.println("Amount exceeded balance");
		}

		return this.getBalance();
	}

	public String toString() {
		return "Account[id=" + this.getId() + ", name=" + this.getName() + ",balance=" + this.getBalance() + "]";
	}
}