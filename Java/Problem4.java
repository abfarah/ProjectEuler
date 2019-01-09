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
		System.out.println(test.solve());
		
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
}