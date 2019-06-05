public class MyMultiThread {
	public static void main(String args[]) {
			new MyThread("Uno");
			new MyThread("Due");
			new MyThread("Tre");
		try {
		Thread.sleep(10000);
		}
		catch (InterruptedException e) {
		System.out.println("Interruzione main thread");
		}
		System.out.println("uscita main thread ");
	}
}
