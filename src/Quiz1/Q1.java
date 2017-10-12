/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

/**
 *
 * @author poweg9141
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //object of the quiz class to call the reverseString method
        Q1 call = new Q1();
        //array of random words to test the mehtod
        String[] words = {
          "cat",
          "frog",
          "muffin",
          "hamburger",
          "i",
          "the",
          "my",
          "test",
          "",
          "12345",
        };
        
        //for loop to call the method for every word in the array
        //and print out the answer
        for(int i = 0; i < words.length; i++){
            System.out.println("Word: " + words[i]);
            System.out.println("Reversed: " + call.reverseString(words[i]));
        }
    }
    
    //method to take in a string and reverse it
    public String reverseString(String word){
        //if the length of the string is zero return nothing
        if(word.length() == 0){
            return "";
        }
        //if not
        //return the last letter of the word 
        //plus the reverseString call of the word minus the last letter
        return word.charAt(word.length() - 1) + reverseString(word.substring(0, word.length() - 1));
    }
}
