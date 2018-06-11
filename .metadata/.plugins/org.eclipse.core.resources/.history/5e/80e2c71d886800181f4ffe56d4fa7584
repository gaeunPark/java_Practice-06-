package exam8_17.exception;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFile();
			deleteTempFile();
		} catch(Exception e) {
			e.printStackTrace();
			deleteTempFile();
		} finally {
			deleteTempFile();
		}
	}
	
	static void startInstall() {}
	static void copyFile() {}
	static void deleteTempFile() {}
}
