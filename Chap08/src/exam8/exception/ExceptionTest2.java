package exam8.exception;

public class ExceptionTest2 {
	
	public static int get50thItem(int[] array) throws ArrayIndexOutOfBoundsException {
		return array[49];
	}
	
	public static void main(String[] args) {
		int[] array = new int[10];
		
		try {
			int result = get50thItem(array);
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}
	
}
