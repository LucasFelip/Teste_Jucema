/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaAnagrams;

import java.util.Arrays;
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
        //TASK
        //Two strings, and , are called anagrams if they contain all the same characters in the same frequencies.
        //For example, the anagrams of CAT are CAT , ACT , TAC , TCA , ATC , and CTA .
        //Complete the function in the editor. If and are case-insensitive anagrams, print "Anagrams";
        //otherwise, print "Not Anagrams" instead.
        
        Scanner keyboard = new Scanner(System.in);
        String A, B;
        
        System.out.print("Insert the two words: ");
        A = keyboard.next();
        B = keyboard.next();
        
        if(A.length() != B.length())
            System.out.println("Words have different sizes");
        else{
            char[] a = A.toCharArray();
            char[] b = B.toCharArray();
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            if(Arrays.equals(a,b))
                System.out.println("Anagrams");
            else
                System.out.println("Not Anagrams");
        }
            
    }
    
}
