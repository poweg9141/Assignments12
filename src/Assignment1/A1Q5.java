/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks the user to input a number between one and ten
        System.out.println("Please input a number between 1 and 10:");
        //stores the number in an int
        int num = in.nextInt();
        //for loops to print out * row corresponding to number
        for(int i = 0; i < num; i++){
            //for loop to print out individual row of *
            for(int e = 0; e < num; e++){
                System.out.print("*");
            }
            //starts a new line for the next for of *
            System.out.print("\n"); 
        }
        //prints done
        System.out.println("Done!");
    }
}
