package test;
import animal.*;

public class AnimalTest01 {
	public static void main(String[] args) {
		Animal[] a = new Animal[]{
			new Dog("���", "ġ�Ϳ�"),
			new Cat("����" , 3),
			new Dog("����", "��Ƽ��")
		};
		
		for(Animal i : a) {
			i.introduce();
		}
		
		
	}
}
