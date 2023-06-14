package array.string;

import java.util.Scanner;

public class SingleDimArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[4];

		for (int i = 0; i < 4; i++) {
			a[i] = in.nextInt();
		}

		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
