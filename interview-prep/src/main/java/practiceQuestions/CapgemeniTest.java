package practiceQuestions;

import java.util.Arrays;

/*
 * Given two arrays. Arr1 = {1,2,3,8}, arr2 = {5,6,4,7}. 
 * Find a number from each array to be interchanged to reach a common sum of all elements for both arrays.
 * Output: {1,5} or {3,7} or {2,6} 
 */

public class CapgemeniTest {
	public static void main(String args[]) {
		int[] arr1 = { 1, 2, 3, 8 };
		int[] arr2 = { 5, 6, 4, 7 };

		int sum1 = Arrays.stream(arr1).sum();
		int sum2 = Arrays.stream(arr2).sum();

		System.out.println(sum1 + " " + sum2);
		for (int k = 0; k < arr1.length; k++) {
			int nsum1 = sum1 - arr1[k];
			for (int l = 0; l < arr2.length; l++) {
				int nsum2 = sum2 - arr2[l];
				if (nsum1 + arr2[l] == nsum2 + arr1[k]) {
					System.out.println(arr1[k] + " " + arr2[l]);
				}
			}
		}
	}

}
