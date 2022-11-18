package kata1;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		DigitalToBerlinTimeConverter converter = new DigitalToBerlinTimeConverter();
		System.out.println(converter.convertSingleMinutesRow("23:33:59"));
	}
}
