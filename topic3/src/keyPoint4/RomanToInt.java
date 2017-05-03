package keyPoint4;

import java.util.Hashtable;
import java.util.Map;

public class RomanToInt {

	private Map<Character, Integer> romanNumbers = new Hashtable<Character, Integer>();

	public RomanToInt() {
		romanNumbers.put('I', 1);
		romanNumbers.put('V', 5);
		romanNumbers.put('X', 10);
		romanNumbers.put('L', 50);
		romanNumbers.put('C', 100);
		romanNumbers.put('D', 500);
		romanNumbers.put('M', 1000);

	}

	public int convert(String number) {

		int last = romanNumbers.get(number.charAt(0));
		int act = romanNumbers.get(number.charAt(0));

		int finalNumber = act;

		if (number.length() > 1) {
			for (int i = 1; i < number.length(); i++) {

				act = romanNumbers.get(number.charAt(i));

				if (act <= last) {

					finalNumber += act;

				} else if (act > last) {
					finalNumber -=last;
					finalNumber +=act-last;
				} 
				last = act;
			}
		}
		return finalNumber;

	}
}
