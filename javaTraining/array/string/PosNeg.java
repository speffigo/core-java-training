package array.string;

public class PosNeg {

	public static void main(String[] args) {
		int[] a = { 10, -90, 20, 50, -60 };
		System.out.println("-ve number");
		for (int i : a) {
			if (i < 0) {
				System.out.println(i + " ");
			}

		}
		System.out.println("+ve number");
		for (int i : a) {
			if (i >= 0) {
				System.out.println(i + " ");
			}

		}

	}
}
