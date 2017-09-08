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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //asks user to enter name
        System.out.println("Please Enter Your Name:");
        //new scanner
        Scanner in = new Scanner(System.in);
        //stores the next line as a string
        String name = in.nextLine();
        //outputs hello and the users name
        System.out.println("Hello " + name + "!");
    }
}
