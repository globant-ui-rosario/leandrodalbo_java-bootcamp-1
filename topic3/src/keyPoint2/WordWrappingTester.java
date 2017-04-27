package keyPoint2;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrappingTester {

	@Test
	public void test60_70() {

		WordWrapper wordWrapper = new WordWrapper(60, "just a phrase with thirty c...");
		wordWrapper.print();

	}

	@Test
	public void test7_hw() {

		WordWrapper wordWrapper = new WordWrapper(7, "Hello Word!");
		wordWrapper.print();

	}

	@Test
	public void test3_abcdef() {

		WordWrapper wordWrapper = new WordWrapper(3, "a b c d e f");
		wordWrapper.print();

	}

	@Test
	public void test5_excelent() {

		WordWrapper wordWrapper = new WordWrapper(5, "Excelent");
		wordWrapper.print();

	}
}
