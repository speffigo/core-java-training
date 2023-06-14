package conditionals;

public class LargestOfNumbers {

	public static void main(String[] args) {
		int a = 80;
		int b = 90;
		int c = 10;
		if (a > b && a > c)
			System.out.print("a is largest number");
		else if (b > a && b > c)
			System.out.print("b is largest number");
		else
			System.out.print("c is largest number");

	}

}
