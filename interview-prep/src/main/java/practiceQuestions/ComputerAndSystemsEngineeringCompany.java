package practiceQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ComputerAndSystemsEngineeringCompany {

	public static void main(String[] args) {
	/*
	 * int[] a = new int[] {4, 2, 7, 1};
       int[] b = new int[] {8, 3, 9, 5};
       How do you merge two unsorted arrays into single sorted array using Java 8 streams
      need below output
      int[] result =  [1, 2, 3, 4, 5, 7, 8, 9]
	 */

		
		int[] a = new int[] {4, 2, 7, 1};
		int[] b = new int[] {8, 3, 9, 5};
		
		int[] result = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
		//System.out.println(Arrays.toString(result));
      
		/*
		 * reverse the string in a way that special characters are not affected.
           Input:   str = "Ab,c,de!$"
           Output:  str = "ed,c,bA!$"
		 */
	    String s="Ab,cde!$";		
	    char[] ch = s.toCharArray();
	    Map< Integer,Character> map=new HashMap<>();
	    
	    for(int i=0;i<ch.length;i++) {
	       if(!Character.isLetter(ch[i]))
	    	   map.put(i,ch[i]);
	    }
	    
	    char[] c= {};
	    int j=0;
	    
	    for(int i=ch.length-1;i>=0;i--) {
	    	
	    	if(map.keySet().contains(j+1)) {
	    		j++;
	    	}
	    	
	    	if(!map.keySet().contains(i)) {
	    		map.put(j, ch[i]);
	    		j++;
	    	}
	    }
	    
	    for(int i=0;i<ch.length;i++) {
	    	System.out.println(map.get(i));
		    }
	    
	    
			/*
			 * StringBuffer sb=new StringBuffer(s); StringBuffer reverse = sb.reverse();
			 * System.out.println(reverse); reverse.setCharAt(map.get('!'), '!');
			 * System.out.println(reverse);
			 */
	    
	}

}
