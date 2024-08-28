package practiceQuestions;

public class RaceConditionExample {

	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
					counter.increment();
				} catch (InterruptedException e) {					
					e.printStackTrace();
				}
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                try {
					counter.increment();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final count: " + counter.getCount());

	}


}
