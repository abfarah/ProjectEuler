/*
By Abdullahi Farah
Problem 10:
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
*/

import java.lang.Math;

public class Problem10 {
	public static void main(String[] args){
		Problem10 test = new Problem10();
		System.out.println("Solution = " + test.solve());
	}

	public static String solve(){
		long result = 2; //Initializing the result as two to include in sum without needing to add extra logic to fuction
		int count = 2000000;
		for(int i = 3; i<count; i=i+2){
			if(Common.isPrime(i)){
				result+= i;
			}
		}
		return Long.toString(result);
	}
}