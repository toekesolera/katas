package kata;

public class Main {
	public static void main (String[] args) {
		RomanConverter converter = new RomanConverter();
		System.out.println(converter.convertNumberToRoman(1989));
		System.out.println(converter.convertRomanToNumber("MCMLXXXIX"));
	}
}
