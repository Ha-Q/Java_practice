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
				counts[alphabetIndex] += 1;
			}
		}
	}
	
	public int[] getCounts() {
		return counts;
	}
	public void resetCounts() {
		counts = new int[26];
	}
	
	public void countLetters(FileResource resource) {
		for(String word: resource.words()) {
			countLettersFromWord(word);
		}
	}
	
	public int[] countLetters(String word) {
		int[] countLetters = new int[26];
		char ch = '0';
		int alphabetIndex = 0;
		for(int i=0; i< word.length(); i++) {
			ch = Character.toLowerCase(word.charAt(i));
			if (ch < 123 && ch > 96) {
				alphabetIndex = ALPHABET.indexOf(ch);
				countLetters[alphabetIndex] += 1;
			}
		}
		return countLetters;
	}
	
	
	public String decrypt(String message, int key) {
		return cipher.encrypt(message, 26 - key);
	}
	
	public int maxIndex(int[] counts) {
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
	
	public int getKey(String message) {
		int maxIndex = 0;
		int key = 0;
		for(int i = 0; i < 26; i++) {
			String decryptedMessage = decrypt(message, i);
			int[] countLetters = countLetters(decryptedMessage);
			maxIndex = maxIndex(countLetters);
			if(maxIndex == 4) {
				key = i;
				break;
			}
		}
		return key;
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
	
	public String decryptTwoKeys(FileResource encryptedFile) {
		String message = encryptedFile.asString();
		String encrypted1stHalf = halfOfString(message,0);
		String encrypted2ndHalf = halfOfString(message,1);
		int firstKey = getKey(encrypted1stHalf);
		int secondKey= getKey(encrypted2ndHalf);
		System.out.printf("%d %d\n", firstKey, secondKey);
		return cipher.encryptTwoKeys(message, 26 - firstKey, 26 -secondKey);	
	}
	
}
