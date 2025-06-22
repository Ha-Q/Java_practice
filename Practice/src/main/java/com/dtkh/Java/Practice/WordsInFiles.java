package com.dtkh.Java.Practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class WordsInFiles {
	private HashMap<String, ArrayList<String>> wordsMap;

	public WordsInFiles() {
		wordsMap = new HashMap<String, ArrayList<String>>();
	}
	
	public void displayWordsMap() {
		wordsMap.forEach((k, v) -> {System.out.printf("'%s' found in files of %s\n", k, v.toString());});
	}
	
	public void addWordsFromFile(File file) throws FileNotFoundException {
		String fileName = file.getName();
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine()) {
			String[] words = scanner.nextLine().split(" ");
			for(String word: words) {
				if(wordsMap.get(word) == null) {
					ArrayList<String> arrayList = new ArrayList<String>();
					arrayList.add(fileName);
					wordsMap.put(word, arrayList);
				}
				else {
					if(!wordsMap.get(word).contains(fileName)) {
						wordsMap.get(word).add(fileName);
					}
				}
			}
		}
		scanner.close();
	}

}
