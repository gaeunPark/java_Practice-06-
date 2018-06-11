package sec8_2.exception;

public class ExceptionTest3 {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;

		for (int i = 0; i < 10; i++) {
			try {
				result = num / (int) (Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("by 0");
			}
		}
	}
}
