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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //asks user to input 3 numbers when prompted
        System.out.println("Please input three numbers when prompted");
        //new scanner
        Scanner in = new Scanner(System.in);
        //new array to store numbers
        double Nums[] = new double[3];
        //for loop to input 3 numbers, starts at 1 so the number can be used in the screen
        for(int i =1; i <= 3; i++){
            //asks user for the number
            System.out.println("Please input number " + i + ":");
            //stores the number in the corresponding array index
            Nums[i -1] = in.nextDouble();
        }
        //calculates the sum
        double product = Nums[0] * Nums[1] * Nums[2];
        //calculates the square root
        double sqrt = Math.sqrt(product);
        //calculates the square
        double sqr = Math.pow(product, 2);
        //prints all answers to the screen
        System.out.println("The product is: " + product + "\nThe square root of the product is: " 
                + sqrt + "\nThe product squared is: " + sqr);        
    }
}
