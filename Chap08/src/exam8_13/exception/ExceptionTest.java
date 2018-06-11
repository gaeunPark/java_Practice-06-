package exam8_13.exception;

public class ExceptionTest {
	public static void main(String[] args) {
		method();
	}
	
	public static void method() {
		try {
			throw new Exception();
		} catch(Exception e) {
			System.out.println("method()에서 예외가 제외되었습니다.");
			e.printStackTrace();
		}
	}
}
