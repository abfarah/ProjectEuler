/*

By Abdullahi Farah

Unit Tests for all the project Euler Solutions

Dependencies: 
		junit-4.10.jar
		hamcrest-core-2.1-rc4.jar


To Test: javac -cp .:junit-4.10.jar EulerUnitTests.java
To Rum: java -cp .:junit-4.10.jar:hamcrest-core-2.1-rc4.jar org.junit.runner.JUnitCore EulerUnitTests
*/


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EulerUnitTests{

	@Test
	public void problem1Test(){
		Problem1 problem1 = new Problem1();
		String result = problem1.solve();
		assertEquals("233168", result);
	}

	@Test
	public void problem2Test(){
		Problem2 problem2 = new Problem2();
		String result = problem2.solve();
		assertEquals("4613732", result);
	}

	@Test
	public void problem3Test(){
		Problem3 problem3 = new Problem3();
		String result = problem3.solve();
		assertEquals("6857", result);
	}
	
	@Test
	public void problem4Test(){
		Problem4 problem4 = new Problem4();
		String result = problem4.solve();
		assertEquals("906609", result);
	}

	@Test
	public void problem5Test(){
		Problem5 problem5 = new Problem5();
		String result = problem5.solve();
		assertEquals("232792560", result);
	}
}
