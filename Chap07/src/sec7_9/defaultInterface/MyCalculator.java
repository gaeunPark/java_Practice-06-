package sec7_9.defaultInterface;

public class MyCalculator implements Calculator {
	@Override
	public int add(int x, int y) {
		return x + y;
	}
	
	@Override
	public int multi(int x, int y) {
		return x * y;
	}
}
