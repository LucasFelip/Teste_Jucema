/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLoops1;

import java.util.Scanner;

/**
 *
 * @author Lucas Reis
 */
public class TesteJucemaJav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TASK
        //Given an integer, N, print its first 10 multiples. Each multiple N x i(where 1<= i <= 10) should be printed
        //on a new line in the form: N x i = result .
        
        Scanner keyboard = new Scanner(System.in);
        int n, result;
        
        System.out.print("Insert an integer: ");
        n = keyboard.nextInt();
        
        for(int i = 1; i <= 10; i++){
            result = n * i;
            System.out.println(n+" × " + i + " = " + result);
        }
    }
    
}
