package com.dtkh.Java.Practice;

import org.junit.Test;

public class CodonCountTest {
	private CodonCount codonCount;

	public CodonCountTest() {
		codonCount = new CodonCount();
	}
	
	@Test
	public void buildCondonMapTest() {
		codonCount.buildCondonMap(1, "CGTTCAAGTTCAA");
		System.out.println(codonCount.getCodonsMap());
	}

}
