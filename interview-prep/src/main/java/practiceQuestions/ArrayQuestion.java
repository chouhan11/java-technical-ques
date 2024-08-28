package practiceQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Vector;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ArrayQuestion {

	//Find a peak element which is not smaller than its neighbours
	
	//Given an array arr of n elements that is first strictly increasing and 
	//then maybe strictly decreasing, find the maximum element in the array.
	 static public void  main(String[] args) {
		int[] a=  {10, 20, 15, 2, 23, 90, 67,20,10};   
		//peakElement(a);
		//minMax(a);
		//reverseArray(a);
		//removeDuplicate(a);
		//findNthLargestElement(a,2);
	    //swap2No();
		//fibonacchi();
		//sumOfUniqueElementInArray();
		missingInArray();
		//localMinimum();
		//KthSmallestElement();
		//KthlargestElement();
		//CountNumberOfOccurrences();
		//CountNumberOfOccurrencesofTarget();
		
	}
		
	 private static void missingInArray() {
		int[] arr= {1,3,4,5};
		int miss = 0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] == arr[i]+1) {
				
			}else {
				miss=arr[i]+1;
			}
		}
		System.out.println(miss);
	}

	private static void sumOfUniqueElementInArray() {
			List<Integer> list = Arrays.asList(2,1,2,2,3,1,5);
			list.stream().filter(e-> Collections.frequency(list, e)>2).
			collect(Collectors.toSet()).forEach(System.out::print);
			Set set=new HashSet<>();
		
			list.stream().filter(e-> !set.add(e)).collect(Collectors.toSet());
			
			set.forEach(System.out::print);
		}



	private static void fibonacchi() {
		int n=7;
		int a=0;
		int b=1 , c=0;
		System.out.print(" "+a +" "+b);	
		for(int i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
		System.out.print(" "+c);	
		}
		
	}





	private static void swap2No() {
		int a=10 , b=20;
		//int c=a+b;
		//a=c-a;
		//b=c-b;
		//System.out.println("a "+ a +" b "+b);
		
		//without using 3rd variable
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("a "+ a +" b "+b);
	}





	private static void findNthLargestElement(int[] a, int n) {
		
		Optional<Integer> nth = Arrays.stream(a).boxed()
		 .sorted(Comparator.reverseOrder())
		 .skip(n-1)
		 .findFirst();
		if(nth.isPresent())
			System.out.println("nth largest "+nth.get());
		
	}



	private static void removeDuplicate(int[] a) {
		long start = System.nanoTime();
		Set<Integer> set=new LinkedHashSet<>();
		for(int e : a) {
			set.add(e);
		}
		int index=0;
		for(int i:set) {
			a[index++]=i;
		}
		for(int j=0;j<set.size();j++) {
			System.out.print(" "+a[j]);
		}
	}



	private static void reverseArray(int[] a) {
		int l = a.length;
		
		//using extra array
		//int[] extra=new int[l];
		//for(int i=0;i<l;i++) {
		//	extra[i]=a[l-1-i];
		//}
		//using 2 pointer approach
		int start=0; int end=l-1;
		int temp;
		while(start<end) {
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		
		for(int e:a) {
			System.out.print(" "+e);
		}
	}



	private static void minMax(int[] a) {
		Arrays.sort(a);
		System.out.println("min "+ a[0] +"  max "+ a[a.length-1]);
		Arrays.stream(a).max().getAsInt();
		int min = Arrays.stream(a).min().getAsInt();
		int max = Arrays.stream(a).max().getAsInt();
		System.out.println("min "+ min +"  max "+ max);
	}
	
	

	private static void peakElement(int[] a) {
		//{5, 10, 20, 15};
		//Output: 20
		//Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

		int length = a.length;
		//System.out.println(length);
		for(int i=1;i<length-1;i++) {
			if(a[i]>a[i-1] && a[i]>a[i+1]) {
				System.out.println("peak element "+ a[i]);
			}
		}
	}
	
	private static void localMinimum() {
		/*Find a local minima in an array
		 *
		 * Given an array arr[0 .. n-1] of distinct integers, the task is to 
		 * find a local minimum in it. We say that an element arr[x] 
		 * is a local minimum if it is less than both its neighbors.
		 * Input: arr[] = {9, 6, 3, 14, 5, 7, 4};
         *  Output: Index of local minima is 2
		 */
		int arr[] = {9, 6, 3, 14, 5, 7, 4};
		int length = arr.length;
		for(int i=1;i<length-1;i++) {
			if(arr[i-1]>arr[i] && arr[i+1]>arr[i]) {
				System.out.println("minima "+arr[i] +" index "+i);
			}
		}
	}
	private static void KthSmallestElement() {
		int[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int K = 4;
        //basic approach
        Arrays.sort(arr);
        System.out.println( arr.length+"KthSmallestElement "+ arr[K-1]);
        
        //advanced approach
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> Integer.compare( b,a));
        for(int i=0;i<arr.length;i++) {
        	pq.add(arr[i]);
        	if(pq.size()>K) 
        		pq.poll();
        }
        System.out.println(pq);
        System.out.println(pq.peek());
	}
	private static void KthlargestElement() {
		Integer[] arr = { 10, 5, 4, 3, 48, 6, 2, 33, 53, 10 };
        int K = 4;
        //basic approach
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<K;i++) {
        System.out.print(arr[i] +" ");
        list.add(arr[i]);
        }
        System.out.println(list.toString());
        
        System.out.println( " KthlargestElement "+ arr[K-1]);
        
	}

	private static void CountNumberOfOccurrences() {
	//Count number of occurrences (or frequency) in a sorted array	
	/*
	 * Input: N = 7, X = 2, Arr[] = {1, 1, 2, 2, 2, 2, 3}
     * Output: 4
     * Explanation: 2 occurs 4 times in the given array.	
	 */
		int[] arr= {1, 1, 2, 2, 2, 2, 3}; 
		int lenth=arr.length;
		Map<Integer, Long> frq = Arrays.stream(arr)
		.boxed().//Convert int to Integer
		collect(Collectors.groupingBy(n-> n,Collectors.counting()));
		frq.forEach((k,v)-> System.out.println(k +" "+v));
		Optional<Entry<Integer, Long>> maxEntry = frq.entrySet().stream().max(Map.Entry.comparingByValue());
		System.out.println(maxEntry.get().getKey() + " = "+maxEntry.get().getValue());
	}
	private static void CountNumberOfOccurrencesofTarget() {
		//Count number of occurrences (or frequency) in a sorted array	
		/*
		 * Input: N = 7, X = 2, Arr[] = {1, 1, 2, 2, 2, 2, 3}
	     * Output: 4
	     * Explanation: 2 occurs 4 times in the given array.	
		 */
		int target=7;
			int[] arr= {1, 1, 2, 2, 2, 2, 3}; 
			int frq=0;
			for(int e:arr) {
				if(e==target)
					frq++;
			}
			System.out.println( target+" freqyency "+frq);
			//2nd approach
		      System.out.println(Arrays.toString(arr));
		     Map<Integer,Long> fr= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(e-> e,Collectors.counting()));
		     fr.forEach((k,v)-> System.out.println(k +" "+v));	
		}
	
}
