package hunting;

import java.util.Objects;

public class Main {
	@Override
	public boolean equals(Object o) {
		....
		CheckpointStatistics that = (CheckpointStatistics) o;
		return id == that.id &&
				savepoint == that.savepoint &&
				triggerTimestamp == that.triggerTimestamp &&
				lastestAckTimestamp == that.latestAckTimestamp &&
				stateSize == that.stateSize &&
				duration == that.duration &&
				alignmentBuffered == that.alignmentBuffered &&
				processedData == that.processedData &&
				persistedData == that.persistedData &&
				numSubtasks == that.numSubtasks &&
				numAckSubtasks == that.numAckSubtasks &&
				status == that.status &&
				Objects.equals(checkpointType, that.checkpointType) &&
				Objects.equals(checkpointStatisticsPerTask, that.checkpointStatisticsPerTask);
	}
}
