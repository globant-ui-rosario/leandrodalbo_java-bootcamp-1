package keyPoint4;

public class IntToRoman {

	public static String convert(int number) {

		StringBuilder stringBuilder = new StringBuilder("");
		while (number != 0) {
			if (number >= 1000) {
				stringBuilder.append("M");
				number -= 1000;
			}
			if (number >= 900 && number<1000) {
				stringBuilder.append("CM");
				number -= 900;
			}
			if (number >= 500 && number<900) {
				stringBuilder.append("D");
				number -= 500;
			}
			if (number >= 400 && number<500) {
				stringBuilder.append("CD");
				number -= 400;
			}
			if (number >= 100 && number<400) {
				stringBuilder.append("C");
				number -= 100;
			}
			if (number >= 90 && number<100) {
				stringBuilder.append("XC");
				number -= 90;
			}
			if (number >= 50 && number<90) {
				stringBuilder.append("L");
				number -= 50;
			}
			if (number >= 40 && number<50) {
				stringBuilder.append("XL");
				number -= 40;
			}
			if (number >= 10 && number<40) {
				stringBuilder.append("X");
				number -= 10;
			}
			if (number >= 9 && number<10) {
				stringBuilder.append("IX");
				number -= 9;
			}
			if (number >= 5 && number<9) {
				stringBuilder.append("V");
				number -= 5;
			}
			if (number >= 4 && number<5) {
				stringBuilder.append("IV");
				number -= 4;
			}
			if (number >= 1 && number<4) {
				stringBuilder.append("I");
				number -= 1;
			}
		}
		return stringBuilder.toString();
	}

}
