package exam8_14.exception;

public class ExceptionTest14 {
	public static void main(String[] args) throws Exception {
		try {
			method();
		} catch(Exception e) {
			System.out.println("method()에서 예외가 제외되었습니다.");
			e.printStackTrace();
		}
	}
	
	public static void method() throws Exception {
			throw new Exception();
		
	}
}
