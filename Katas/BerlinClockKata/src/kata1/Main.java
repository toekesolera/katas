package kata1;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		DigitalToBerlinTimeConverter converter = new DigitalToBerlinTimeConverter();
		BerlinToDigitalTimeConverter berlinConverter = new BerlinToDigitalTimeConverter();
		System.out.println(converter.convertTimeToBerlin("11:37:01"));
		System.out.println(berlinConverter.convertTimeToDigital("ORROOROOOYYRYYRYOOOOYYOO"));
	}
}
