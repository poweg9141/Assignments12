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
public class A1Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks the user to give a stopping number
        System.out.println("Enter a number between 50 and 100 to stop at:");
        //stores that number in a variable
        int stop = in.nextInt();
        //for loop to count down from 100 by 5's
        for(int i = 100; i > stop; i -= 5){
            //prints out counting number
            System.out.println(i);
        }
        //prints out done
        System.out.println("Done!");
    }
}
