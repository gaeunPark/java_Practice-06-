package animal;

public class cat extends animal {
	int age;
	
	public cat(String name, int age) {
		super(name);
		this.age = age;
	}
	
	public void bark() {
		System.out.println("야용~~");
	};
	
	public String toString() {
		return age + "살인 " + getName(); 
	};	

	
}
