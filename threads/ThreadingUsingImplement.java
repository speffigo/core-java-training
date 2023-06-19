package threads;

public class ThreadingUsingImplement implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Implement Thread:" + i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}

	}

	public static void main(String[] args) {
		ThreadingUsingImplement implement = new ThreadingUsingImplement();
		Thread thread = new Thread(implement);
		thread.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main:" + i);

			try {
				Thread.sleep(1000);
			} catch (Exception e) {

			}
		}

	}

}
