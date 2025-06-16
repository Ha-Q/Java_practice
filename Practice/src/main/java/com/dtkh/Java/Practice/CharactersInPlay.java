package com.dtkh.Java.Practice;

import java.util.ArrayList;

import edu.duke.FileResource;

public class CharactersInPlay {
	private ArrayList<String> characterNames;
	private ArrayList<Integer> characterCounts;
	
	public CharactersInPlay() {
		characterCounts = new ArrayList<Integer>();
		characterNames = new ArrayList<String>();
	}

	public void update(String person) {
		int indexOfCharacterName = characterNames.indexOf(person);
		if(indexOfCharacterName != -1) {
			int line = characterCounts.get(indexOfCharacterName) + 1;
			characterCounts.set(indexOfCharacterName, line);
		}
		else {
			characterNames.add(person);
			characterCounts.add(1);			
		}
	}
	
	public void findAllCharacters(FileResource file) {
		characterCounts.clear();
		characterNames.clear();
		int periodIndex = 0;
		for(String line : file.lines()) {
			periodIndex = line.indexOf('.');
		}
	}
	public String getNameCharacterFromLine(String line) {
		int periodIndex = line.indexOf('.');
		StringBuilder  builder = new StringBuilder();
		if (periodIndex != -1 && periodIndex < line.length() - 1) {
			int i = periodIndex - 1;
			while(i >= 0 && Character.isLetter(line.charAt(i))) {
				builder.insert(0, line.charAt(i));
				i--;
			}
		}
		return builder.toString();
	}
}
