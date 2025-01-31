package week4.assignment_W4;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class SortingCollection {
	
	public static void main(String[] args) {
		
		String[] names={"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> companyList = Arrays.asList(names);
		Collections.sort(companyList);
		//System.out.println("Ascending order: " +companyList);
		
		for (int i=companyList.size()-1 ; i >=0; i--) {
			System.out.println(companyList.get(i));
			if (i!=0) {
				System.out.println();
			}
		}
		

		
	}
	
}
