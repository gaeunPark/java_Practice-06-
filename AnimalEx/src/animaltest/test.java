package animaltest;
import animal.*;

public class test {
	public static void main(String[] args) {
		animal[] a= { new dog("��ũ", "ġ�Ϳ�"),
				new cat("����", 5),
				new cat("����", 3),
				new dog("����", "��Ƽ��")
		};
		
		for(animal i : a) {
			i.introduce();
		}
		
		
		
		
		
		
		
	}

}
