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

	public boolean isPrime(int number){
		boolean isNumbPrime = true;
		double limit = Math.sqrt(number);
		if(number == 0 || number==1 || number %2==0){
			return false;
		}
		if(number ==2 || number ==3) {
			return true;
		}
		for (int i = 3; i <= limit; i += 2) {
			if (number%i == 0){
				isNumbPrime = false;
			}
		}
		return isNumbPrime;
	}

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