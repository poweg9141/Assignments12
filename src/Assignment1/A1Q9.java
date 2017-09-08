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
public class A1Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks the user to enter words
        System.out.println("Please enter 10 words:");
        //stores the words in a string
        String wordstotal = in.nextLine();
        //finds the length of the string
        int charlength = wordstotal.length();
        //splits the string up by spcaes and stores it in an array
        String[] words = wordstotal.split(" ");
        //finds the length of the array (number of words)
        int wordlength = words.length;
        //calculates and prints out the average to the screen
        double average = (charlength / wordlength * 1.0);
        System.out.println("Average word length is " + average + " letters.");
    }
}
