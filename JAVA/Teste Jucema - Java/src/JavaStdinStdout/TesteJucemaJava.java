/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaStdinStdout;

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
        
        // TASK
        //In this challenge, you must read integers from stdin and then print them to stdout. Each integer must be
        //printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the
        //editor below.

        Scanner keyboard = new Scanner(System.in);
        int integer1, integer2, integer3;
        
        System.out.println("Insert three integer: ");
        integer1 = keyboard.nextInt();
        integer2 = keyboard.nextInt();
        integer3 = keyboard.nextInt();
        keyboard.close();
        
        System.out.println("Result: ");
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
        
    }
    
}
