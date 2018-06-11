package exam8_21.exception;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		} catch(SpaceException e) {
			System.out.println("에러메세지: " + e.getMessage());
		} catch(MemoryException me) {
			System.out.println("에러메세지: " + me.getMessage());
		} finally {
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace())
			throw new SpaceException("설치할 공간이 부족합니다.");
		if(!enoughMemory())
			throw new MemoryException("메모리가 부족합니다.");
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
