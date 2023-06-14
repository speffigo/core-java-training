package array.string;

import java.util.Scanner;

public class TwoDimenArray {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[][] a = new int[2][3];
		System.out.println(a.length);

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = in.nextInt();
			}

		}

		for (int[] i : a) {
			for (int i1 : i) {
				System.out.print(i1 + " ");
			}
			System.out.println();
		}

	}
}
