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
	public int maxIndex() {
		int maxIndex = 0;
		int maxValue = counts[0];
		int indexValue = 0;
		for(int i = 1; i < counts.length; i++) {
			indexValue = counts[i];
			if(maxValue <= indexValue) {
				maxValue = indexValue;
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	public String halfOfString(String message, int start) {
		StringBuilder sb = new StringBuilder();
		char indexCh = '0';
		for(int i = start; i < message.length(); i +=2) {
			indexCh = message.charAt(i);
			sb.append(indexCh);
		}
		return sb.toString();
	}
}
