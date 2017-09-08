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
public class A1Q4 {

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
        //for loops to print out * corresponding to number
        for(int i = 0; i < num; i++){
            System.out.print("*");
        }
        //prints done
        System.out.println("\nDone!");
    }
}
