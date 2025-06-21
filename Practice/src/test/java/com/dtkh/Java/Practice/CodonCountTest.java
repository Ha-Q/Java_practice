package com.dtkh.Java.Practice;

import static org.junit.Assert.*;

import org.junit.Test;

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
}
