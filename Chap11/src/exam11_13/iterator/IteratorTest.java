package exam11_13.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		for(int i=1; i<6; i++) {
			list.add(i + "");
		}
		
		Iterator it = list.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
	}
}
