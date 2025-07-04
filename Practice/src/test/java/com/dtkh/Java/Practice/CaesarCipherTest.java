package com.dtkh.Java.Practice;
import edu.duke.*;
import static org.junit.Assert.assertEquals;

import java.io.FileWriter;
import java.io.IOException;

import org.junit.Test;

public class CaesarCipherTest {
	private CaesarCipher cipher;
	public CaesarCipherTest() {
		cipher = new CaesarCipher();
	}
	@Test
	public void encryptTest() {
		String result = cipher.encrypt("Can you imagine life WITHOUT the internet AND computers in your pocket?", 15);
//		String expectedResult = "CFOPQ IBDFLK XQQXZH BXPQ CIXKH!";
//		String result1 = cipher.encrypt("First Legion", 17);
//		String expectedResult1 = "Wzijk Cvxzfe";
//		assertEquals(result, expectedResult);
//		assertEquals(result1, expectedResult1);
		System.out.print(result);
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
		String result = cipher.encryptTwoKeys("Hfs cpwewloj loks cd Hoto kyg Cyy.", 26-14, 26-24);
		System.out.println(result);
//		assertEquals(result, "Czojq Ivdzle");
	}
	@Test
	public void encryptFromAndToFileTest() {
		try {
			FileWriter fileWriter = new FileWriter("src/test/java/encrypted.txt");
			cipher.encryptFromAndToFile(new FileResource("smallhamlet.txt"), fileWriter, 15);
			FileResource reader = new FileResource("src/test/java/encrypted.txt");
			String result = reader.asString().trim();
//			assertEquals("Yjhipithihigxcvlxiwadihduttttttttttttttttth", result);
		}
		catch (Exception exp) {
			System.out.println(exp);
		}
	}
	@Test
	public void encryptTwoKeysFromAndToFileTest() {
		try {
			FileResource read = new FileResource("smallhamlet.txt");
			FileWriter write = new FileWriter("src/test/java/encrypted2keys.txt");
			cipher.encryptTwoKeysFromAndToFile(read, write, 3, 4);	
		}

		catch (Exception exp) {
			System.out.print(exp);
		}
	}
}
