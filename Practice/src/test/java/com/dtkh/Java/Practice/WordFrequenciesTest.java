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
		wordFrequencies.findUnique(new FileResource("smallhamlet.txt"));
	}
	
}
