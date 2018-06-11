package sec1_1.generics2;

public class BoxTest {
	public static void main(String[] args) {
		Box<Object> box = new Box<>();
		box.setBox(new Object());
		box.getBox();
		
		Box<String> box2 = new Box();
		box.setBox("ȫ�浿");
		Object str = box.getBox();
		System.out.println(str);

		box.setBox((Object)1);
		int value = (int)box.getBox();
		System.out.println(value);
		
		Box<Integer> box3 = new Box();
		box3.setBox(1);
		value = box3.getBox();
		System.out.println(value);
		
	}

}
