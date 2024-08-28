package practiceQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MislleneousQuestion {

	public static void main(String[] args) {

		//IterateMap();
		//FizzBuzz();
        //triplet(100);
		inputNo();
		
	}

	private static void inputNo() {
		int n=3;
		int k=n-1;
		for(int j=n;j>=1;j--) {
		for(int i=j;i>=1;i--) {	
			System.out.print(i);
		}

		System.out.println();
		}
	}

	private static void triplet(int limit) {
		int a=1,b=2,c=3,count = 0;
		while(count<limit) {
			int r=(a*a) +(b*b);
			if(r==(c*c)) 
			   System.out.println("its triplet "+a +" "+b+" "+c);
			 a++;b++;c++;
			 count++;
		}
	}

	/*
	 * Write a program that prints the numbers from 1 to 100. But for multiples of
	 * three, print “Fizz” instead of the number, and for the multiples of five,
	 * print “Buzz”. For numbers that are multiples of both three and five, print
	 * “FizzBuzz”.
	 */
	private static void FizzBuzz() {
		int start=0, end =100;
       for(int i=0;i<=100;i++) {
	    if(i%3 ==0 && i%5==0)
	    	System.out.println("FizzBuzz");
	    else if(i%5==0)
	    	System.out.println("Buzz");
	    else if(i%3==0)
	    	System.out.println("Fizz");
       }
	}

	private static void IterateMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "hi");
		map.put("2", "hello");
		map.put("3", "world");
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		Iterator<Entry<String, String>> itr = entrySet.iterator();
		while (itr.hasNext()) {
			Entry<String, String> entry = itr.next();
			System.out.println("key :" + entry.getKey() + " value :" + entry.getValue());
		}
	}

	private static void checkPrimeNo() {
		int n = 22;
		boolean isPrime = true;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(n + " is prime ");
		else
			System.out.println(n + " is not prime ");
	}

}
