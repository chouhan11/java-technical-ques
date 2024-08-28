package practiceQuestions;

import java.util.Arrays;
import java.util.StringJoiner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class TechnicalQues {

	public static void main(String[] args) {
		
		// printOddEvenByExecuterService();
	}

	private static void printOddEvenByExecuterService() {
		ExecutorService service = Executors.newFixedThreadPool(2);
		IntStream.range(1, 100).forEach(n -> {
			CompletableFuture<Integer> evenFuture = CompletableFuture.completedFuture(n).thenApplyAsync(e -> {
				if (e % 2 == 0)
					System.out.println(Thread.currentThread().getName() + " : number = " + n);
				return n;
			}, service);
			evenFuture.join();
			CompletableFuture<Integer> oddFuture = CompletableFuture.completedFuture(n).thenApplyAsync(e -> {
				if (e % 2 != 0)
					System.out.println(Thread.currentThread().getName() + " : number = " + n);
				return n;
			}, service);
			oddFuture.join();
		});
	}

}
