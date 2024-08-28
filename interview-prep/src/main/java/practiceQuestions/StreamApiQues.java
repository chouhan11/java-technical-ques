package practiceQuestions;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiQues {

	public static void main(String... args) {
		List<Integer> listOfIntegers = Arrays.asList(71,71,87, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		List<Integer> unique = listOfIntegers.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		//System.out.println("unique "+ unique);
		
		String inputString = "Java Concept Of The Day";
		Map<Character, Long> collect = inputString.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	//	System.out.println(collect);
		//.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		  // mostFrequentElement();
		  //nthFrequentElement(2);
		List<Integer> set = List.of(1,1,2,2,3,5,6,4);
		int n=2;
		Integer nth = set.stream().distinct().sorted(Comparator.reverseOrder()).skip(n-1).findFirst().get();
	//	System.out.println(nth);
		
		//separateOddEndEvenNumbers();
		//addPrefixSuffixInStringList();
		sumOfAlldigits();
	}

	private static void sumOfAlldigits() {
		// Find sum of all digits of a number in Java 8?
		int i=13567;
	  Integer sum = Arrays.stream(String.valueOf(i).split("")).collect(Collectors.summingInt(e->Integer.parseInt(e)));
		//System.out.println(sum);
		 List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
	      listOfIntegers.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
	      .entrySet().stream().filter(entry->entry.getValue()>1).map(e->e.getKey()).forEach(en->System.out.println(en));
	}

	private static void addPrefixSuffixInStringList() {
		//Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix 
		// and ‘,’ as delimiter?
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String string = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.println(string);
		
	}

	private static void separateOddEndEvenNumbers() {
		List<Integer> list = List.of(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Map<Boolean, List<Integer>> map = list.stream().collect(Collectors.partitioningBy(e->e%2 == 0));
		Set<Entry<Boolean, List<Integer>>> entrySet = map.entrySet();
		for(Entry<Boolean, List<Integer>> entry  :entrySet) {
			if(entry.getKey()) {
				System.out.println("=====even no.=======");
				System.out.println(entry.getValue());
			}
			else {
				System.out.println("=====odd no.=======");
				System.out.println(entry.getValue());
			}
		}
		
		
	}

	private static void mostFrequentElement() {
		List<Integer> list=Arrays.asList(1,3,4,3,2,4,4);
	       Map<Integer,Long> frequencyMap= list.stream().collect(Collectors.groupingBy(e-> e,Collectors.counting()));
	       
	       System.out.println(frequencyMap.toString());
	    
	        Optional<Map.Entry<Integer, Long>> maxEntry = frequencyMap.entrySet().stream()
	                .max(Map.Entry.comparingByValue());
	             Map.Entry<Integer, Long> entry=   maxEntry.get();
	            System.out.println( "element : "+ entry.getKey() +" freq : "+entry.getValue());
	}
	private static void nthFrequentElement(int n) {
		List<Integer> list=Arrays.asList(1,3,4,3,2,4,4);
	       Map<Integer,Long> frequencyMap= list.stream().collect(Collectors.groupingBy(e-> e,Collectors.counting()));
	       
	       System.out.println(frequencyMap.toString());
	       
	         List<Entry<Integer, Long>> entry = frequencyMap.entrySet().stream()
	              .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList());
	         
	            System.out.println( "element : "+ entry.get(n-1).getKey() +" freq : "+entry.get(n-1).getValue());
	}

}
