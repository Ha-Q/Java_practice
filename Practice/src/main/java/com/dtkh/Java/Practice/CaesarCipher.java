package com.dtkh.Java.Practice;

public class CaesarCipher {

	public CaesarCipher() {
	}
	public String encrypt(String input, int key) {
		int KEY = key % 26;
		String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		char indexCh = '0';
		int cipherIndex = 0;
		char cipherCh = '0';
		int l = input.length();
		StringBuilder cipherAlphabet = new StringBuilder(ALPHABET);
		CharSequence startSubCharSequence = cipherAlphabet.subSequence(KEY, ALPHABET.length());
		cipherAlphabet.insert(0,startSubCharSequence);
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < l; i++) {
			indexCh = input.charAt(i);
			if(indexCh > 64 && indexCh < 91 ) {
				cipherIndex = ALPHABET.indexOf(Character.toLowerCase(indexCh));
				cipherCh = Character.toUpperCase(cipherAlphabet.charAt(cipherIndex));
				sb.append(cipherCh);
			}
			else if(indexCh > 96 && indexCh < 123 ) {
				cipherIndex = ALPHABET.indexOf(indexCh);
				cipherCh = cipherAlphabet.charAt(cipherIndex);
				sb.append(cipherCh);
			}
			else {
				sb.append(indexCh);
			}
		}
		return sb.toString();
	}

	public char encryptChar(char ch, int key) {
		int KEY = key % 26;
		int cipherIndex = 0;
		char cipherCh = '0';
		String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
		StringBuilder cipherAlphabet = new StringBuilder(ALPHABET);
		CharSequence startSubCharSequence = cipherAlphabet.subSequence(KEY, ALPHABET.length());
		cipherAlphabet.insert(0,startSubCharSequence);
			if(ch > 64 && ch < 91 ) {
				cipherIndex = ALPHABET.indexOf(Character.toLowerCase(ch));
				cipherCh = Character.toUpperCase(cipherAlphabet.charAt(cipherIndex));
			}
			else if(ch > 96 && ch < 123 ) {
				cipherIndex = ALPHABET.indexOf(ch);
				cipherCh = cipherAlphabet.charAt(cipherIndex);
			}
			else {
				cipherCh = ch;
			}
		return cipherCh;
	}
	public String encryptTwoKeys(String input, int key1, int key2) {
		int l = input.length();
		char charIndex = '0';
		char charCipher = '0';
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < l; i++) {
			charIndex = input.charAt(i);
			if((i % 2) == 0) {
				charCipher = encryptChar(charIndex, key1);
			}
			else {
				charCipher = encryptChar(charIndex, key2);
			}
			sb.append(charCipher);
		}
		return sb.toString();
	}
		
}

