package com.dtkh.Java.Practice;
import edu.duke.*;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

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
	@Test
	public void countLettersTest() {
		FileResource file = new FileResource("smallhamlet.txt");
		cipherBreaker.countLetters(file);
		int[] expected = {0,0,0,0,
						  2,0,0,1,
						  0,0,0,2,
						  0,0,1,0,
						  0,0,1,2,
						  0,0,0,0,
						  0,0 };
		int[] counts = cipherBreaker.getCounts();
		assertArrayEquals(expected, counts);
	}
	@Test
	public void maxIndexTest() {
		FileResource file = new FileResource("smallhamlet.txt");
		cipherBreaker.countLetters(file);
		int result = cipherBreaker.maxIndex(cipherBreaker.getCounts());
		assertEquals(5, result);
	}
	@Test
	public void halfOfStringTest() {
//		String result = cipherBreaker.halfOfString("ABCDEF", 0);
//		String result1 = cipherBreaker.halfOfString("ABCDEF", 1);
		String result2 = cipherBreaker.halfOfString("ABCDEF", 2);
//		assertEquals("ACE", result);
//		assertEquals("BDF", result1);
		assertEquals("CE", result2);
	}
	@Test
	public void decryptTest() {
		String result = cipherBreaker.decrypt("a", 23);
		assertEquals("d", result);
	}
	@Test
	public void resetCountsTest() {
		int[] expected = new int[26];
		cipherBreaker.countLetters(new FileResource("smallhamlet.txt"));
		cipherBreaker.resetCounts();
		int[] result = cipherBreaker.getCounts();
		assertArrayEquals(expected, result);
	}
	
	@Test
	public void getKeyTest() {
		String messageString = new FileResource("encrypted.txt").asString();	
		int result = cipherBreaker.getKey(messageString);
		assertEquals(15, result);
	}
	
	@Test
	public void decryptTwoKeysTest() {
		FileResource fileResource = new FileResource("encrypted2keys.txt");
		String resultString = cipherBreaker.decryptTwoKeys(fileResource).trim();
		System.out.println(resultString);
//		assertEquals("Just a test string with lots of eeeeeeeeeeeeeeeees", resultString);
	}
}
