package animal;

public class cat extends animal {
	int age;
	
	public cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	public void bark() {
		System.out.println("�߿�~~");
	};
	
	public String toString() {
		return age + "���� " + getName(); 
	};	

	
}
