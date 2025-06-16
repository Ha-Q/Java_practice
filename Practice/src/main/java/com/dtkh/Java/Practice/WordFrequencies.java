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

}
