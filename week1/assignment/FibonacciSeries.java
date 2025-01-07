package week1.assignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8, firstNo = 0, secondNo = 1;
		System.out.println("Fibonacci Series till " + range + " terms:");

		for (int i = 1; i <= range; i++) {

			System.out.println(firstNo);
			int thirdNo = firstNo + secondNo; //
			firstNo = secondNo;
			secondNo = thirdNo;
		}
		
	

	}

}
