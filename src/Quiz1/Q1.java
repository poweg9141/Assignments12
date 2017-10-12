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
        };
        
        //for loop to call the method for every word in the array
        //and print out the answer
        for(int i = 0; i < words.length; i++){
            System.out.println("Word: " + words[i]);
            System.out.println("Reversed: " + call.reverseString(words[i]));
        }
    }
    
    public String reverseString(String word){
        if(word.length() == 0){
            return "";
        }
        String newWord = word.substring(0, word.length() - 1);
        return word.charAt(word.length() - 1) + reverseString(newWord);
    }
}
