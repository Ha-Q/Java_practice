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
		int result = wl.getWordLength("\"hello\"");
		int result1 = wl.getWordLength("hello");
		int result2 = wl.getWordLength("hello.,,");
		int result3 = wl.getWordLength("\"hello.,,,\"");
		int result4 = wl.getWordLength("!,hello");
		assertEquals(result, 5);
		assertEquals(result1, 5);
		assertEquals(result2, 5);
		assertEquals(result3, 9);
		assertEquals(5, result4);
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
		FileResource file = new FileResource("smallhamlet.txt");
		int[] counts = new int[31];
		wl.countWordLengths(file, counts);			
	}
}
