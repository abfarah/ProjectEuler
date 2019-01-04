/*
By Abdullahi Farah
Problem 4:
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/

import java.lang.Math;

public class Problem4 {
	public static void main(String[] args){
	    Problem4 test = new Problem4();
	    System.out.println(test.isPalindrome("123454321"));
		
		System.out.println(test.solve());
		
	}
	
	//Only going to check the products of 900 to 999
	public String solve(){
		int numb = -1;
		for (int i = 100; i < 1000; i++){
		    for(int j = 100; j < 1000; j++){
		        int product = i * j;
		        if(isPalindrome(Integer.toString(product)) && product > numb){
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