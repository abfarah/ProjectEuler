/*

By Abdullahi Farah

Problem 1:
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

*/


public class Problem1 {
	public static void main(String[] args){
		Problem1 test = new Problem1();
		System.out.println(test.solve());
	}
	
	public String solve(){
		int numb = 1000;
		int sumOfMultiples = 0;
		// First step find all multiples of 3 and 5 or both below 1000
		for (int i = 0; i < numb; i++){
			if((i%3) == 0 || (i%5) == 0){
				sumOfMultiples += i;
			}
		}

		return Integer.toString(sumOfMultiples);
	}


}