package exam8_14.exception;

public class ExceptionTest14 {
	public static void main(String[] args) throws Exception {
		try {
			method();
		} catch(Exception e) {
			System.out.println("method()���� ���ܰ� ���ܵǾ����ϴ�.");
			e.printStackTrace();
		}
	}
	
	public static void method() throws Exception {
			throw new Exception();
		
	}
}
