package kata1;

import java.util.stream.Stream;

public class DigitalToBerlinTimeConverter {
	
	public String convertSingleMinutesRow(int minutesRow) {
        int numberOfYs = minutesRow % 5;
        StringBuilder singleMinutesRow = new StringBuilder();
        for (int i = 0; i < 4; i++) {
        	if (numberOfYs > 0) {
        		singleMinutesRow.append("Y");
        	} else {
        		singleMinutesRow.append("O");
        	}
        	numberOfYs--;
        }
        return singleMinutesRow.toString();
	}
	
	public String convertFiveMinutesRow(int minutesRow) {
		int numberOfYRs = minutesRow / 5;
		StringBuilder fiveMinutesRow = new StringBuilder();
		for (int i = 0; i < 11; i++) {
			if (numberOfYRs > 0) {
				if ((i + 1) % 3 == 0) {
					fiveMinutesRow.append("R");
				} else {
					fiveMinutesRow.append("Y");
				}
			} else {
				fiveMinutesRow.append("O");
			}
			numberOfYRs--;
		}
		return fiveMinutesRow.toString();
	}

	public String convertSingleHoursRow(int hoursRow) {
		int numberOfRs = hoursRow % 5;
        StringBuilder singleMinutesRow = new StringBuilder();
        for (int i = 0; i < 4; i++) {
        	if (numberOfRs > 0) {
        		singleMinutesRow.append("R");
        	} else {
        		singleMinutesRow.append("O");
        	}
        	numberOfRs--;
        }
        return singleMinutesRow.toString();
	}
	
	public String convertFiveHoursRow(int hoursRow) {
		int numberOfRs = hoursRow / 5;
        StringBuilder singleMinutesRow = new StringBuilder();
        for (int i = 0; i < 4; i++) {
        	if (numberOfRs > 0) {
        		singleMinutesRow.append("R");
        	} else {
        		singleMinutesRow.append("O");
        	}
        	numberOfRs--;
        }
        return singleMinutesRow.toString();
	}
	
	public String convertSecondsRow(int secondsRow) {
		return (secondsRow % 2 == 0) ? "Y" : "O";
	}
	public String convertTime(String time) {
		int[] timeRows = Stream.of(time.split(":")).mapToInt(Integer::parseInt).toArray();
		int hoursRow = timeRows[0];
		int minutesRow = timeRows[1];
		int secondsRow = timeRows[2];
		StringBuilder convertedTime = new StringBuilder();
		convertedTime.append(convertSecondsRow(secondsRow));
		convertedTime.append(convertFiveHoursRow(hoursRow));
		convertedTime.append(convertSingleHoursRow(hoursRow));
		convertedTime.append(convertFiveMinutesRow(minutesRow));
		convertedTime.append(convertSingleMinutesRow(minutesRow));
		
		return convertedTime.toString();
	}
	

}
