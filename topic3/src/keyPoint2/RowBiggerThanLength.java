package keyPoint2;

import java.util.ArrayList;
import java.util.List;

public class RowBiggerThanLength implements WordWrapper {

	@Override
	public List<String> getWordWrappedRows(String word, int rowLength) {
		List<String> list = new ArrayList<String>();
		list.add(word);
		return list;
	}

}
