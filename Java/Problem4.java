/*
By Abdullahi Farah
Problem 4:
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 * 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

import java.lang.Math;

public class Problem4 {
	public static void main(String[] args){
		Problem4 test = new Problem4();
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
	
	//Only going to check the products of 900 to 999
	public String solve(){
		int numb = -1;
		for (int i = 999; i > 900; i--){
		    for(int j = 999; j > 900; j--){
		        int product = i * j;
		        if(product > numb && isPalindrome(Integer.toString(product))){
		            numb = product;
		        }
		    }
		}

		return Integer.toString(numb);
	}
	
	private boolean isPalindrome(String text) {
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

	public String solve2(){
		int numb = 999;
		int count;
		int palindrome = 0;
		int divisbleCount;
		
		while (numb >= 100) {
			if (numb % 11 == 0){
				count = 999;
				divisbleCount = 1;
			} else {
				count = 990;
				divisbleCount = 11;
			}
			while (count >= numb) {
				if (count * numb <= palindrome){
					break;
				} else if (isPalindrome(Integer.toString(count * numb))) {
					palindrome = count * numb;
				}
				count = count - divisbleCount;
			}
			numb--;
		}

		return Integer.toString(palindrome);
	}
}