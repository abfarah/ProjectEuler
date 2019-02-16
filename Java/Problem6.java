/*
By Abdullahi Farah
Problem 6:
The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
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
		int numb = 100;
		int sumOfSquares = 0;
		int squareOfSum = 0;

		for (int i = 1; i <= numb; i++){
			sumOfSquares += i*i;
			squareOfSum += i;

		}
		return Integer.toString((squareOfSum * squareOfSum) - sumOfSquares);
	}
}