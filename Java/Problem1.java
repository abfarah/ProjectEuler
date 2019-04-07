/*
By Abdullahi Farah
Problem 1:

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

*/

public class Problem1 {
	public static void main(String[] args){
		Problem1 test = new Problem1();
		long startTime1 = System.nanoTime();
		test.solve();
		long endTime1 = System.nanoTime();
		long duration1 = (endTime1 - startTime1);

		Problem1 test2 = new Problem1();
		long startTime2 = System.nanoTime();
		test.solve2();
		long endTime2 = System.nanoTime();
		long duration2 = (endTime2 - startTime2);

		System.out.println("Solution = " + test.solve2());
		
		System.out.println("Brute force solution took this long: " + duration1 + " nanoSeconds");
		System.out.println("Second solution took this long: " + duration2 + " nanoSeconds");


	}
	
	public String solve(){
		int numb = 1000;
		int sumOfMultiples = 0;
		// First step find all multiples of 3 and 5 or both below 1000.
		for (int i = 0; i < numb; i++){
			if((i%3) == 0 || (i%5) == 0){
				sumOfMultiples += i;
			}
		}

		return Integer.toString(sumOfMultiples);
	}

	public String solve2(){
		int numb = 999;

		// Returning the sum of the multiples of 3 and 5 minus the double counted sums of the multiples of 15
		int result = (findSumOfDivisors(numb, 3) + findSumOfDivisors(numb, 5)) - findSumOfDivisors(numb, 15);
		return Integer.toString(result);
	}

	// This method is more efficient then the brute force solution above.
	// The first step is to find largest multiple
	// The second step is to use the equation for sum and multiply by the divisor
	public int findSumOfDivisors(int numb, int divisor){
		int largestMultiple = (int) numb / divisor;
		return (int) divisor * (largestMultiple * (largestMultiple + 1)) / 2;
	}


}