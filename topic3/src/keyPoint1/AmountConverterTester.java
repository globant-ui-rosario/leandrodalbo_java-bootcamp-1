package keyPoint1;

import org.junit.Test;

public class AmountConverterTester {

	@Test
	public void testSplitAmount() {
		AmountConverter amountConverter = new AmountConverter("23.34");
		System.out.println(amountConverter.getDigits() + " " + amountConverter.getCents());

		amountConverter = new AmountConverter("23.3434");
		System.out.println(amountConverter.getDigits() + " " + amountConverter.getCents());

		amountConverter = new AmountConverter("23343488");
		System.out.println(amountConverter.getDigits() + " " + amountConverter.getCents());

	}

	@Test
	public void testHowManyDigits() {

		AmountConverter amountConverter = new AmountConverter("32345.4");
		if (amountConverter.howManyDigits() == 5) {
			System.out.println("ok");
		}

		amountConverter = new AmountConverter("45.4");
		if (amountConverter.howManyDigits() == 2) {
			System.out.println("ok");
		}
	}

	@Test
	public void printDifferentAmounts() {
		// print one digit number
		AmountConverter amountConverter = new AmountConverter("5.2");
		amountConverter.printIt();
		System.out.println();

		// print two digits numbers
		amountConverter = new AmountConverter("12.4");
		amountConverter.printIt();
		System.out.println();
		amountConverter = new AmountConverter("16.55");
		amountConverter.printIt();
		System.out.println();
		amountConverter = new AmountConverter("58.55");
		amountConverter.printIt();
		System.out.println();
		amountConverter = new AmountConverter("99.42");
		amountConverter.printIt();
		System.out.println();
		amountConverter = new AmountConverter("78.4");
		amountConverter.printIt();
		System.out.println();
		amountConverter = new AmountConverter("34.43");
		amountConverter.printIt();
		System.out.println();

		// print three digits numbers
		amountConverter = new AmountConverter("112.2");
		amountConverter.printIt();
		System.out.println();

		amountConverter = new AmountConverter("614.3");
		amountConverter.printIt();
		System.out.println();

		// print four digits numbers
		amountConverter = new AmountConverter("4112.32");
		amountConverter.printIt();
		System.out.println();

		amountConverter = new AmountConverter("9434.32");
		amountConverter.printIt();
		System.out.println();

		// print five digits numbers
		amountConverter = new AmountConverter("88712.3");
		amountConverter.printIt();
		System.out.println();

		amountConverter = new AmountConverter("96634.32");
		amountConverter.printIt();
		System.out.println();

		// print six digits numbers
		amountConverter = new AmountConverter("878712.2");
		amountConverter.printIt();
		System.out.println();

		amountConverter = new AmountConverter("976634");
		amountConverter.printIt();
		System.out.println();

		// print seven digits numbers
		amountConverter = new AmountConverter("5398712");
		amountConverter.printIt();
		System.out.println();

		amountConverter = new AmountConverter("1892394.23");
		amountConverter.printIt();
		System.out.println();

		// print eight digits numbers
		amountConverter = new AmountConverter("23258712");
		amountConverter.printIt();
		System.out.println();

		amountConverter = new AmountConverter("21892394.32");
		amountConverter.printIt();
		System.out.println();

		// print nine digits numbers
		amountConverter = new AmountConverter("123258712.31");
		amountConverter.printIt();
		System.out.println();



	}

}