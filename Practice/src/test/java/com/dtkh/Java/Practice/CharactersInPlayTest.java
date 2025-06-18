package com.dtkh.Java.Practice;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.duke.FileResource;

public class CharactersInPlayTest {

	private CharactersInPlay playTest;
	public CharactersInPlayTest() {
		playTest = new CharactersInPlay();
	}
	
	@Test
	public void getNameCharacterFromLineTest() {
		String result = playTest.getNameCharacterFromLine("Hello Apolo. Haha.");
		assertEquals("Apolo", result);
	}
	
	@Test
	public void updateTest() {
		playTest.update("LYLY");
	}
	
	@Test
	public void findMaxIndexTest() {
		playTest.findAllCharacters(new FileResource("macbethSmall.txt"));
		int result=playTest.findMaxIndex();
		assertEquals(1, result);		
	}
	
	@Test
	public void findAllCharactersTest() {
		playTest.findAllCharacters(new FileResource("likeit.txt"));
	}
	
	@Test
	public void charactersWithNumPartsTest() {
		playTest.findAllCharacters(new FileResource("likeit.txt"));
		playTest.charactersWithNumParts(10, 15);
	}

}
