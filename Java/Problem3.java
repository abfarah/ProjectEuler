/*

By Abdullahi Farah

Problem 3:
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

*/

import java.lang.Math;

public class Problem3 {
	public static void main(String[] args){
		Problem3 test = new Problem3();
		long startTime1 = System.nanoTime();
		test.solve();
		long endTime1 = System.nanoTime();
		long duration1 = (endTime1 - startTime1);

		long startTime2 = System.nanoTime();
		test.solve2();
		long endTime2 = System.nanoTime();
		long duration2 = (endTime2 - startTime2);

		System.out.println("Solution = " + test.solve2());
		
		System.out.println("Brute force solution took this long: " + duration1 + " nanoSeconds");
		System.out.println("Second solution took this long: " + duration2 + " nanoSeconds");
		
	}

	public String solve(){
		long largestPrimeFactor = 0;
		long numb = 600851475143L;

		// First step is to check whether the number inputed is a prime number using function IsPrime defined below
		if (isPrime(numb)){
			return Long.toString(numb);
		}

		// Second step is to find the largest prime skipping every even number
		// Was initially stopping the for loop when i < numb/2 but program was taking too long so switched to sqrt of numb to increase speed.
		// Came to the conclusion to use Square root since most composite numbers don't have a greatest prime factor larger then it's square root.
		for(long i = 3; i < Math.sqrt(numb); i+=2){
			if (numb%i == 0 && isPrime(i)) {
				largestPrimeFactor = i;
			}
		}

		return Long.toString(largestPrimeFactor);
	}

	public boolean isPrime(long number){
		boolean isNumbPrime = true;
		for(long i = 2; i < number/2; i++){
			if (number %i == 0){
				isNumbPrime = false;
				break;
			}
		}
		return isNumbPrime;
	}

	// Another more efficient method in finding the largest prime factor
	// Significantly more efficient then previous method
	public String solve2(){
		long bigNumber = 600851475143L;
		long primeFactor = 3;
		long previousFactor = 1;
		double factorLimit = Math.sqrt(bigNumber);

		if (bigNumber == 1 || bigNumber == 2 || bigNumber == 3){
			return Long.toString(bigNumber);
		}

		// First step is to check if the number is even and divide by 2 respectfully
		if (bigNumber %2 == 0){
			bigNumber /= 2;

			while(bigNumber%2 == 0){
				bigNumber /= 2;
			}
			previousFactor = 2;
		}

		//Second step is to parse through factors and find largest prime factor
		while(primeFactor <= factorLimit && bigNumber > 1){
			if(bigNumber% primeFactor == 0){
				bigNumber /= primeFactor;
				previousFactor = primeFactor;
				while (bigNumber%primeFactor == 0){
					bigNumber /= primeFactor;
				}
				factorLimit = Math.sqrt(bigNumber);
			}
			primeFactor += 2;
		}

		if (bigNumber == 1){
			return Long.toString(previousFactor);
		} else {
			return Long.toString(bigNumber);
		}
	}
}
