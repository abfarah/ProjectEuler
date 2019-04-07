/*
By Abdullahi Farah
Problem 7:

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?

*/

import java.lang.Math;

public class Problem7 {
	public static void main(String[] args){
		Problem7 test = new Problem7();
		System.out.println("Solution = " + test.solve());
	}

	public String solve(){
		int ithPrime = 10001;
		long result = 3;
		int count = 3;
		while(count<=ithPrime){
			result++;
			if (Common.isPrime(result)){
				count++;
			}
		}
		return Long.toString(result);
	}


}