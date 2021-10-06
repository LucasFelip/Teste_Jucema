/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaIfElse;

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
        //Given an integer, , perform the following conditional actions:
        //   If is odd, print Weird
        //   If is even and in the inclusive range of to , print Not Weird
        //   If is even and in the inclusive range of to , print Weird
        //   If is even and greater than , print Not Weird
        //Complete the stub code provided in your editor to print whether or not is weird.

        Scanner keyboard = new Scanner(System.in);
        int n;
       
        System.out.println("Insert an integer:");
        n = keyboard.nextInt();
       
        if(n%2!=0 || (n>=6 && n<=20))
            System.out.println("Weird");
        else 
            System.out.println("Not Weird");
    }
    
}
