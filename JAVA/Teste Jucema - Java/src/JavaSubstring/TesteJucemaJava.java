/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSubstring;

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
        //Given a string,s , and two indices, start and end, print a substring consisting of all characters in the
        //inclusive range from start to end-1. You'll find the String class' substring method helpful in completing
        //this challenge.
        
        Scanner keyboard = new Scanner(System.in);
        String word;
        int start, end;
        
        word = keyboard.next();
        start = keyboard.nextInt();
        end = keyboard.nextInt();
        
        System.out.println(word.substring(start, end));
    }
    
}
