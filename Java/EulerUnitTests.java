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
		String slowerResult = test.solve();
		String result = test.solve2();
		assertEquals("233168", slowerResult);
		assertEquals("233168", result);
	}

	@Test
	public void problem2Test(){
		Problem2 test = new Problem2();
		String slowerResult = test.solve();
		String result = test.solve2();
		assertEquals("4613732", slowerResult);
		assertEquals("4613732", result);
	}

	@Test
	public void problem3Test(){
		Problem3 test = new Problem3();
		String slowerResult = test.solve();
		String result = test.solve2();
		assertEquals("6857", slowerResult);
		assertEquals("6857", result);
	}
	
	@Test
	public void problem4Test(){
		Problem4 test = new Problem4();
		String slowerResult = test.solve();
		String result = test.solve2();
		assertEquals("906609", slowerResult);
		assertEquals("906609", result);
	}

	@Test
	public void problem5Test(){
		Problem5 test = new Problem5();
		String slowerResult = test.solve();
		String result = test.solve2();
		assertEquals("232792560", slowerResult);
		assertEquals("232792560", result);
	}

	@Test
	public void problem6Test(){
		Problem6 test = new Problem6();
		String slowerResult = test.solve();
		String result = test.solve2();
		assertEquals("25164150", slowerResult);
		assertEquals("25164150", result);
	}

	@Test
	public void problem7Test(){
		Problem7 test = new Problem7();
		String result = test.solve();
		assertEquals("104743", result);
	}

	@Test
	public void problem8Test(){
		Problem8 test = new Problem8();
		String result = test.solve();
		assertEquals("23514624000", result);
	}

	@Test
	public void problem9Test(){
		Problem9 test = new Problem9();
		String result = test.solve();
		assertEquals("31875000", result);
	}

	@Test
	public void problem10Test(){
		Problem10 test = new Problem10();
		String result = test.solve();
		assertEquals("142913828922", result);
	}
}
