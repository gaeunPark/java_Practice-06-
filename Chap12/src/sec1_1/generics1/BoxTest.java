package sec1_1.generics1;

public class BoxTest {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(new Object());
		box.getObj();
		
		box.setObj("ȫ�浿");
		Object str = box.getObj();

		box.setObj((Object)1);
		int value = (int)box.getObj();
		System.out.println(value);
		
	}

}
