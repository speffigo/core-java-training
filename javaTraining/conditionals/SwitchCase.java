package conditionals;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int day = in.nextInt();
		switch (day) {
		case 1:
			System.out.print("Day 1");
			break;
		case 2:
			System.out.print("Day 2");
			break;
		case 3:
			System.out.print("Day 3");
			break;
		case 4:
			System.out.print("Day 4");
			break;
		case 5:
			System.out.print("Day 5");
			break;
		default:
			System.out.println("Invalid input");
		}

	}

}
