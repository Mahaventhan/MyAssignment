package week4.assignment_W4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class IntersectionList {

	public static void main(String[] args) {
		
		Integer[] numbersA = {3, 2, 11, 4, 6, 7};
		Integer [] numbersB = {1, 2, 8, 4, 9, 7};
		
		List<Integer> asListA = Arrays.asList(numbersA);
		List<Integer> asListB = Arrays.asList(numbersB);
		
		for (Integer num : asListA) {
			
			if (asListB.contains(num)) {
			System.out.println(num);	
			
			}
		}
		

	}

}
