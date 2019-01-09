/*
By Abdullahi Farah
Problem 5:
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

public class Problem5 {
	public static void main(String[] args){
		Problem5 test = new Problem5();
		System.out.println(test.solve());
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
}