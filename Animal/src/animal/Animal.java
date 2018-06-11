package animal;

public abstract class Animal {
	private String name;
	
	Animal(String name){
		this.name = name;
	}
	
	public abstract void bark();
	public abstract String toString();
	
	public void introduce() {
		System.out.println("저는 " + toString() + " 입니다.");
		bark();
	}
	public String getName() {
		return name;
	}

}
