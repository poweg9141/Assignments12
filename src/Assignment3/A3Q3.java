/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author poweg9141
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //object of Q1 class
        A3Q1 call = new A3Q1();
        A3Q3 ans = new A3Q3();
        int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            //make a random number either 0 or 1
            ar[i] = (int) (Math.random() * 2);
        }
        //prints and sorts the array using A1Q1 methods
        System.out.println("ARRAY:");
        call.print(ar);
        //prints out how many 1's are in the array
        //by calling the countOnes method
        System.out.println("There are " + ans.countOnes(ar, 0) + " ones in the array!");
    }

    public int countOnes(int[] ar, int pos) {

        //checks if past end of array
        if (pos >= ar.length) {
            //if it is returns 0
            return 0;
        }

        //if the int at the position is one adds one to total
        if (ar[pos] == 1) {
            //then calls countOnes with the next position in the array
            return 1 + countOnes(ar, pos + 1);
        }else{
            //if not adds 0 to total
            //and calls countOnes again with the next position in the array
            return 0 + countOnes(ar, pos + 1);
        }
    }
}
