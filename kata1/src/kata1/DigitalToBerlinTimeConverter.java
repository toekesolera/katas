package kata1;

import java.util.stream.Stream;

public class DigitalToBerlinTimeConverter {
	public String convertSingleMinutesRow(String time) {
        int minutesRow = Stream.of(time.split(":")).mapToInt(Integer::parseInt).toArray()[1];
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
}
