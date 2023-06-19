package threads;

public class ThreadUsingExtends extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {
			System.out.println("Extend thread:" + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {

		ThreadUsingExtends th = new ThreadUsingExtends();
		th.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main:" + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}

}
