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
public class A1Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //new scanner
        Scanner in = new Scanner(System.in);
        //asks user to enter words
        System.out.println("Enter as many words as you want and i will count them");
        System.out.println("Enter 'exit' at any time to exit the program");
        //initializes a word counter
        int wordNum = 0;
        //initializes the boolean used to break the program
        boolean stop = false;
        //while loop to run until stop becomes true
        while(!stop){
            //stores any words they enter in the words string
            String words = in.nextLine();
            //splits the words string up by spaces
            String[] wordArray = words.split(" ");
            //for loop runs once for every word
            for(int i = 0; i < wordArray.length; i++){
                //adds one to the word number
                wordNum++;
                //if the word is exit sets stop to true
                if(wordArray[i].equals("exit")){
                    stop = true;
                }
            }
        }
        //prints out the number of words types
        System.out.println("You typed " + wordNum + " words!");
        System.out.println("Goodbye!");
    }
}
