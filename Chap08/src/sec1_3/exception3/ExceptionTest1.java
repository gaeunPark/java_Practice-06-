package sec1_3.exception3;

public class ExceptionTest1 {
	public static void main(String[] args) {
		int a = 100;
		int b = 0;

		try {
			int result = divide(a,b);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
		} 
	}
	
	public static int divide(int a, int b) throws ArithmeticException {
		int result = a / b;
		return result;
	}
}
