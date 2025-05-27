package com.dtkh.Java.Practice;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        WordPlay word = new WordPlay();
        System.out.print(word.replaceVowels("HelloWorld", '*'));
    }
}
