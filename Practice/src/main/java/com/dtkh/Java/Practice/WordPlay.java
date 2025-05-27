package com.dtkh.Java.Practice;

public class WordPlay {
	public boolean isVowel(char ch) {
		boolean result = false;
		char newCh = Character.toLowerCase(ch);
		if (newCh == 'a' 
				|| newCh == 'e' 
				|| newCh == 'i' 
				|| newCh == 'o' 
				|| newCh == 'u')
			result = true;
		return result;		
	}
	public String replaceVowels(String phrase, char ch) {
		StringBuilder sb = new StringBuilder(phrase);
		char charIndex = '0';
		for(int i = 0; i < sb.length(); i++) {
			charIndex = sb.charAt(i);
			if(isVowel(charIndex)) {
				sb.replace(i, i + 1, String.valueOf(ch));
			}
		}
		return sb.toString();
	}
	
	public String emphasize(String phrase, char ch) {
		
	}
}
