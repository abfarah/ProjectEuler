/*
By Abdullahi Farah
Problem 9:
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

import java.lang.Math;

public class Problem9 {
	public static void main(String[] args){
		Problem9 test = new Problem9();
		System.out.println("Solution = " + test.solve());
	}
	public String solve(){
		int a = 0;
		int b = 0;
		int c = 0;
		int aSquared = 0;
		int bSquared = 0;
		int csSuared = 0;
		int product = 0;

		for(int i = 0; i < 1000; i++){
			for(int j = 0; j < 1000-i; j++){
				a=i;
				b=j;
				c=1000-(a+b);
				aSquared=a*a;
				bSquared=b*b;
				csSuared=c*c;

				if(aSquared+bSquared==csSuared && a!=0 && b!=0 && c!=0){
					product = a*b*c;
					return Integer.toString(product);
				}

			}
		}
		return Integer.toString(product);
	}
}