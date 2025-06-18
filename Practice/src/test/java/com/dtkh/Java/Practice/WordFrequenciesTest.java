package com.dtkh.Java.Practice;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.duke.FileResource;

public class WordFrequenciesTest {
	private WordFrequencies wordFrequencies;

	public WordFrequenciesTest() {
		wordFrequencies = new WordFrequencies();
		// TODO Auto-generated constructor stub
	}

	@Test
	public void getWordTest() {
		String result = wordFrequencies.getWord("word...");
		assertEquals("word", result);
	}
	@Test
	public void findUniqueTest() {
		wordFrequencies.findUnique(new FileResource("likeit.txt"));
	}
	@Test
	public void getMaxTest() {
		wordFrequencies.findUnique(new FileResource("smallhamlet.txt"));
		int result = wordFrequencies.getMax();
		assertEquals(2, result);
	}
	@Test
	public void findIndexOfMaxTest() {
		wordFrequencies.findUnique(new FileResource("likeit.txt"));
		int result = wordFrequencies.findIndexOfMax();
//		assertEquals(0, result);
	}
	
	@Test
	public void displayNonLetterInWordTest() {
		wordFrequencies.displayNonLetterInWord(new FileResource("likeit.txt"));
	}
	
	@Test
	public void findUniqueWordsIncludingPunctuationTest() {
		wordFrequencies.findUniqueWordsIncludingPunctuation(new FileResource("likeit.txt"));
		int result = wordFrequencies.findIndexOfMax();
	}
	
}
