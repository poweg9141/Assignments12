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
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new class object
        A2Q2 call = new A2Q2();
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks user for input
        System.out.println("Gimme a number");
        //pirints out the answer
        System.out.println("The digital root is: " + call.digitalRoot(in.nextInt()));

    }

    public int digitalRoot(int n) {
        //if the number is only one digit return that digit
        if (n / 10 == 0) {
            return n;
        } else {
            //if not, return the digitalRoot of the numbers digitalSum
            return digitalRoot(digitalSum(n));
        }
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
