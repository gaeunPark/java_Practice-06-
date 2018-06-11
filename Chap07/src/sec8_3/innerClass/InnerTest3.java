package sec8_3.innerClass;

public class InnerTest3 {
	
	public void exec() {
		class Inner {
			int value = 0;
			public void add() {
				value++;
			}
		}
		Inner inner = new Inner();
		inner.add();
		System.out.println(inner.value);
	}
	public static void main(String[] args) {
		InnerTest3 t = new InnerTest3();
		t.exec();
		
	}
}
