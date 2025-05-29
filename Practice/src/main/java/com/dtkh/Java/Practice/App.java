package com.dtkh.Java.Practice;

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
        System.out.print(cipher.encrypt("FIRST LEGION ATTACK EAST FLANK!", 23));
    }
}
