package com.dtkh.Java.Practice;

import java.util.ArrayList;

import edu.duke.FileResource;


public class WordFrequencies {
	private ArrayList<String> myWords;
	private ArrayList<Integer> myFrequencies;
	
	public WordFrequencies() {
		myWords = new ArrayList<String>();
		myFrequencies = new ArrayList<Integer>();
	}
	public void findUnique(FileResource file) {
		 myWords.clear();
		 myFrequencies.clear();
		 String realWord = "";
		 int indexItem = 0;
		 int index = 0;
		 for(String word: file.words()) {
			 realWord = getWord(word).toLowerCase();
			 index = myWords.indexOf(realWord);
			 if( index != -1) {
				 indexItem = myFrequencies.get(index) + 1;
				 myFrequencies.set(index, indexItem);
			 } else {
				 myWords.add(realWord);
				 myFrequencies.add(1);
			 }
		 }
		 System.out.println(myWords);
		 System.out.println(myFrequencies);
		 System.out.println(myWords.size());
	}
	public String getWord(String word) {
		StringBuilder stringBuilder = new StringBuilder();
		char ch = '0';
		for(int i=0; i < word.length(); i++) {
			ch = word.charAt(i);
			if(Character.isLetter(ch)) {
				stringBuilder.append(ch);
			}
		}
		return stringBuilder.toString();
	}
	
	public int getMax() {
		int max = 0;
		for(int indexValue: myFrequencies) {
			if(indexValue > max) {
				max = indexValue;
			}
		}
		return max;
	}
	
	public int findIndexOfMax() {
		int value = getMax();
		int index = myFrequencies.indexOf(value);
		System.out.printf("The word that occurs most often and its count are: %s with %d repetitions \n", myWords.get(index), value);
		return index;
	}

	public void displayNonLetterInWord(FileResource file) {
		for(String word : file.words()) {
			if (word.contains("\"") || word.contains(" ")) System.out.printf("This word contains: '%s'\n", word);
		}
	}
	
	private boolean isOnlyQuotationMark(String s) {
		return s.equals("\"");
	}
	public void findUniqueWordsIncludingPunctuation(FileResource file) {
		 myWords.clear();
		 myFrequencies.clear();
		 String realWord = "";
		 int indexItem = 0;
		 int index = 0;
		 for(String word: file.words()) {
			 if(!isOnlyQuotationMark(word)) {

			 }
			 realWord = word.toLowerCase();
			 index = myWords.indexOf(realWord);
			 if( index != -1) {
				 indexItem = myFrequencies.get(index) + 1;
				 myFrequencies.set(index, indexItem);
			 } else {
				 myWords.add(realWord);
				 myFrequencies.add(1);
			 }
		 }
		 System.out.println(myWords);
		 System.out.println(myFrequencies);
		 System.out.println(myWords.size());
	}
}
