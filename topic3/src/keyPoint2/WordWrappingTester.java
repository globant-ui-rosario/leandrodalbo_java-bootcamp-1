package keyPoint2;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrappingTester {

	@Test
	public void testCase0() {
		Context context = new Context();
		assertEquals(context.getResult("just a phrase with thirty c...", 60), "just a phrase with thirty c...");
	}

	@Test
	public void testCase_1() {

		Context context = new Context();
		assertEquals(context.getResult("Hello Word!", 7), "Hello,Word!");
	}

	@Test
	public void test3_abcdef() {
		Context context = new Context();
		assertEquals(context.getResult("a b c d e f", 3), "ab,cd,ef");

	}

	@Test
	public void test5_excelent() {

		Context context = new Context();
		assertEquals(context.getResult("Excelent", 5), "Excel,ent");
	}
}
