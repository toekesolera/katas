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
}
