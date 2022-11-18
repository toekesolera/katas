package hunting;

public class Main {
	public void testSignSHA256CompleteEvenHeight2() {
		....
		int height = 10;
		....
		for (int i = 0; i < (1 << height); i++) {
			byte[] signature = xmss.sign(new byte[1024]);
			switch (i) {
			case 0x005b:
				assertEquals(signatures[0], Hex.toHexString(signature));
				break;
			case 0x0822:
				assertEquals(signatures[1], Hex.toHexString(signature));
				break;
			....
			}
		}
	}
}
