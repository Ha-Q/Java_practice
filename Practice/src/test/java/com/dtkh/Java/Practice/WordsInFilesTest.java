package com.dtkh.Java.Practice;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import edu.duke.DirectoryResource;

public class WordsInFilesTest {
	private WordsInFiles wordsInFiles;

	public WordsInFilesTest() {
		wordsInFiles = new WordsInFiles();
	}

//	@Test
//	public void addWordsFromFileTest() {
//		try {
//			wordsInFiles.addWordsFromFile(new File("src/test/java/smallhamlet.txt"));
//			wordsInFiles.displayWordsMap();
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//
//	}
	
	@Test
	public void buildWordFileMapTest() {
		try {
			wordsInFiles.buildWordFileMap(new File("src/test/java/test"));
			wordsInFiles.displayWordsMap();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void maxNumberTest() {
		try {
			wordsInFiles.buildWordFileMap(new File("src/test/java/test"));
			wordsInFiles.displayWordsMap();
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			int result = wordsInFiles.maxNumber();
			assertEquals(1, result);
		}
	}
	
	@Test
	public void wordsInNumFilesTest() {
		try {
			wordsInFiles.buildWordFileMap(new File("src/test/java/test"));
			wordsInFiles.displayWordsMap();
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println(wordsInFiles.wordsInNumFiles(1));
		}
	}
}
