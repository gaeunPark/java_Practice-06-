package pet;

public class RobbotPet extends Pet {

	public RobbotPet(String name, String master_name){
		super(name, master_name);
	}
	
	@Override
	public void introduce() {
		System.out.printf("���� �κ��� %s�Դϴ�.\n", getName());
		System.out.printf("�� ���δ��� %s�Դϴ�.\n", getmasterName());
	}

	public void homeWoring(int n) {
		switch(n) {
		case 1:
			System.out.println("û�Ҹ� �մϴ�."); break;
		case 2:
			System.out.println("������ �մϴ�."); break;
		case 3:
			System.out.println("�������� �մϴ�."); break;
		}
	}
	
	
}
