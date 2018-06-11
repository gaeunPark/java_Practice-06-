package sec8_3.innerClass;

public class InnerTest {
	class Inner{
		int value = 0;
		public void add() {
			value++;
		}
	}
	public static void main(String[] args) {
		InnerTest t = new InnerTest();
		InnerTest.Inner inner = t.new Inner();
		inner.add();
		System.out.println(inner.value);

	}

}
