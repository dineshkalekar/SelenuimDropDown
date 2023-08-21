package DropdownHandals;

import java.util.ArrayList;
import java.util.List;

public class listPractice {

	public static void main(String[] args) {
		List<String> autoClass = new ArrayList<String>();

		autoClass.add("Ram");
		autoClass.add("Gopi");
		autoClass.add("Jenny");
		autoClass.add("Sunil");

		System.out.println(autoClass);

		int size = autoClass.size();
		System.out.println("Total Student in Class " + size);

		for (int i = 0; i < size; i++) {
			String name=autoClass.get(i);
			System.out.println(name);
			}

	}

}
