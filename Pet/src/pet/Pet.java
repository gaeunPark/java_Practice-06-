package pet;

public class Pet {
	private String name;
	private String master_name;
	
	public Pet(String name, String master_name){
		this.name = name;
		this.master_name = master_name;
	}
	
	public String getName() {
		return name;
	}
	
	public String getmasterName() {
		return master_name;
	}
	
	
	public void introduce() {
		System.out.printf("�� �̸��� %s�Դϴ�.\n", name );
		System.out.printf("�� ���δ� �̸��� %s�Դϴ�.\n", master_name);
	}

}
