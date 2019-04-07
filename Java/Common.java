/*
By Abdullahi Farah
Common:

Created a common class for functions used across many problems

*/

import java.lang.Math;

public class Common {
	public static boolean isPrime(long number){
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

	public static boolean isPalindrome(String text) {
	    String reverse = "";
	    for(int i = text.length() - 1; i >= 0; i--)
        {
            reverse = reverse + text.charAt(i);
        }
        
        if (text.equals(reverse)){
            return true;
        } else {
            return false;
        }
	}

	public static boolean isEvenlyDivisible(int numb, int rangeStart, int rangeEnd){
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