/*
By Abdullahi Farah
Problem 9:
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a2 + b2 = c2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
*/

public class Problem9 {
	public static void main(String[] args){
		Problem9 test = new Problem9();
		System.out.println("Solution = " + test.solve());
	}
	public String solve(){
		int limit = 1000;
		int c = 0;

		for(int a = 0; a < limit; a++){
			for(int b = 0; b < limit-a; b++){
				c=limit-(a+b);

				if((a*a)+(b*b)==(c*c) && a!=0 && b!=0 && c!=0){
					return Integer.toString(a*b*c);
				}

			}
		}
		return "No Pythagorean triplet exists for input";
	}
}