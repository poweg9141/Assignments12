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
public class A2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new class object and scanner
        A2Q6 call = new A2Q6();
        Scanner in = new Scanner(System.in);
        //asks the user for a number to convert and stores it
        System.out.println("Gimme a number to convert");
        int num = in.nextInt();
        //asks the user for a base to convert to and stores it
        System.out.println("Gimme a base to convert to");
        int base = in.nextInt();
        //outputs the answer from the convert method
        System.out.println("The answer is: " + call.convert(num, base));
    }
    
    public String convert(int n, int b){
        
        //if the number is zero
        if(n == 0){
            //return zero
            return "";
        }else{
            //if not 0, calculate the number divided by two
            //as well as that calculations remainder
            int r = n % b;
            int s = n / b;
            String val = hexVal(r);
            //returns the binaryConvert of the new number plus the remainder
            return convert(s, b) + val;
        }
    }
    
    public String hexVal(int n){
        //string to store the matching letter
        String ans = "";
        //switch case converts the number to a matching letter
        switch(n){
            case 10:
                ans = "A";
                break;
            case 11:
                ans = "B";
                break;
            case 12:
                ans = "C";
                break;
            case 13:
                ans = "D";
                break;
            case 14:
                ans = "E";
                break;
            case 15:
                ans = "F";
                break;
            default:
                //if the number has no matching letter,
                //return the original number
                ans = "" + n;
                break;
        }
        //returns the answer
        return ans;
    }
}
