package sec8_3.innerClass;

public class InnerTest2 {
	
	static class Inner{
		int value = 0;
		public void add() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		InnerTest2.Inner inner = new InnerTest2.Inner();
		inner.add();
		System.out.println(inner.value);
	}
}
