package keyPoint4;

import org.junit.Test;

public class RomanToIntTester {

	@Test
	public void testSimpleNumbers() {

		RomanToInt romanToInt = new RomanToInt();
		System.out.println(romanToInt.convert("I"));
		System.out.println(romanToInt.convert("V"));
		System.out.println(romanToInt.convert("X"));
		System.out.println(romanToInt.convert("L"));
		System.out.println(romanToInt.convert("C"));
		System.out.println(romanToInt.convert("D"));
		System.out.println(romanToInt.convert("M"));
	}

	@Test
	public void testOne_to_ten() {

		RomanToInt romanToInt = new RomanToInt();
		System.out.println(romanToInt.convert("I"));
		System.out.println(romanToInt.convert("II"));
		System.out.println(romanToInt.convert("III"));
		System.out.println(romanToInt.convert("IV"));
		System.out.println(romanToInt.convert("V"));
		System.out.println(romanToInt.convert("VI"));
		System.out.println(romanToInt.convert("VII"));
		System.out.println(romanToInt.convert("VIII"));
		System.out.println(romanToInt.convert("IX"));
		System.out.println(romanToInt.convert("X"));

	}

	@Test
	public void test11_to_20() {

		RomanToInt romanToInt = new RomanToInt();
		System.out.println(romanToInt.convert("XI"));
		System.out.println(romanToInt.convert("XII"));
		System.out.println(romanToInt.convert("XIII"));
		System.out.println(romanToInt.convert("XIV"));
		System.out.println(romanToInt.convert("XV"));
		System.out.println(romanToInt.convert("XVI"));
		System.out.println(romanToInt.convert("XVII"));
		System.out.println(romanToInt.convert("XVIII"));
		System.out.println(romanToInt.convert("XIX"));
		System.out.println(romanToInt.convert("XX"));

	}

	@Test
	public void testDificultCases() {

		RomanToInt romanToInt = new RomanToInt();
		System.out.println(romanToInt.convert("MCMLIV"));
		System.out.println(romanToInt.convert("MCMXC"));
		System.out.println(romanToInt.convert("MMXIV"));
		System.out.println(romanToInt.convert("XXII"));
		System.out.println(romanToInt.convert("XL"));
		System.out.println(romanToInt.convert("XC"));
		System.out.println(romanToInt.convert("CD"));
		System.out.println(romanToInt.convert("CM"));
		System.out.println(romanToInt.convert("MCMIV"));
		System.out.println(romanToInt.convert("CCVII"));
		System.out.println(romanToInt.convert("MLXVI"));
		System.out.println(romanToInt.convert("XIXI"));
	}
}
