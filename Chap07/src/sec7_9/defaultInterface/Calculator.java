package sec7_9.defaultInterface;

public interface Calculator {
	public int add(int x, int y);
	public int multi(int x, int y);
	default int add2(int x, int y) {
		return x + y;
	}
	
	public static int multi2(int i, int j) {
		int result = i * j;
		return result;
	}
}
