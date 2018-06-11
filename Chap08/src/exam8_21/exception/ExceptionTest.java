package exam8_21.exception;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch(SpaceException e) {
			System.out.println("�����޼���: " + e.getMessage());
		} catch(MemoryException me) {
			System.out.println("�����޼���: " + me.getMessage());
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("��ġ�� ������ �����մϴ�.");
		if(!enoughMemory())
			throw new MemoryException("�޸𸮰� �����մϴ�.");
	}
	
	static void copyFiles() {}
	static void deleteTempFiles() {}
	static boolean enoughSpace() {
		return false;
	}
	static boolean enoughMemory() {
		return false;
	}
	
}
