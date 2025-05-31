package com.dtkh.Java.Practice;

import edu.duke.FileResource;

public class WordLengths {

	public WordLengths() {
		// TODO Auto-generated constructor stub
	}
	
	public int getWordLength(String word) {
		int l = word.length();
		int mid = l/2;
		int s = 0;
		int e = l - 1;
		int count = 0;
		char startLetter = word.charAt(s);
		char endLetter = word.charAt(e);		
		if (startLetter == '"' && endLetter == '"') {
			return l - 2;
		}
		else {
			while(!Character.isLetter(startLetter) && s < mid) {
				s++;
				count--;
				startLetter = word.charAt(s);
			}
			while(!Character.isLetter(endLetter) && e > mid) {
				e--;
				count--;
				endLetter = word.charAt(e);
			}
			return l + count;
		}
	}
	
	public void printWordLength(StringBuilder[] sb, int[]counts) {
		for(int i=0; i < counts.length; i++) {
			int count = counts[i];
			StringBuilder words = sb[i];
			if (count != 0 && words != null) {
				System.out.println(String.format("%d words of length %d: %s", count, i, words.toString()));
			}
		}
	}
	
	public void appendWord(String word, StringBuilder sb[], int index) {
		if(sb[index] == null) {
			sb[index] = new StringBuilder(word);
		}
		else {
			sb[index].append(String.format(" %s", word));
		}
	}
	public void countWordLengths(FileResource resource, int[] counts) {
		int wordLength;
		int l = counts.length;
		StringBuilder[] arraySB = new StringBuilder[l];
		for(String word: resource.words()) {
			wordLength = getWordLength(word);
			if(wordLength < l) {
				counts[wordLength] += 1;
				appendWord(word, arraySB, wordLength);
			}
			else {
				counts[l-1] += 1;
				appendWord(word, arraySB, l-1);
			}			
		}
		printWordLength(arraySB, counts);
	}
}
