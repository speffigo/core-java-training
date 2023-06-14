package array.string;

public class SearchElementInArray {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 50, 10 };
		int n = 70;
		int i;
		for (i = 0; i < a.length; i++) {
			if (a[i] == n) {
				System.out.print("found");
				break;
			}
		}
		if (i >= a.length)
			System.out.print("Not found");

	}

}
