package sec3_5;
import java.lang.*;
import java.text.SimpleDateFormat;
import java.util.*;

public class Test {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss");
		
		System.out.println("¿À´Ã ³¯Â¥´Â " + date.format(today));
		System.out.println("¿À´Ã ³¯Â¥´Â " + time.format(today));
	}
}
