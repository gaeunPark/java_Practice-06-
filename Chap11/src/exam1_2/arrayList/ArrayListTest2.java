package exam1_2.arrayList;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add("김길동");
		list.add("박길동");
		list.add("최길동");
		list.add("이길동");
		
		list.add(3, "고길동");
		list.remove(4);
		System.out.println(list);
		
		list.removeAll(list);
		System.out.println(list);
	}

}
