/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStrings;

import java.util.Scanner;

/**
 *
 * @author Lucas Reis
 */
public class TesteJucemaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //task
        //This exercise is to test your understanding of Java Strings. A sample String declaration:
        // String myString = "Hello World!"
        //The elements of a String are called characters. The number of characters in a String is called the length,
        //and it can be retrieved with the String.length() method.
        //Given two strings of lowercase English letters, and , perform the following operations:
        //  1. Sum the lengths of and .
        //  2. Determine if is lexicographically larger than (i.e.: does come before in the dictionary?).
        //  3. Capitalize the first letter in and and print them on a single line, separated by a space.

        Scanner keyboard = new Scanner(System.in);
        String A, B;
        
        System.out.print("Insert the two words: ");
        A = keyboard.next();
        B = keyboard.next();
        
        int stringLength = A.length() + B.length();
        int compare = A.compareTo(B);
        
        System.out.println("\n"+stringLength);
        if(compare < 0)
            System.out.println("No \n"+A+" "+B);
        else if(compare > 0)
            System.out.println("Yes \n"+A+" "+B);
        else
            System.out.println("Matching words in alphabetical order\n"+A+" "+B);
    }
    
}
