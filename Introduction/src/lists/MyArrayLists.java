package lists;

import java.util.ArrayList;

public class MyArrayLists {

	public static void main(String[] args) {
		
//		ArrayList<String> fruits = new ArrayList();
//		fruits.add("Apple");
//		fruits.add("Orange");
//
//		System.out.println(fruits);
//		
//		ArrayList<Integer> marks = new ArrayList();
		
		Pair<String, Integer> p1 = new Pair("Anamika", 457);
		Pair<Boolean, String> p2 = new Pair(true, "Hello");
		
		p1.getDescription();
		p2.getDescription();
	}

}
