package exam8_6.exception.copy;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		} catch(ArithmeticException e) {
			if(e instanceof ArithmeticException)
				System.out.println("True");
			System.out.println("ArithmeticException");
			System.out.println("에러메세지: " + e.getMessage());
		} catch(Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println(6);
	}
}
