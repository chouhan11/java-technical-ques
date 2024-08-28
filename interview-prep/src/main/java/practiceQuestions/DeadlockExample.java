package practiceQuestions;

public class DeadlockExample {
    // Resource A
    private static final String resourceA = new String();
    // Resource B
    private static final Object resourceB = new Object();

    public static void main(String[] args) {
        // Thread 1 tries to lock resource A then resource B
        Thread thread1 = new Thread(() -> {
            synchronized (resourceA) {
                System.out.println("Thread 1: Holding Resource A...");
                
                // Simulate some work with resource A
                try { Thread.sleep(100); } catch (InterruptedException e) {}
                 
                System.out.println("Thread 1: Waiting for Resource B...");
                synchronized (resourceB) {
                    System.out.println("Thread 1: Acquired Resource B!");
                }
            }
        });

        // Thread 2 tries to lock resource B then resource A
        Thread thread2 = new Thread(() -> {
            synchronized (resourceB) {
                System.out.println("Thread 2: Holding Resource B...");
                
                // Simulate some work with resource B
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                System.out.println("Thread 2: Waiting for Resource A...");
                synchronized (resourceA) {
                    System.out.println("Thread 2: Acquired Resource A!");
                }
            }
        });

        thread1.start();
        thread2.start();
        //one of the approach to solve this is to change resource sequence in one of the thread
        //thread2 => resourceB -> resourceA and resourceA -> resourceB
    }
}