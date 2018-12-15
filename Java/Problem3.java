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
		System.out.println(test.solve());
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
}
