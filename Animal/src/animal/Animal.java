package animal;

public abstract class Animal {
	private String name;
	
	Animal(String name){
		this.name = name;
	}
	
	public abstract void bark();
	public abstract String toString();
	
	public void introduce() {
		System.out.println("���� " + toString() + " �Դϴ�.");
		bark();
	}
	public String getName() {
		return name;
	}

}
