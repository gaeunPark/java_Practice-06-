package exam8_10.exception;

import javax.management.RuntimeErrorException;

public class ExceptionTest10 {
	public static void main(String[] args) {
		try {
			throw new Exception();
		} catch(Exception e) {
			throw new RuntimeException();
		}
	}
}
