package com.dtkh.Java.Practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

import edu.duke.DirectoryResource;

public class WordsInFiles {
	private HashMap<String, ArrayList<String>> wordsMap;

	public WordsInFiles() {
		wordsMap = new HashMap<String, ArrayList<String>>();
	}
	
	public void displayWordsMap() {
		wordsMap.forEach((k, v) -> {System.out.printf("'%s' found in files of %s\n", k, v.toString());});
	}
	
	private void addWordsFromFile(File file) throws FileNotFoundException {
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
	public void buildWordFileMap(File directory) throws FileNotFoundException{
		wordsMap.clear();
		if(directory.isDirectory()) {
			for(File file : directory.listFiles()) {
				addWordsFromFile(file);
			}
		}
	}

	public int maxNumber() {
		int max=0;
		for(Entry<String, ArrayList<String>> entry: wordsMap.entrySet()) {
			int count = entry.getValue().size();
			max = count > max ? count : max;
		}
		return max;
	}
	
	public ArrayList<String> wordsInNumFiles(int number){
		ArrayList<String> resultArrayList = new ArrayList<String>();
		int count = 0;
		for(Entry<String, ArrayList<String>> entry: wordsMap.entrySet()) {
			count = entry.getValue().size();
			if (count == number) {
				resultArrayList.add(entry.getKey());
			}
		}
		return resultArrayList;
	}
}
