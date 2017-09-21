/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new class object
        A2Q1 call = new A2Q1();
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks user for number
        System.out.println("Gimme a number");
        System.out.println("Sum of digits is: " + call.digitalSum(in.nextInt()));
    }

    public int digitalSum(int n) {
        
        //if n is zero, done
        if (n == 0) {
            return 0;
        } else {
            //finds the last number and stores it
            int rem = n % 10;
            //calls the method with the new number
            return rem + digitalSum(n / 10);
        }
    }
}
