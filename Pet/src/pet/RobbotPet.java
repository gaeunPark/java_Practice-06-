package pet;

public class RobbotPet extends Pet {

	public RobbotPet(String name, String master_name){
		super(name, master_name);
	}
	
	@Override
	public void introduce() {
		System.out.printf("저는 로봇펫 %s입니다.\n", getName());
		System.out.printf("제 주인님은 %s입니다.\n", getmasterName());
	}

	public void homeWoring(int n) {
		switch(n) {
		case 1:
			System.out.println("청소를 합니다."); break;
		case 2:
			System.out.println("빨래를 합니다."); break;
		case 3:
			System.out.println("설거지를 합니다."); break;
		}
	}
	
	
}
