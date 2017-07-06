package keyPointsOneTwoAndThree;

public class Item {

	private int itemId;
	private double price;

	public Item(int itemId) {

		this.itemId = itemId;
	}

	public Item(int itemId, double price) {

		this.itemId = itemId;
		this.price = price;

	}

	public int getItemId() {

		return this.itemId;

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
