package exam7.interface7;

public class MyCalculatorTest {
	public static void main(String[] args) {
		MyCalculator cal = new MyCalculator();
		
		int value = cal.remainder(10, 3);
		int value2 = cal.multi(10, 3);
		
		System.out.println(value);
		System.out.println(value2);
	}
}
