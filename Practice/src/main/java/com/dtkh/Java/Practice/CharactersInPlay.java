package com.dtkh.Java.Practice;

import java.util.ArrayList;

import edu.duke.FileResource;

public class CharactersInPlay {
	private ArrayList<String> characterNames;
	private ArrayList<Integer> characterCounts;
	private final static String EXCLUDE = "I II III IV V VI VII VIII IX X XI XII XIII XIV XV XVI XVII XVIII XIX XX";
	
	
	public CharactersInPlay() {
		characterCounts = new ArrayList<Integer>();
		characterNames = new ArrayList<String>();
	}
	
	private boolean isRomanNumber(String word) {
		return EXCLUDE.contains(word);
	}

	public void update(String person) {
		person = person.toLowerCase();
		int indexOfCharacterName = characterNames.indexOf(person);
		if(indexOfCharacterName != -1) {
			int line = characterCounts.get(indexOfCharacterName) + 1;
			characterCounts.set(indexOfCharacterName, line);
		}
		else {
			characterNames.add(person);
			characterCounts.add(1);			
		}
//		System.out.println(characterCounts);
//		System.out.println(characterNames);
	}
	
	public int findMaxIndex() {
		int max= 0;
		int index=0;
		int value=0;
		for(int i=0; i < characterCounts.size(); i++) {
			value = characterCounts.get(i);
			if( value > max) {
				max = value;
				index = i;
			}
		}
		return index;		
	}
	
	public void findAllCharacters(FileResource file) {
		characterCounts.clear();
		characterNames.clear();
		for(String line : file.lines()) {
			String name = getNameCharacterFromLine(line);
			if((!name.isEmpty() || !name.isBlank()) && !isRomanNumber(name)) update(name);
		}
		int index = findMaxIndex();
		int count = characterCounts.get(index);
		String mainCharacter= characterNames.get(index).toUpperCase();
		printUpperCaseCharacter(mainCharacter, count);
	}
	public String getNameCharacterFromLine(String line) {
		int periodIndex = line.indexOf('.');
		StringBuilder  builder = new StringBuilder();
		if (periodIndex != -1 && periodIndex < line.length() - 1) {
			int i = periodIndex - 1;
			while(i >= 0 && isCharUpperCaseAlphabet(line.charAt(i))) {
				builder.insert(0, line.charAt(i));
				i--;
			}
		}
		return builder.toString();
	}
	
	private boolean isCharUpperCaseAlphabet(char ch) {
		return ch > 64 && ch < 91;
	}
	
	private void printUpperCaseCharacter(String name, int count) {
		System.out.printf("The main character is %s with %d lines\n", name.toUpperCase(), count);
	}
	
	
	public void charactersWithNumParts(int num1, int num2) {
		int value=0;
		for(int i=0; i< characterCounts.size(); i++) {
			value = characterCounts.get(i);
			if(value >= num1 && value <= num2) {
				printUpperCaseCharacter(characterNames.get(i), value);
			}
		}
	}
}
