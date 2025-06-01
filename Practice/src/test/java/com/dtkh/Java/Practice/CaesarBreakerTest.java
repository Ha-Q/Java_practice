package com.dtkh.Java.Practice;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CaesarBreakerTest {

	private CaesarBreaker cipherBreaker;
	public CaesarBreakerTest() {
		cipherBreaker = new CaesarBreaker();
	}

	@Test
	public void countLettersFromWordTest() {
		cipherBreaker.countLettersFromWord("hello");
		int[] expected = {0,0,0,0,
						  1,0,0,1,
						  0,0,0,2,
						  0,0,1,0,
						  0,0,0,0,
						  0,0,0,0,
						  0,0 };
		int[] counts = cipherBreaker.getCounts();
		assertArrayEquals(expected, counts);
	}
}
