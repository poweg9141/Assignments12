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
public class A2Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner and class object
        A2Q7 call = new A2Q7();
        Scanner in = new Scanner(System.in);
        //asks user for a number
        System.out.println("Gimme a number");
        //prints out whether or not its a palindrome
        System.out.println("Is it a palindrome: " + call.isPalindrome(in.nextLine()));
    }

    public boolean isPalindrome(String s) {
        
        //if the length of the string is 0, returns true
        if(s.length() == 0){
            return true;
        //if the character at the front and back of the string is equal
        }else if(s.charAt(0) == s.charAt(s.length() - 1)){
            //if the string is longer than three characters call the
            //method again with the first and last letters removed from the string
            if(s.length() >= 3){
              String s2 = s.substring(1, s.length() - 1);  
              return isPalindrome(s2);
            }else{
                //if the string is less than two leters, return true
                return true;
            } 
        //if the first and last leter are not equal, return false
        }else{
            return false;
        }
    }
}
