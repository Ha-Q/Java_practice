package com.dtkh.Java.Practice;
import java.util.HashMap;

public class CodonCount {
	private HashMap<String, Integer> condonsMap;
	
	public CodonCount() {
		condonsMap = new HashMap<String, Integer>();
	}
	
	public HashMap<String, Integer> getCodonsMap(){
		return condonsMap;
	}

	public void buildCondonMap(int start, String dna) {
		condonsMap.clear();
		int l = dna.length();
		Integer count = 0;
		int end = start + 3;
		while ( start < l && end <= l) {
			String codon = dna.substring(start, end);
			count = condonsMap.get(codon) == null ? 1 : condonsMap.get(codon) + 1;
			condonsMap.put(codon, count);
			start += 3;
			end = start + 3;
		}
	}
}
