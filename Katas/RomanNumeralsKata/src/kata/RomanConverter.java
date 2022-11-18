package kata;

public class RomanConverter {
	
	public String convertNumberToRoman(int number) {
		StringBuilder romanNumeral = new StringBuilder();
		while (number > 1000) {
			romanNumeral.append("M");
			number -= 1000;
		}
		
		if ((number / 100) % 5 == 4) {
			romanNumeral.append("C");
			if ((number / 100) > 5) {
				romanNumeral.append("M");
				number -= 900;
			} else {
				romanNumeral.append("D");
				number -= 400;
			}
		}
		
		if (number > 500) {
			romanNumeral.append("D");
			number -= 500;
		}
		
		while (number > 100) {
			romanNumeral.append("C");
			number -= 100;
		}
		
		if ((number / 10) % 5 == 4) {
			romanNumeral.append("X");
			if ((number / 10) > 5) {
				romanNumeral.append("C");
				number -= 90;
			} else {
				romanNumeral.append("L");
				number -= 40;
			}
		}
		
		if (number > 50) {
			romanNumeral.append("L");
			number -= 50;
		}
		
		while (number > 10) {
			romanNumeral.append("X");
			number -= 10;
		}
		
		if (number % 5 == 4) {
			romanNumeral.append("I");
			if (number > 5) {
				romanNumeral.append("X");
				number -= 9;
			} else {
				romanNumeral.append("V");
				number -= 4;
			}
		}
		
		if (number > 5) {
			romanNumeral.append("V");
			number -= 5;
		}
		
		while (number > 0) {
			romanNumeral.append("I");
			number -= 1;
		}
		
		return romanNumeral.toString();
	}
	
	public int basicRomanToNumber(char numeral) {
		if (numeral == 'M') return 1000;
		if (numeral == 'D') return 500;
		if (numeral == 'C') return 100;
		if (numeral == 'L') return 50;
		if (numeral == 'X') return 10;
		if (numeral == 'V') return 5;
		if (numeral == 'I') return 1;
		return 0;
	}
	
	public int convertRomanToNumber(String romanNumeral) {
		char[] romanArray = romanNumeral.toCharArray();
		int[] basicConvertedArray = new int[romanArray.length];
		for (int i = 0; i < romanArray.length; i++) {
			basicConvertedArray[i] = basicRomanToNumber(romanArray[i]);
		}
		int number = 0;
		for (int i = 0; i < basicConvertedArray.length; i++) {
			if (i < basicConvertedArray.length - 1 && 
					basicConvertedArray[i] < basicConvertedArray[i+1]) {
					number -= basicConvertedArray[i];
				} else {
					number += basicConvertedArray[i];
				}
			}
		return number;
	}
}
