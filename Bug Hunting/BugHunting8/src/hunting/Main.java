package hunting;

public class Main {
	private void shiftRightDestructive(int wordShifts, int bitShiftsInWord, boolean roundUp) {
		if (wordShifts == 0 && bitShiftsInWord == 0) {
			return;
		}
		
		assert (wordShifts >= 0);
		assert (bitShiftsInWord >= 0);
		assert (bitShiftsInWord < 32);
		if (wordShifts >= 4) {
			zeroClear();
			return;
		}
		
		final int shiftRestore = 32 - bitShiftsInWord;
		
		// check this because "123 << 32" will be 123.
		final boolean noRestore = bitShiftsInWord == 0;
		final int roundCarryNoRestoreMask = 1 << 31;
		final int roundCarryMasl = (1 << (bitShiftsInWord - 1));
		....
	}
}
