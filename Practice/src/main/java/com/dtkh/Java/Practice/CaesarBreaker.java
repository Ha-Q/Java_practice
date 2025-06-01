package com.dtkh.Java.Practice;
import edu.duke.*;

public class CaesarBreaker {

	private CaesarCipher cipher;
	private int[] counts;
	private final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	public CaesarBreaker() {
		cipher = new CaesarCipher();
		counts = new int[26];
	}
	
	
	public void countLettersFromWord(String word) {
		char ch = '0';
		int alphabetIndex = 0;
		for(int i=0; i< word.length(); i++) {
			ch = Character.toLowerCase(word.charAt(i));
			if (ch < 123 && ch > 96) {
				alphabetIndex = ALPHABET.indexOf(ch);
				counts[alphabetIndex] += 1;
			}
		}
	}
	
	public int[] getCounts() {
		return counts;
	}
	
	public void countLetters(FileResource resource) {
		for(String word: resource.words()) {
			countLettersFromWord(word);
		}
	}
}
