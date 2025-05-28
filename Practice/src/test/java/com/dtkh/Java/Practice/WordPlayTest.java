package com.dtkh.Java.Practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WordPlayTest {
	WordPlay word;
	public WordPlayTest(){
		word = new WordPlay();
	}

	@Test
	public void isVowelTest() {
		assertTrue(word.isVowel('a'));
		assertFalse(word.isVowel('b'));
	}
	
	@Test
	public void replaceVowelsTest() {
		String str = word.replaceVowels("HelloWorld", '*');
		String str1 = word.replaceVowels("H4ll0W0rld", '*');
		assertEquals(str, "H*ll*W*rld");
		assertEquals(str1, "H4ll0W0rld");
	}
	
	@Test
	public void emphasizeTest() {
		String str = word.emphasize("dna ctgaaactga", 'a');
		String str1 = word.emphasize("Mary Bella Abracadabra", 'a');
		assertEquals(str, "dn* ctg+*+ctg+");
		assertEquals(str1, "M+ry Bell+ +br*c*d*br+");
	}
	
}
