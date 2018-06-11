package exam11_2.arrayList;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //JDK1.8 �⺻ ũ�� 10
		for(int i=1; i<7; i++) {
			list.add(i*100+i*10+i+"");
		}
		System.out.println(list);
		list.add(0, "000");
		System.out.println(list);
		System.out.println(list.indexOf("333"));
		System.out.println(list.remove("333"));
		System.out.println(list);
		System.out.println(list.indexOf("333"));
		
		for(int i=0; i<list.size(); i++) {
			list.set(i, i+"");
		}
		System.out.print("{");
		for(int i=0; i<list.size(); i++) {
			if(i<list.size()-1) {
				System.out.print(list.get(i) + ", ");
			} else {
				System.out.print(list.get(i));
			}
		}
		System.out.print("}");
		System.out.println();
		for(int i=0; i<list.size(); i++) {
			list.remove(i);
		}
		System.out.println(list);
		
	}
}
