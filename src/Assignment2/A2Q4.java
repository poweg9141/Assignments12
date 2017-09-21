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
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new scanner and class object
        A2Q4 call = new A2Q4();
        Scanner in = new Scanner(System.in);
        //asks the user for a hailstone number
        System.out.println("Gimme a Hailstone number:");
        //calls the hailstone method with the users input abd returns the answer
        int hn = in.nextInt();
        System.out.println("Le sequence is...");
        call.hailstone(hn);
    }
    
    public void hailstone(int n){
        //prints out the number before anything else is done
        System.out.println(n);
        //if the number is not one
        if(n != 1){
            //if its divisible by two
            if(n % 2 == 0){
                //call hailstone with the number divided by 2
                hailstone(n/2);
                //if not divisible by 2
            }else{
                //call hailstone with the other formula for the new number
                hailstone((n*3) + 1);
            }
        }
        //if n is 1 it will not do anything and exit the method
    }
}
