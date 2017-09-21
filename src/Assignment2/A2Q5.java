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
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //new scanner and class object
        A2Q5 call = new A2Q5();
        Scanner in = new Scanner(System.in);
        //asks user for number
        System.out.println("Gimme a number:");
        //prints out the answer of that number converted to binary
        System.out.println("Binary version is: " + call.binaryConvert(in.nextInt()));
    }
    
    public String binaryConvert(int n){
        //if the number is zero
        if(n == 0){
            //return zero
            return "";
        }else{
            //if not 0, calculate the number divided by two
            //as well as that calculations remainder
            int r = n % 2;
            int s = n / 2;
            //returns the binaryConvert of the new number plus the remainder
            return binaryConvert(s) + r;
        }
    }
}
