package com.dtkh.Java.Practice;

import edu.duke.FileResource;

public class WordLengths {

	public WordLengths() {
		// TODO Auto-generated constructor stub
	}
	
	public String getWord(String word) {
		int s = 0;
		int e = word.length() - 1;
		char startLetter = word.charAt(s);
		char endLetter = word.charAt(e);		
		if (startLetter == '"' && endLetter == '"') {
			return word.substring(1, e);
		}
		else {
			StringBuilder sb = new StringBuilder(word);
			int l = sb.length();
			while(!Character.isLetter(startLetter) && l > 0) {
				s++;
				sb.deleteCharAt(0);
				l = sb.length();
                       			}
			while(!Character.isLetter(endLetter) && l > 0) {
				e--;
				sb.deleteCharAt(l-1);
				l = sb.length();
				endLetter = word.charAt(e);
			}
			return sb.toString();
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
		String realWord;
		int l = counts.length;
		StringBuilder[] arraySB = new StringBuilder[l];
		for(String word: resource.words()) {
			realWord = getWord(word);
			wordLength = realWord.length();
			if(wordLength < l) {
				counts[wordLength] += 1;
				appendWord(realWord, arraySB, wordLength);
			}
			else {
				counts[l-1] += 1;
				appendWord(realWord, arraySB, l-1);
			}			
		}
		System.out.println("the most common word length in the file: " + indexOfMax(counts));
		printWordLength(arraySB, counts);
	}
	public int indexOfMax(int[] values) {
		int max = values[0];
		for(int i = 1; i < values.length; i++) {
			max = max > values[i] ? max : values[i];
		}
		return max;
	}
	
}
