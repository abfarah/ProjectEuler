/*
By Abdullahi Farah
Problem 5:
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/
import java.lang.Math;

public class Problem5 {
	public static void main(String[] args){
		Problem5 test = new Problem5();
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
		//Starting at 2520 since I know no smaller integer is evenly divisible from 1 - 20
		int result = 2520;

		while (isEvenlyDivisible(result, 1, 20) == false){
			result ++;
		}

		return Integer.toString(result);
	}

	public boolean isEvenlyDivisible(int numb, int rangeStart, int rangeEnd){
		boolean result = true;
		for(int i = rangeStart; i <= rangeEnd; i ++){
			if (numb % i != 0){
				result = false;
				break;
			}
		}

		return result;
	}

	public String solve2(){
		int[] primeFactors = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		int numbDivisiblyBy = 20;
		int count = 0;
		int result = 1;
		int exponent = 1;
		double limit = Math.sqrt(numbDivisiblyBy);
		boolean isdivisible = true;

		while(primeFactors[count] <= numbDivisiblyBy){
			exponent = 1;
			if(isdivisible){
				if(primeFactors[count] <= limit){
					exponent = (int) (Math.log(numbDivisiblyBy)/Math.log(primeFactors[count]));
				} else {
					isdivisible = false;
				}
			}
			result = result * (int) (Math.pow(primeFactors[count], exponent));
			count++;
		}

		return Integer.toString(result);
	}
}