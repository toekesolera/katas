package hunting;

public class Main {
	public void logSargResult(int stripeIx, boolean[] rgsToRead) {
		....
		for (int i = 0, valOffset = 0; i < elements; ++i, valOffset += 64) {
			long val = 0;
			for (int j = 0; j < 64; ++j) {
				int ix = valOffset + j;
				if (rgsToRead.length == ix) break;
				if (!rgsToRead[ix]) continue;
				val = val | (1 << j);
			}
			....
		}
		....
	}
}
