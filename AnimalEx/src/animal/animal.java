package animal;

public abstract class animal {
	private String name;
	
	public animal(String name) {
		this.name = name;
	}
	
	public abstract void bark();
	public abstract String toString();	
	
	public String getName() {
		return name;
	}
	
	public void introduce() {
		System.out.printf("����" + toString() + "�Դϴ�.");
		bark();
	}
	
	
	
	
}
