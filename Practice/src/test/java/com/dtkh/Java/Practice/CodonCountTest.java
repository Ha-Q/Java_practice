package com.dtkh.Java.Practice;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.duke.FileResource;

public class CodonCountTest {
	private CodonCount codonCount;

	public CodonCountTest() {
		codonCount = new CodonCount();
	}
	
	@Test
	public void buildCodonMapTest() {
		codonCount.buildCondonMap(1, "CGTTCAAGTTCAA");
		System.out.println(codonCount.getCodonsMap());
	}
	
	@Test
	public void getMostCommonCodonTest() {
		codonCount.buildCondonMap(1, "CGTTCAAGTTCAA");
		String resultString = codonCount.getMostCommonCodon();
		assert ("GTT".equals(resultString)) || ("CAA".equals(resultString));
	}
	
	@Test
	public void printCodonCountsTest() {
		codonCount.buildCondonMap(1, "CGTTCAAGTTCAA");
		codonCount.printCodonCounts(0, 10);
	}
	
	@Test
	public void mapCodonsFromFileTest() {
		codonCount.mapCodonsFromFile(new FileResource("smalldna.txt"), 0);
		codonCount.printCodonCounts(0, 10);
	}
}
