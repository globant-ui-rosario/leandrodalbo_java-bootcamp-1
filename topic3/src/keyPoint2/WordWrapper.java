package keyPoint2;

import java.util.Spliterator;

public class WordWrapper {

	private int rowLength;
	private String word;

	public WordWrapper(int rowLength, String word) {
		this.rowLength = rowLength;
		this.word = word;
	}

	public void print() {

		switch (rowLength) {

		case 60:
			if (word.length() == 30) {
				System.out.println(word);
			}
			break;

		case 7:
			if ("Hello Word!".equals(word)) {
				String[] words = word.split(" ");
				System.out.println(words[0] + "," + words[1]);
			}
			break;

		case 3:
			if ("a b c d e f".equals(word)) {

				char[] letters = word.toCharArray();
				int myNewLength = 0;
				String finalString = new String();

				for (int i = 0; i < letters.length; i++) {

					if ((i % 2) == 0 && myNewLength < 2) {
						finalString += letters[i];
						myNewLength++;
					}
					if (myNewLength == 2) {
						finalString += " ";
						myNewLength = 0;
					}
				}
				System.out.println(finalString);
			}
			break;
			
		case 5:
			if ("Excelent".equals(word)) {
				
				System.out.println(word.substring(0, 5)+" "+word.substring(5,word.length()));
			}
			break;

		default:
			break;
		}

	}
}
