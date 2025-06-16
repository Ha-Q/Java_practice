package com.dtkh.Java.Practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class CharactersInPlayTest {

	private CharactersInPlay playTest;
	public CharactersInPlayTest() {
		playTest = new CharactersInPlay();
	}
	
	@Test
	public void getNameCharacterFromLineTest() {
		String result = playTest.getNameCharacterFromLine("Apolo. Haha");
		assertEquals("Apolo", result);
	}

}
