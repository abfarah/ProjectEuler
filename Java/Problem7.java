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
		/*long startTime1 = System.nanoTime();
		test.solve();
		long endTime1 = System.nanoTime();
		long duration1 = (endTime1 - startTime1);

		long startTime2 = System.nanoTime();
		test.solve2();
		long endTime2 = System.nanoTime();
		long duration2 = (endTime2 - startTime2);*/

		System.out.println("Solution = " + test.solve());
		
		//System.out.println("Brute force solution took this long: " + duration1 + " nanoSeconds");
		//System.out.println("Second solution took this long: " + duration2 + " nanoSeconds");
	}

	public boolean isPrime(int number){
		boolean isNumbPrime = true;
		double limit = Math.sqrt(number);
		if(number == 0 || number%2==0){
			return false;
		}
		if(number ==1) {
			return true;
		}
		for (int i = 3; i <= limit; i += 2) {
			if (number%i == 0){
				isNumbPrime = false;
			}
		}
		return isNumbPrime;
	}

	//
	public String solve(){
		int ithPrime = 10001;
		int result = 3;
		int count = 3;
		while(count<=ithPrime){
			result++;
			if (isPrime(result)){
				count++;
			}
		}
		return Integer.toString(result);
	}


}