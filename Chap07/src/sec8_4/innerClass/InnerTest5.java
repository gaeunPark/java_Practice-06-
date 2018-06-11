package sec8_4.innerClass;

public class InnerTest5 {

	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.method1();
	}

}
