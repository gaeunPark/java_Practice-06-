package test;
import pet.*;

public class PetTest01 {
	public static void main(String[] args) {
		Pet[] p = { new Pet("����", "�̼���"),
					new RobbotPet("������", "ȫ�浿"),
					new Pet("����", "�̽±�")
		};
		
		for(Pet i: p) {
			i.introduce();
			if(i instanceof RobbotPet) {
				((RobbotPet) i).homeWoring(2);
			}
			System.out.println();
		}
		
		
		
		
	}

}
