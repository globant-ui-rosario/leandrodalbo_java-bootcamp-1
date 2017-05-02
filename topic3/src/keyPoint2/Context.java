package keyPoint2;

import java.util.List;

public class Context {

	public String getResult(String word, int rowLength) {
		String result = new String();
		WordWrapper wordWrapper;
		List<String> words;
		if (rowLength > word.length()) {

			wordWrapper = new RowBiggerThanLength();
			words = wordWrapper.getWordWrappedRows(word, rowLength);

		} else {
			
			if (haveBlanks(word)) {
				wordWrapper = new RowShorterThanLengthWithBlanks();
				words = wordWrapper.getWordWrappedRows(word, rowLength);
			} else {
				wordWrapper = new RowShorterThanLengthWithOutBlanks();
				words = wordWrapper.getWordWrappedRows(word, rowLength);
			}
		}

		int i = 0;
		for (String myWord : words) {
			if (i != 0 && i < words.size()) {
				result += ",";
			}
			result += myWord;
			i++;
		}
		return result;
	}

	public boolean haveBlanks(String word) {
		int blanks = 0;
		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == ' ') {
				blanks++;
			}
		}

		return blanks > 0;
	}
}
