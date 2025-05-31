package com.dtkh.Java.Practice;

import edu.duke.FileResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        WordPlay word = new WordPlay();
//        System.out.print(word.replaceVowels("HelloWorld", '*'));
//        CaesarCipher cipher = new CaesarCipher();
//        System.out.print(cipher.encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
		FileResource file = new FileResource("src/test/java/smallhamlet.txt");
		int[] counts = new int[31];
		WordLengths wl = new WordLengths();
		wl.countWordLengths(file, counts);	

    }
}
