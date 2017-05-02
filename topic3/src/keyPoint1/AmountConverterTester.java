package keyPoint1;

import org.junit.Test;
import static org.junit.Assert.*;

public class AmountConverterTester {

	@Test
	public void testSplitAmount() {

		AmountConverter amountConverter = new AmountConverter("23.34");
		assertEquals(23, amountConverter.getDigits());
		assertEquals(34, amountConverter.getCents());

		amountConverter = new AmountConverter("23.3434");
		assertEquals(23, amountConverter.getDigits());
		assertEquals(3434, amountConverter.getCents());

		amountConverter = new AmountConverter("23343488");
		assertEquals(23343488, amountConverter.getDigits());
		assertEquals(0, amountConverter.getCents());

	}

	@Test
	public void testHowManyDigits() {

		AmountConverter amountConverter = new AmountConverter("32345.4");
		assertEquals(amountConverter.howManyDigits(), 5);

		amountConverter = new AmountConverter("45.4");
		assertEquals(amountConverter.howManyDigits(), 2);
	}

	@Test
	public void printDifferentAmounts() {
		// print one digit number
		AmountConverter amountConverter = new AmountConverter("5.2");
		amountConverter.printIt();
		System.out.println();
		amountConverter = new AmountConverter("16.55");
		assertEquals(amountConverter.printIt(), " sixteen and 55/100 dollars");

		amountConverter = new AmountConverter("99.42");
		assertEquals(amountConverter.printIt(), " ninety nine and 42/100 dollars");

		amountConverter = new AmountConverter("78.4");
		assertEquals(amountConverter.printIt(), " seventy eight and 4/100 dollars");

		amountConverter = new AmountConverter("34.43");
		assertEquals(amountConverter.printIt(), " thirty four and 43/100 dollars");

		// print three digits numbers
		amountConverter = new AmountConverter("112.2");
		assertEquals(amountConverter.printIt(), " one hundred twelve and 2/100 dollars");

		amountConverter = new AmountConverter("614.3");
		assertEquals(amountConverter.printIt(), " six hundred fourteen and 3/100 dollars");

		// print four digits numbers
		amountConverter = new AmountConverter("4112.32");
		assertEquals(amountConverter.printIt(), " four thousand one hundred twelve and 32/100 dollars");

		amountConverter = new AmountConverter("9434.32");
		assertEquals(amountConverter.printIt(), " nine thousand four hundred thirty four and 32/100 dollars");

		// print five digits numbers
		amountConverter = new AmountConverter("88712.3");
		assertEquals(amountConverter.printIt(), " eighty eight thousand seven hundred twelve and 3/100 dollars");

		amountConverter = new AmountConverter("96634.32");
		assertEquals(amountConverter.printIt(), " ninety six thousand six hundred thirty four and 32/100 dollars");

		// print six digits numbers
		amountConverter = new AmountConverter("878712.2");
		assertEquals(amountConverter.printIt(), " eight hundred seventy eight thousand seven hundred twelve and 2/100 dollars");

		amountConverter = new AmountConverter("976634");
		assertEquals(amountConverter.printIt(), " nine hundred seventy six thousand six hundred thirty four and 0/100 dollars");

		// print seven digits numbers
		amountConverter = new AmountConverter("5398712");
		assertEquals(amountConverter.printIt(), " five millon three hundred ninety eight thousand seven hundred twelve and 0/100 dollars");

		amountConverter = new AmountConverter("1892394.23");
		assertEquals(amountConverter.printIt(),
				" one millon eight hundred ninety two thousand three hundred ninety four and 23/100 dollars");

		// print eight digits numbers
		amountConverter = new AmountConverter("23258712");
		assertEquals(amountConverter.printIt(),
				" twenty three millon two hundred fifty eight thousand seven hundred twelve and 0/100 dollars");

		amountConverter = new AmountConverter("21892394.32");
		assertEquals(amountConverter.printIt(),
				" twenty one millon eight hundred ninety two thousand three hundred ninety four and 32/100 dollars");

		// print nine digits numbers
		amountConverter = new AmountConverter("123258712.31");
		assertEquals(amountConverter.printIt(),
				" one hundred twenty three millon two hundred fifty eight thousand seven hundred twelve and 31/100 dollars");
	}

}