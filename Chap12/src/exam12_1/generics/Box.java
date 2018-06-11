package exam12_1.generics;

import java.util.ArrayList;

public class Box<T> {
	ArrayList<T> list = new ArrayList<>();
	
	void add(T item) {
		list.add(item);
	}
	T get(int i){
		return list.get(i); 
	}	
	int size() {
		return list.size();
	}	
	public String toString() {
		return list.toString();
	}
	
}
