package com.dtkh.Java.Practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CaesarCipherTest {
	private CaesarCipher cipher;
	public CaesarCipherTest() {
		cipher = new CaesarCipher();
	}
	@Test
	public void encryptTest() {
		String result = cipher.encrypt("FIRST LEGION ATTACK EAST FLANK!", 23);
		String expectedResult = "CFOPQ IBDFLK XQQXZH BXPQ CIXKH!";
		String result1 = cipher.encrypt("First Legion", 17);
		String expectedResult1 = "Wzijk Cvxzfe";
		assertEquals(result, expectedResult);
		assertEquals(result1, expectedResult1);
	}
	@Test
	public void encryptChTest() {
		char result = cipher.encryptChar('F', 23);
		char result1 = cipher.encryptChar('I', 17);
		char result2 = cipher.encryptChar('!', 17);
		assertEquals(result, 'C');
		assertEquals(result1, 'Z');
		assertEquals(result2, '!');
	}
	@Test
	public void encryptTwoKeysTest() {
		String result = cipher.encryptTwoKeys("First Legion", 23, 17);
		assertEquals(result, "Czojq Ivdzle");
	}

}
