package sec1_6.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysTest {

	public static void main(String[] args) {
		int[] arr1 = {3, 1, 5, 2, 7, 9};
		int[] arr2 = {3, 1, 5, 2, 7, 9};
		
		System.out.println(Arrays.toString(arr1));
		
		int[][] arr2D = {{11, 12}, {21, 22}};
		int[][] arr2D2 = {{11, 12}, {21, 22}};
		System.out.println(Arrays.toString(arr2D));
		System.out.println(Arrays.toString(arr2D2));
		
		System.out.println(Arrays.equals(arr1, arr2));
		System.out.println(Arrays.equals(arr2D, arr2D2));
		System.out.println(Arrays.deepEquals(arr2D, arr2D2));
		
		List list = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(list);
		List list2 = new ArrayList(list);
		
		list2.add(6);
		System.out.println(list2);
	}

}
