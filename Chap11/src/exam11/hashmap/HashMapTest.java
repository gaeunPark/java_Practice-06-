package exam11.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("ȫ�浿", "010-1234-5678");
		map.put("��浿", "010-1234-0000");
		map.put("��浿", "010-5678-1234");
		map.put("�ڱ浿", "010-0000-5678");
		map.put("�ֱ浿", "010-1234-1234");
		
		Set set = map.entrySet();
		Iterator it = set.iterator();	
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸�: " + e.getKey() + ", ����: " + e.getValue());
		}	

		printName(map);
		printPhone(map);
	}
	
	static void printName(HashMap map) {
		Set set = map.keySet();
		System.out.println("�л� ���: " + set);
	}
	
	static void printPhone(HashMap map) {
		Collection values = map.values();
		System.out.println("�л� ��ȣ: " + values);
	}

}
