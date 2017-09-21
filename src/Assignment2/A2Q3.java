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
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    int sum = 0;
    
    public static void main(String[] args) {
        
        //new class object and scanner
        A2Q3 call = new A2Q3();
        Scanner in = new Scanner(System.in);
        //asks the user for a triangle row
        System.out.println("Whats the triangle row?");
        //calls the method with the users input, and prints the answer
        System.out.println("Total blocks are: " + call.triangle(in.nextInt()));
    }
    
    public int triangle(int n){
        //if at row zero, its done
        if(n == 0){
            return 0;
        }else{
            //if not the amount of boxes in that row is equal
            //to the row number
            //return triangle of the row one lower
            return n + triangle(n -1);
        }
    }
}
