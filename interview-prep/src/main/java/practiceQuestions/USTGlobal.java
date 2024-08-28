package practiceQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class USTGlobal {

	public static void main(String[] args) {
		// list of integer => even and odd 
		//make even asc and odd desc
		
		//Sample Input : 3,4,7,2,5,1,9,0,8
		//Sample Output : [0, 9, 2, 7, 4, 5, 8, 3, 1]
		List<Integer> list=Arrays.asList(3,4,7,2,5,1,9,0,8);
		
        Collections.sort(list);
        List<Integer> l=new ArrayList<>(list.size());
        System.out.println(list);
        for(int i=0;i<list.size();i++) {
        	if(i%2==0) {
        		l.add(i, list.get(i/2));
        	}
        	else {
        		l.add(i,list.get(list.size() - 1 - (i / 2)));
        	}
        }
		
        System.out.println(l);
	}

}
