/*
By Abdullahi Farah
Problem 6:
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
*/

import java.lang.Math;

public class Problem6 {
	public static void main(String[] args){
		Problem6 test = new Problem6();
		System.out.println(test.solve());
	}

	public String solve(){
		long difference = 0L;
		int count = 100;
		difference = squareOfSum(count) - sumOfSquares(count);
		return Long.toString(difference);
	}

	public long sumOfSquares(int count){
		long sumOfSquares = 0L;
		for(int i = 1; i <= count; i++){
			sumOfSquares += i*i;
		}
		return sumOfSquares;
	}

	public long squareOfSum(int count){
		long sum = 0L;
		for(int i = 1; i <= count; i++){
			sum += i;
		}
		sum =  sum * sum;
		return sum;
	}
}