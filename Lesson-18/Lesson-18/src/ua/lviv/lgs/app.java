package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.List;



public class app {
	public static void main(String[] args) {
		
		Testclass<Integer> m = new Testclass<>();

		List<Integer> intList = new ArrayList<>();
		m.addItem(intList, "Tom");
		m.addItem(intList, "Sam");
		m.addItem(intList, "Cat");
		m.addItem(intList, "Ron");
		
		intList.add(23);
		intList.add(34);
		intList.add(56);
		intList.add(21);
		
		System.out.print(intList);
		
		
	}
}


