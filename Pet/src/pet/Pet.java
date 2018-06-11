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
		System.out.printf("제 이름은 %s입니다.\n", name );
		System.out.printf("제 주인님 이름은 %s입니다.\n", master_name);
	}

}
