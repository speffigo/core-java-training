package conditionals;

public class Continue {

	public static void main(String[] args) {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.print(i + " ");
		}

	}
}
