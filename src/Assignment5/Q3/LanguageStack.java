/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5.Q3;

import java.util.Stack;

/**
 *
 * @author poweg9141
 */
public class LanguageStack {

    //stack to store the word they pass in
    private static Stack lang;

    /**
     * constructor makes a new stack so the user can check words and stuff
     */
    public LanguageStack() {
        lang = new Stack<String>();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //create a new stack object for the user to use
        LanguageStack stack = new LanguageStack();
        //prints out whether the entered word is in the language
        System.out.println("cat$tac : " + stack.inLang("cat$tac"));
    }

    /**
     * public method to check if a word is in the language, takes in a string
     * and returns true if the word is in the language
     *
     * @param word the word to check if it is in the language
     * @return true if the word is in the language, false otherwise
     */
    public boolean inLang(String word) {
        //calls the add to stack method to add the passed in word to the
        //stack in the correct order
        addToStack(word);
        ////loops through the stack and takes letters out two at a time
        for (int i = 0; i < lang.size(); i = i + 2) {
            //if the two letters it takes out are not equal, it returns false
            if (lang.get(i) != lang.get(i + 1)) {
                return false;
            }
        }
        //if all the letters it takes out are equal it returns true
        return true;
    }

    /**
     * adds the passed in word to the stack in the correct order
     *
     * @param word the word to be added to the stack
     */
    private void addToStack(String word) {
        //clears the stack object to ensure that it is empty
        lang.clear();
        //calculates the amount of letters it will have to add to the stack
        //all words passed in are split by a $, so that character doesent need to be put in the stack
        //if the words separated by the $ are equal they will be the same length
        //- 1 to get rid of the &, / 2 since words onh either side of the $ are equal
        int size = (word.length() - 1) / 2;
        //for loop runs as many times a size int above is long
        for (int i = 0; i < size; i++) {
            //adds the character at position i to the stack
            lang.add(word.charAt(i));
            //adds the character at the length of the striung minus i to the stack
            lang.add(word.charAt(word.length() - i - 1));
        }
    }
}
