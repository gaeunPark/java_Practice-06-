package test;
import animal.*;

public class AnimalTest01 {
	public static void main(String[] args) {
		Animal[] a = new Animal[]{
			new Dog("허니", "치와와"),
			new Cat("나비" , 3),
			new Dog("해피", "말티즈")
		};
		
		for(Animal i : a) {
			i.introduce();
		}
		
		
	}
}
