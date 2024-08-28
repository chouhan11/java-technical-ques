package practiceQuestions;

import java.util.*;
import java.util.stream.*;
import java.util.Map.*;

public class EY_L1 {

	public static void main(String[] args) {
		String str="unverified";
	      // first repeating letter
	      Map.Entry<String,Long> entry= Arrays.stream(str.split("")).collect(Collectors.groupingBy(e->e,LinkedHashMap::new,Collectors.counting()))
	      .entrySet().stream().filter(e->e.getValue()>1).findFirst().get();
	     // map.forEach((k,v)-> System.out.println(k +" "+v ));
	      System.out.println(entry.getKey());

	}

}
