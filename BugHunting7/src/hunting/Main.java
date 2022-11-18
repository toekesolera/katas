package hunting;

public class Main {
	@Override
	public void putToCache(PutRecordsRequest putRecordsRequest)
	{
		....
		if (!dataTmpFile.exists()) {
			try {
				dataTmpFile.createNewFile();
			}
			catch (IOException e) {
				LOGGER.error("Failed to create cache tmp file, return.", e);
				return;
			}
		}
		....
	}
}
