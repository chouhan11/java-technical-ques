package practiceQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeMap;

public class StringQuestion {

	public static void main(String[] args) {
		//reverseString();
	/*	if(isStringPalindrome2ndApproach()) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}*/
		//duplicateCharacters();
        //stringContainVowels();
		//reverseWordsInSentence();
		//highestOccurredCharacter();
		
		
		compress("bbbcffff");
		
	}
	public static void compress(String input) {
       char[] ch = input.toCharArray();
       Map<Character,Integer> map=new HashMap<>();
       for(Character c: ch) {
    	   int n=1;
       if(map.get(c)==null) {
    	   map.put(c, n);
        }
       else {
    	   map.put(c, map.get(c)+n);
        }
       }
       StringBuilder sb=new StringBuilder();
       map.forEach((k,v)-> sb.append(k+""+v));
       System.out.println(sb);
    }

	private static void highestOccurredCharacter() {
		String str="aaaaaaaaaaaaaaaaabbbbcddddeeeeee";
		char[] ch = str.toCharArray();
		Map<Character, Integer> map=new HashMap();
		for(char c: ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		char hch='\0';
		int count=0;
		for(Map.Entry<Character, Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue()>count) {
				hch=entrySet.getKey();
				count=entrySet.getValue();
			}
		}
		
		System.out.println(hch + " : " +count);
		
		
	}
	
	private static void reverseWordsInSentence() {
		String str="Java is best programming language";
		String [] words= str.split(" ");
		StringBuffer sb=new StringBuffer();
		for(int i=words.length-1; i>=0 ;i--) {
			sb.append(words[i] +" ");
		}
		System.out.println(sb.toString());
	}
	private static void stringContainVowels() {
		String str="Madhura";
		
		String[] s = str.split("");
		Map<String, Integer> map=new HashMap<>();
		for(String e : s) {
		   int i=1;
		   boolean flag = e.toLowerCase().matches(".*[aeiou].*");
		   if(flag) {
			   if(map.get(e)==null)
				   map.put(e, i);
			   else
				   map.put(e, map.get(e) +1);
		   }
			  
		}
		System.out.println(map);
		
	}
	private static void duplicateCharacters() {
		String str="abdhsab";
		String[] s= str.split("");
		Map<String,Integer> map=new HashMap<>();
		for( String e : s) {
			int i=1;
			if(map.get(e)==null) {
			    map.put(e, i);
			}
			else {
				map.put(e, map.get(e)+1);
			}
		}
		System.out.println(map.toString());
		TreeMap<String, Integer> sortedMap=new TreeMap<>(Collections.reverseOrder());
		sortedMap.putAll(map);
		System.out.println(sortedMap.toString());
		
	}
	private static void reverseString() {
		String s="Hello World";
		//1st approach
		StringBuilder sb=new StringBuilder(s);
		StringBuilder reverse = sb.reverse();
		System.out.println( "original : "+ s + " reverse : " +reverse);
		
		//2nd approach
		char[] ch = s.toCharArray();
		int start=0;
		int end=ch.length-1;char temp;
		while(start<end) {
			temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		System.out.println( "original : "+ s + " reverse : " +new String(ch));
		
	}
	private static boolean isStringPalindrome1stApproach() {
		String str="abba";
		int start=0 , end =str.length()-1;
		String[] s = str.split("");
		while(start<end) {
			if(!s[start].equalsIgnoreCase(s[end])) {
				return false;
			}
			else {
				start++;
				end--;
			}
		}
		
		return true;
		
	}
	private static boolean isStringPalindrome2ndApproach() {
		String str="abba";
		int start=0 , end =str.length()-1;
		char[] ch = str.toCharArray();
		while(start<end) {
			if(ch[start]!=ch[end]) {
				return false;
			}
			else {
				start++;
				end--;
			}
		}
		
		return true;
		
	}

}
