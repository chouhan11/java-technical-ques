package practiceQuestions;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class AccoliteTest {

	//Java Program to Remove Duplicate Element in an array
	//Make a program to sort an array with any sorting algorithm
	//MAKE A PROGRAM TO PRINT THE FIBONACCI SERIES
	public static void main(String[] args) {
		removeDuplicate();
		//printFibonachi(10);
		//adjacentElement();
	}

	//array 3 2 4 6 => out 2
	private static void adjacentElement() {
		int [] arr= {3,2,4,6};
		
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i-1] > arr[i] && arr[i]<arr[i+1]) {
				System.out.println("adjacent element "+arr[i]);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void printFibonachi(int n) {
		int a=0 , b=1 , c;
		for(int i=0;i<n;i++) {
			System.out.print(" "+a);
			c=a+b;
			a=b;
			b=c;
			
		}
		
	}
	private static void removeDuplicate() {
		int[] arr= {1,5,3,3,2,1,6};
		Set<Integer> set=new HashSet<>();
		for(int i=0; i<arr.length ; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		
		Arrays.stream(arr).boxed().distinct().collect(Collectors.toList()).forEach(n->System.out.print(n));
	}
	
	
	

}
