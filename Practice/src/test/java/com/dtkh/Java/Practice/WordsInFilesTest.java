package com.dtkh.Java.Practice;

import java.io.File;

import org.junit.Test;

public class WordsInFilesTest {
	private WordsInFiles wordsInFiles;

	public WordsInFilesTest() {
		wordsInFiles = new WordsInFiles();
	}

	@Test
	public void addWordsFromFileTest() {
		try {
			wordsInFiles.addWordsFromFile(new File("src/test/java/smallhamlet.txt"));
			wordsInFiles.displayWordsMap();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
