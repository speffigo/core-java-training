package accessmodifiers.constructors;

public class Method {
	int x = 90, y = 100;

	int sum() {
		return x + y;
	}

	public static void main(String[] args) {
		Method m1 = new Method();
		int res = m1.sum();
		System.out.print(res);
	}

}
