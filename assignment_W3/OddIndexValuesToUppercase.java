package week3.assignment_W3;

public class OddIndexValuesToUppercase {

	public static void main(String[] args) {
	
		 String input = "changeme";
		char[] c1 = input.toCharArray();
		
		for (int i =c1.length-1;i>=0;i--) {
			if (i%2!=0) {
				c1[i] = Character.toUpperCase(c1[i]);
				
				//System.out.println(c1);
			} 
		}
		
		String s1 = new String(c1);
		System.out.println(s1);
	}

}
