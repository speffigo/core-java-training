package arraylist.example;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("hii");
		a.add(10);
		a.add(10.5);
		a.add(true);
		System.out.println(a);
		System.out.println(a.get(0));
		a.remove(3);
		for (Object o : a) {
			System.out.println(o + " ");
		}
	}

}
