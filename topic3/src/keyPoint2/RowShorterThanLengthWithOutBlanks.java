package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class RowShorterThanLengthWithOutBlanks implements WordWrapper {
	@Override
	public List<String> getWordWrappedRows(String word, int rowLength) {

		List<String> list = new ArrayList<String>();
		String word2 = new String();
		int myRowLength = 0;
		for (int i = 0; i < word.length(); i++) {

			if (myRowLength < rowLength) {
				word2 += word.charAt(i);
				myRowLength++;
			}
			if (myRowLength >= rowLength) {

				list.add(word2);

				if (myRowLength == rowLength) {
					word2 = new String();
					myRowLength = 0;
				}
				if (myRowLength > rowLength) {
					Character character = word.charAt(i);
					word2 = new String(character.toString());
					myRowLength = 1;
				}
			}

			if (myRowLength <= rowLength && word.length() - 1 == i) {

				list.add(word2);
			}
		}

		return list;
	}
}
