package exam11.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("홍길동", "010-1234-5678");
		map.put("김길동", "010-1234-0000");
		map.put("고길동", "010-5678-1234");
		map.put("박길동", "010-0000-5678");
		map.put("최길동", "010-1234-1234");
		
		Set set = map.entrySet();
		Iterator it = set.iterator();	
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름: " + e.getKey() + ", 점수: " + e.getValue());
		}	

		printName(map);
		printPhone(map);
	}
	
	static void printName(HashMap map) {
		Set set = map.keySet();
		System.out.println("학생 명단: " + set);
	}
	
	static void printPhone(HashMap map) {
		Collection values = map.values();
		System.out.println("학생 번호: " + values);
	}

}
