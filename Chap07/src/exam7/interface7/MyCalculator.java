package exam7.interface7;

public class MyCalculator implements Calculator {
	
	@Override
	public int add(int x, int y) {
		return x + y;
	}
	public int sub(int x, int y) {
		return x - y;
	}
	public int multi(int x, int y) {
		return x * y;
	}
	public int divide(double x, double y) {
		return (int)(x / y);
	}
	public int remainder(int x, int y) {
		return x % y;
	}
	
}
