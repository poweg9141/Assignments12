/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author poweg9141
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //object of this class
        A3Q1 call = new A3Q1();
        //new array with random numbers from one to 100
        int[] ar = new int[10];
        for (int i = 0; i < ar.length; i++) {
            //make a random number
            ar[i] = (int) (Math.random() * 101);
        }
        //prints out and sorts the array
        System.out.println("BEFORE:");
        call.print(ar);
        call.selectionSort(ar);
        System.out.println("AFTER");
        call.print(ar);
    }

    public void selectionSort(int[] ar) {

        //to keep track of wich position we are sorting
        for (int pos = 0; pos < ar.length; pos++) {
            //adds a varibale to store the smallest found number
            int smallest = pos;
            // go through the rest looking for a smaller number
            for (int i = pos + 1; i < ar.length; i++) {
                //have we found the smallest number so far
                if (ar[i] < ar[pos] && ar[i] < ar[smallest]) {
                    //mark it
                    smallest = i;
                }
            }
            //swap with the smallest number in the array
            swap(ar, smallest, pos);
        }
    }

    //swaps two unmber in an array
    public void swap(int[] ar, int p1, int p2) {

        int temp = ar[p1];
        ar[p1] = ar[p2];
        ar[p2] = temp;
    }

    //prints out an array
    public void print(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + ", ");
        }
        System.out.println("");
    }
}
