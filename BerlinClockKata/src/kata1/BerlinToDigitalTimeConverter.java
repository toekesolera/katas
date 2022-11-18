package kata1;

public class BerlinToDigitalTimeConverter {
	public String convertTimeToDigital(String berlinTime) {
		char[] berlinTimeArray = berlinTime.toCharArray();
		String seconds = (berlinTimeArray[0] == 'Y') ? "00" : "01";
		
		int hoursNumber = 0;
		for (int i = 1; i < 5; i++) {
			if (berlinTimeArray[i] == 'R') {
				hoursNumber += 5;
			}
			if (berlinTimeArray[i + 4] == 'R') {
				hoursNumber++;
			}
		}
		
		int minutesNumber = 0;
		for (int i = 9; i < 20; i++) {
			if (berlinTimeArray[i] != 'O') {
				minutesNumber += 5;
			}
		}
		for (int i = 20; i < 24; i++) {
			if (berlinTimeArray[i] != 'O') {
				minutesNumber++;
			}
		}
		String hours = (hoursNumber >= 10) ? String.valueOf(hoursNumber)
				: "0" + String.valueOf(hoursNumber);
		String minutes = (minutesNumber >= 10) ? String.valueOf(minutesNumber)
				: "0" + String.valueOf(minutesNumber);
		
		return hours + ":" + minutes + ":" + seconds;
	}
}
