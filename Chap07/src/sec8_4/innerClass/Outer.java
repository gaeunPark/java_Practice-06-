package sec8_4.innerClass;

public class Outer {
	int value = 10;
	class Inner{
		int value = 20;
		void method1() {
			int vlaue = 30;
			System.out.println("value : " + value);
			System.out.println("this.value :  " + this.value);
			System.out.println("Outer.this.value : " + Outer.this.value);
		}
	}
}
