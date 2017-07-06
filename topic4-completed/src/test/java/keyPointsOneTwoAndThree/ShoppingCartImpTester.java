package keyPointsOneTwoAndThree;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class ShoppingCartImpTester {

	@Test
	public void testGetAndSetListOfItems() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		List<Item> myItems = new ArrayList<Item>();
		for (int i = 0; i <= 10; i++) {
			myItems.add(new Item(1));
		}
		shoppingCart.addAlistOfItems(myItems);

		assertEquals(myItems, shoppingCart.getAlistOfItems());

	}

	@Test
	public void testAddAnItemToTheList() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		Item item = new Item(1);
		shoppingCart.addAnItemToTheList(item);
		assertEquals(shoppingCart.getAnItemFromTheList(item), item);

	}

	@Test
	public void testDeleteAnItemToTheList() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		Item item = new Item(1);
		shoppingCart.addAnItemToTheList(item);
		assertEquals(shoppingCart.getAnItemFromTheList(item), item);
		shoppingCart.deleteAnItemFromTheList(item);
		assertEquals(shoppingCart.getAnItemFromTheList(item), null);

	}

	@Test
	public void testGetAndSetAcustomer() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		Customer customer = new Customer();
		shoppingCart.setTheCustomer(customer);
		assertEquals(shoppingCart.getTheCustomer(), customer);

	}

	
	@Test
	public void testGetTotalAmount() {
		ShoppingCart shoppingCart = new ShoppingCartImp();
		List<Item> myItems = new ArrayList<Item>();
		double myTotalAmount = 0;
		
		for (int i = 0; i <= 10; i++) {
			myItems.add(new Item(1, i));
			myTotalAmount +=i;
		}
		
		
		shoppingCart.addAlistOfItems(myItems);
		assertEquals(new Double(myTotalAmount),new Double(shoppingCart.getTotalAmount()));
		
	}

}
