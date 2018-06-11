package sec3_4;

public class MethodEx {
	public static void method1() {
		System.out.println("m1 실행");
	}
	
	public static void method2(int x) {
		System.out.println(x + "을 이용한 m2");
	}
	
	public static int method3() {
		return 10;
	}
	
	public static void method(int x, int y) {
		System.out.println(x + y);
	}
	
	
	
	
	public static void main(String[] args) {
		method1();
		int x=3;
		method2(x);
		System.out.println(method3());
		
		
	}
}
