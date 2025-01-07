package week1.assignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int primeNumber = 13;

		boolean isPrime = true; // Assume

		for (int i = 2; i < primeNumber; i++) {
			if (primeNumber % i == 0) {

				System.out.println("Non Prime Number: " + primeNumber);
			}

		}
		if (isPrime) {
			System.out.println("Prime Number: " + primeNumber);
		} else {
			System.out.println("Non Prime Number: " + primeNumber);
		}
	}

}
	
		

