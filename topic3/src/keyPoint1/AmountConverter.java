package keyPoint1;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AmountConverter {

	static final String[] numberNames = { " zero", " one", " two", " three", " four", " five", " six", " seven", " eight", " nine", " ten",
			" eleven", " twelve", " thirteen", " fourteen", " fifteen", " sixteen", " seventeen", " eighteen", " nineteen" };

	static final String[] tensNames = { " zero", " ten", " twenty", " thirty", " forty", " fifty", " sixty", " seventy", " eighty",
			" ninety" };

	private int digits;
	private int cents;

	public AmountConverter(String amount) {
		BigDecimal amBigDecimal = new BigDecimal(amount);
		this.digits = amBigDecimal.intValue();
		this.cents = amBigDecimal.subtract(amBigDecimal.setScale(0, RoundingMode.FLOOR)).movePointRight(amBigDecimal.scale()).intValue();
	}

	public int getDigits() {

		return this.digits;
	}

	public int getCents() {

		return this.cents;

	}

	public int howManyDigits() {
		int numberOfDigits = 0;
		int number = this.getDigits();

		while (number != 0) {

			number = number / 10;
			numberOfDigits++;

		}

		return numberOfDigits;

	}

	public void printIt() {
		switch (this.howManyDigits()) {
		case 1:
			printOneDigitNumber(this.getDigits());
			break;

		case 2:
			printTwoDigitsNumber(this.getDigits());
			break;

		case 3:
			printThreeDigitsNumber(this.getDigits());
			break;

		case 4:
			printFourDigitsNumber(this.getDigits());
			break;

		case 5:
			printFiveDigitsNumber(this.getDigits());
			break;
		case 6:
			printSixDigitsNumber(this.getDigits());
			break;

		case 7:
			printSevenDigitsNumber(this.getDigits());
			break;

		case 8:
			printEightDigitsNumber(this.getDigits());
			break;

		case 9:
			printNineDigitsNumber(this.getDigits());
			break;

		}
		System.out.print(" and "+this.getCents()+"/100 dollars");
	}

	public void printOneDigitNumber(int number) {

		System.out.print(numberNames[number]);

	}

	private void printTwoDigitsNumber(int number) {

		if (number < 20) {

			System.out.print(numberNames[number]);

		} else {

			int position = number / 10;

			System.out.print(tensNames[position]);

			if ((number % 10) > 0) {

				position = number % 10;
				System.out.print(numberNames[position]);
			}
		}
	}

	private void printThreeDigitsNumber(int number) {

		if ((number / 100) > 0) {

			int position = number / 100;
			System.out.print(numberNames[position] + " hundred");
			int twoDigits = number % 100;
			this.printTwoDigitsNumber(twoDigits);
		}
	}

	private void printFourDigitsNumber(int number) {

		if ((number / 1000) > 0) {

			int position = number / 1000;
			System.out.print(numberNames[position] + " thousand");
			int threeDigitsNumber = number % 1000;
			this.printThreeDigitsNumber(threeDigitsNumber);

		}

	}

	private void printFiveDigitsNumber(int number) {

		if ((number / 1000) > 0) {
			int twoDigitsNumber = number / 1000;
			this.printTwoDigitsNumber(twoDigitsNumber);
			System.out.print(" thousand");
			int threeDigitsNumber = number % 1000;
			this.printThreeDigitsNumber(threeDigitsNumber);
		}

	}

	private void printSixDigitsNumber(int number) {

		if ((number / 1000) > 0) {
			int threeDigitsNumber = number / 1000;
			this.printThreeDigitsNumber(threeDigitsNumber);
			System.out.print(" thousand");
			threeDigitsNumber = number % 1000;
			this.printThreeDigitsNumber(threeDigitsNumber);
		}

	}

	private void printSevenDigitsNumber(int number) {

		if ((number / 1000000) > 0) {
			int position = number / 1000000;
			System.out.print(numberNames[position] + " millon");
			int sixDigitsNumber = number % 1000000;
			this.printSixDigitsNumber(sixDigitsNumber);
		}

	}

	private void printEightDigitsNumber(int number) {
		if ((number / 1000000) > 0) {
			int twoDigitsNumber = number / 1000000;
			this.printTwoDigitsNumber(twoDigitsNumber);
			System.out.print(" millon");
			int sixDigitsNumber = number % 1000000;
			this.printSixDigitsNumber(sixDigitsNumber);
		}
	}

	private void printNineDigitsNumber(int number) {
		if ((number / 1000000) > 0) {
			int threeDigitsNumber = number / 1000000;
			this.printThreeDigitsNumber(threeDigitsNumber);
			System.out.print(" millon");
			int sixDigitsNumber = number % 1000000;
			this.printSixDigitsNumber(sixDigitsNumber);
		}

	}

}
