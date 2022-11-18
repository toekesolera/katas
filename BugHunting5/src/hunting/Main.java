package hunting;

public class Main {
	public static final ByteSequence prefixEndOf(ByteSequence prefix) {
		byte[] endKey = prefix.getBytes().clone();
		for (int i = endKey.length - 1; i >= 0; i--) {
			if (endKey[i] < 0xff) {
				endKey[i] = (byte) (endKey[i] + 1);
				return ByteSequence.from(Arrays.copyOf(endKey, i + 1));
			}
		}
		return ByteSequence.from(NO_PREFIX_END);
	}
}
