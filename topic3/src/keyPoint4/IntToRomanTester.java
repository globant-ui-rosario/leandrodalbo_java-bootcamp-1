package keyPoint4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IntToRomanTester {

	@Test
	public void testOneToTen() {
		assertEquals("I", IntToRoman.convert(1));
		assertEquals("II", IntToRoman.convert(2));
		assertEquals("III", IntToRoman.convert(3));
		assertEquals("IV", IntToRoman.convert(4));
		assertEquals("V", IntToRoman.convert(5));
		assertEquals("VI", IntToRoman.convert(6));
		assertEquals("VII", IntToRoman.convert(7));
		assertEquals("VIII", IntToRoman.convert(8));
		assertEquals("IX", IntToRoman.convert(9));
		assertEquals("X", IntToRoman.convert(10));

	}

	@Test
	public void testDificultCases() {

		assertEquals(IntToRoman.convert(1954), "MCMLIV");
		assertEquals(IntToRoman.convert(1990), "MCMXC");
		assertEquals(IntToRoman.convert(2014), "MMXIV");
		assertEquals(IntToRoman.convert(22),"XXII");
		assertEquals(IntToRoman.convert(40),"XL");
		assertEquals(IntToRoman.convert(90),"XC");
		assertEquals(IntToRoman.convert(400),"CD");
		assertEquals(IntToRoman.convert(900),"CM");
		assertEquals(IntToRoman.convert(1904),"MCMIV");
		assertEquals(IntToRoman.convert(207),"CCVII");
		assertEquals(IntToRoman.convert(1066),"MLXVI");
		assertEquals(IntToRoman.convert(20),"XX");

	}
}
