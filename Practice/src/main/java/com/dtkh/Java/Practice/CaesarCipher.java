package com.dtkh.Java.Practice;

public class CaesarCipher {

	public CaesarCipher() {
	}
	public String encrypt(String input, int key) {
		int KEY = key % 26;
		char indexCh = '0';
		StringBuilder alphabet = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
		String endSubString = alphabet.substring(KEY);
		alphabet.replace(0, KEY, endSubString);
		StringBuilder sb = new StringBuilder(input);
		for(int i = 0; i < input.length(); i++) {
			indexCh = input.charAt(i);
			String replacingLetter = 
			if(indexCh > 64 && indexCh < 91 ) {
				
			}
			else if(indexCh > 96 && indexCh < 123 ) {
				
			}
		}
		
	}

}
