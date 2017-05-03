package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class RowShorterThanLengthWithBlanks implements WordWrapper {

	@Override
	public List<String> getWordWrappedRows(String word, int rowLength) {

		List<String> list = new ArrayList<String>();
		String word2 = new String();
		int myRowLength = 1;
		if (this.howManyBlanks(word) > 1) {

			for (int i = 0; i < word.length(); i++) {

				if (myRowLength < rowLength && word.charAt(i) != ' ') {
					word2 += word.charAt(i);
					myRowLength++;
				}
				
				if (myRowLength >= rowLength) {

					list.add(word2);
					myRowLength = 1;
					word2 = new String();
				}
			}
		}

		if (this.howManyBlanks(word) == 1) {
			String[] words = word.split(" ");
			list.add(words[0]);
			list.add(words[1]);

		}

		return list;

	}

	public int howManyBlanks(String word) {

		int blanks = 0;
		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == ' ') {
				blanks++;
			}
		}

		return blanks;

	}

}
