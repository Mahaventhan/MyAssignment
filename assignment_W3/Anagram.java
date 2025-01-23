package week3.assignment_W3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		 
		String value1 = "stops";
		String value2 = "potss";
		
		if (value1.length()==value2.length()) {  //using length method
			System.out.println("Lengths is equal");
			
		} else {
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
		char[] c1 = value1.toCharArray();  //using tocharArray method
		char[] c2 = value2.toCharArray();
		
		Arrays.sort(c1);  //using sort method
		System.out.println(c1);
		Arrays.sort(c2);
		System.out.println(c2);
		
		if (Arrays.equals(c1, c2)) {
			System.out.println("The given strings are Anagram.");
		} else {
			System.out.println("The given strings are not an Anagram.");
		}
		
		
	}

}
