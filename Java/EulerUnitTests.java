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
		Problem1 test = new Problem1();
		String result = test.solve();
		assertEquals("233168", result);
	}

	@Test
	public void problem2Test(){
		Problem2 test = new Problem2();
		String result = test.solve();
		assertEquals("4613732", result);
	}

	@Test
	public void problem3Test(){
		Problem3 test = new Problem3();
		String result = test.solve();
		assertEquals("6857", result);
	}
	
	@Test
	public void problem4Test(){
		Problem4 test = new Problem4();
		String result = test.solve();
		assertEquals("906609", result);
	}

	@Test
	public void problem5Test(){
		Problem5 test = new Problem5();
		String result = test.solve();
		assertEquals("232792560", result);
	}

	@Test
	public void problem6Test(){
		Problem6 test = new Problem6();
		String result = test.solve();
		assertEquals("25164150", result);
	}
}
