/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

/**
 *
 * @author poweg9141
 */
public class A1Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //doubles of population and max population
        //numbers reduced since 10 billion is too big for int or long
        double pop = 6000.000000;
        double max = 10000.000000;
        int year = 0;
        //for loop to increace population by 1.4 percent each year until its over 10 billion
        for(int i = 1999; pop <= max; i++){
            //multiplay the population by 1.4 percent
            pop *= 1.014;
            //the new year is the current year plus one
            year = i + 1;
        }
        //prints out the answer
        System.out.println("The population will be larger than 10 billion in " + year);        
    }
}
