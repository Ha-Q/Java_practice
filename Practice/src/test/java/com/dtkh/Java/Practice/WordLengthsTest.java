package com.dtkh.Java.Practice;
import edu.duke.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordLengthsTest {

	private WordLengths wl;
	public WordLengthsTest() {

		wl = new WordLengths();
	}

	@Test
	public void getWordLengthTest() {
		String result = wl.getWord("\"hello\"");
		String result1 = wl.getWord("hello");
		String result2 = wl.getWord("hello.,,");
		String result3 = wl.getWord("\"hello.,,,\"");
		String result4 = wl.getWord("!,hello");
		assertEquals("hello", result);
		assertEquals("hello", result1);
		assertEquals("hello", result2);
		assertEquals("hello.,,,", result3);
		assertEquals("hello", result4);
	}
	@SuppressWarnings("null")
	@Test
	public void appendWordTest() {
		StringBuilder[] sb = new StringBuilder[1];
		wl.appendWord("testing", sb, 0);
		assertEquals("testing", sb[0].toString());
	}
	@Test
	public void countWordLengthsTest() {
		FileResource file = new FileResource("romeo.txt");
		int[] counts = new int[31];
		wl.countWordLengths(file, counts);			
	}
	@Test
	public void indexOfMaxTest() {
		int[] arr = {1, 2, 3};
		int result = wl.indexOfMax(arr);
		assertEquals(3, result);
	}
}
