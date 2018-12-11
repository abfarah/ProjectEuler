/*

By Abdullahi Farah

Problem 1:
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.

*/
public class Problem1 {
	public static void main(String[] args){
		int numb = 1000;
		int numbOfMultiples;
		int[] multiples = new int[1000];
		int sumOfMultiples = 0;
		int count = 0;

		// First step find all multiples of 3 and 5 or both below 1000
		for (int i = 0; i <= 1000; i++){
			if((i%3) == 0){
				multiples[count] = i;
				count++;
			} else if(i%5 == 0){
				multiples[count] = i;
				count++;
			} 
		}

		for(int item : multiples) {
			sumOfMultiples = sumOfMultiples + item;
		}

		System.out.println(sumOfMultiples);
	}
}