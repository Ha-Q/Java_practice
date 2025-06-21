package com.dtkh.Java.Practice;
import java.util.HashMap;
import java.util.Map;

public class CodonCount {
	private HashMap<String, Integer> codonsMap;
	public CodonCount() {
		codonsMap = new HashMap<String, Integer>();
	}
	
	public HashMap<String, Integer> getCodonsMap(){
		return codonsMap;
	}

	public void buildCondonMap(int start, String dna) {
		codonsMap.clear();
		int l = dna.length();
		Integer count = 0;
		int end = start + 3;
		while ( start < l && end <= l) {
			String codon = dna.substring(start, end);
			count = codonsMap.get(codon) == null ? 1 : codonsMap.get(codon) + 1;
			codonsMap.put(codon, count);
			start += 3;
			end = start + 3;
		}
	}
	
	public String getMostCommonCodon() {
		String codon = "";
		Integer max = 0;
		for(String key : codonsMap.keySet()) {
			if (codonsMap.get(key) > max) {
				max = codonsMap.get(key);
				codon = key;
			}
		}
		return codon;
	}
}
