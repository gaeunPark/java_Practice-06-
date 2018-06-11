package exam12_4.boundedtype;

public class BoundedTypeParamTest {

	public static void main(String[] args) {
//		Util.compare("a", "b"); ¿¡·¯
		int result1 = Util.compare(10, 20);
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 6);
		System.out.println(result2);
	}

}
