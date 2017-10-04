/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author poweg9141
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //object of this class
        A3Q5 call = new A3Q5();

        //an array of random words
        String[] ar = {
            "turkey",
            "muffin",
            "ogre",
            "donkey",
            "olive",
            "apricot",
            "jaohvahs witness",
            "xylaphone"
        };

        System.out.println("BEFORE:");
        call.print(ar);
        call.insertionSort(ar);
        System.out.println("AFTER");
        call.print(ar);
    }

    public void insertionSort(String[] ar) {
        //start going through the array
        for (int i = 0; i < ar.length - 1; i++) {
            //store position value
            int pos = i;
            //check values beside each other
            while (pos >= 0 && ar[pos].compareTo(ar[pos + 1]) > 0) {
                //if out of place, start swapping down
                //until correct posdition is reached
                swap(ar, pos, pos + 1);
                pos--;
            }
        }
    }

    //method to swap two spots in an array
    public void swap(String[] ar, int p1, int p2) {

        String temp = ar[p1];
        ar[p1] = ar[p2];
        ar[p2] = temp;
    }

    //method tp print out an array
    public void print(String[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println("");
    }
}
