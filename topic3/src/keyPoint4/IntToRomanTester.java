package keyPoint4;

import org.junit.Test;

public class IntToRomanTester {

	@Test
	public void testOneToTen() {

		for (int i = 1; i <= 10; i++) {
			System.out.println(IntToRoman.convert(i));
		}
	}

	@Test
	public void testElevenToTwenty() {

		for (int i = 11; i <= 20; i++) {
			System.out.println(IntToRoman.convert(i));
		}
	}

	@Test
	public void testDificultCases() {

		System.out.println(IntToRoman.convert(1954));// MCMLIV
		System.out.println(IntToRoman.convert(1990));// MCMXC
		System.out.println(IntToRoman.convert(2014));// MMXIV
		System.out.println(IntToRoman.convert(22)); // XXII
		System.out.println(IntToRoman.convert(40));// XL
		System.out.println(IntToRoman.convert(90)); // XC
		System.out.println(IntToRoman.convert(400)); // CD
		System.out.println(IntToRoman.convert(900));// CM
		System.out.println(IntToRoman.convert(1904)); // MCMIV
		System.out.println(IntToRoman.convert(207));// CCVII
		System.out.println(IntToRoman.convert(1066)); // MLXVI
		System.out.println(IntToRoman.convert(20)); // XX

	}
}
