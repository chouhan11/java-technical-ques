package practiceQuestions;

public class Counter {
	private int count = 0;

	public synchronized void increment() throws InterruptedException {
		Thread.currentThread().sleep(10);
		count++;
	}

	public int getCount() {
		return count;
	}
}
