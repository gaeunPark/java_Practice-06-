package test;
import pet.*;

public class PetTest01 {
	public static void main(String[] args) {
		Pet[] p = { new Pet("별이", "이서진"),
					new RobbotPet("깡통이", "홍길동"),
					new Pet("나비", "이승기")
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
