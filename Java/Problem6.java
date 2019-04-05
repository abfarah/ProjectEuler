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

public class Problem6 {
	public static void main(String[] args){
		Problem6 test = new Problem6();
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
		int numb = 100;
		int sumOfSquares = 0;
		int squareOfSum = 0;

		for (int i = 1; i <= numb; i++){
			sumOfSquares += i*i;
			squareOfSum += i;

		}
		return Integer.toString((squareOfSum * squareOfSum) - sumOfSquares);
	}

	// Used the equation for sums of all numbers below x
	// sum(x) = x(x+1)/2
	public String solve2(){
		int numb = 100;
		int sumOfSquares = (((2*numb +1)*(numb +1)*numb)/6);
		int squareOfSum = (numb*(numb +1)/2);
		return Integer.toString((squareOfSum * squareOfSum) - sumOfSquares);
	}
}