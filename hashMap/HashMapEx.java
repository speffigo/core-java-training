package hashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(101, "smith");
		h.put(102, "allen");
		h.put(103, "john");
		h.put(104, "king");
		System.out.println(h);
		h.remove(104);
		System.out.println(h);
		for (Map.Entry M : h.entrySet()) {
			System.out.println(M.getKey() + " " + M.getValue());
		}

	}

}
