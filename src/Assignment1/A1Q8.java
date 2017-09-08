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
public class A1Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new scanner
        Scanner in = new Scanner(System.in);
        //awsks user how much money they have in
        System.out.println("How much money is in the bank now?:");
        //stores their response as two doubles for the two calculations
        double balance1 = in.nextDouble();
        double balance2 = balance1;
        //asks user for interest rate and stores it as double
        //converted to decimal format
        System.out.println("What is the percent interest rate?:");
        double rate = 1 + (in.nextDouble() / 100);
        //calculates the double of the original interest
        double doubled = balance1 * 2;
        //initialize variables to store years
        int doubley = 0;
        int milliony = 0;
        //for loop to calculate how long until money doubles
        for(int i = 1; balance1 < doubled; i++){
            balance1 *= rate;
            doubley = i;
        }
        //for loop to calculate how long until money reaches 1 million
        for(int i = 1; balance2 < 1000000; i++){
            balance2 *= rate;
            milliony = i;
        }
        System.out.println("Your money will double in " + doubley + " years.");
        System.out.println("Your money will reach 1 million in " + milliony + " years.");
        
    }
}
