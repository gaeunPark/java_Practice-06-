package sec7_9.defaultInterface;

public class MyCalculatorTest {
	public static void main(String[] args) {
//		MyCalculator cal = new MyCalculator();
		Calculator cal = new MyCalculator();
		int value = cal.add(3, 4);
		int value2 = cal.add2(3, 4);
		
		System.out.println(value);
		System.out.println(value2);
	
		int value3 = Calculator.multi2(3, 4);
		System.out.println(value3);
	}
	
	
}
