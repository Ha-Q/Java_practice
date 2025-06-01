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
        CaesarCipher cipher = new CaesarCipher();
        System.out.println(cipher.encryptTwoKeys("cat can sing", 3, 24));
        for(int i=1; i < 26; i++) {
            System.out.println(cipher.encrypt("cat can sing", i));
        }

//		FileResource file = new FileResource("src/test/java/smallhamlet.txt");
//		int[] counts = new int[31];
//		WordLengths wl = new WordLengths();
//		wl.countWordLengths(file, counts);	

    }
}
