package animal;

public class dog extends animal {
	public String type;
	
	public dog(String name, String type) {
		super(name);
		this.type = type;
	}
	
	public void bark() {
		System.out.println("�۸�!!");
	};
	
	public String toString() {
		return type + "��" + getName();
	}
	
	
	

}
