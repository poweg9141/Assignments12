/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author poweg9141
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //objects of this and the first class
        A3Q1 call = new A3Q1();
        A3Q2 ans = new A3Q2();
        //generates a random array of 10
        int[] ar = new int[10];
        int[] ar2 = {1,2,3,4,6,7};
        for (int i = 0; i < ar.length; i++) {
            //make a random number
            ar[i] = (int) (Math.random() * 101);
        }
        //prints and sorts the array using A1Q1 methods
        System.out.println("BEFORE:");
        call.print(ar2);
        call.selectionSort(ar);
        System.out.println("AFTER");
        call.print(ar2);
        System.out.println("Missing Number is: " + ans.smallestMissingNumber(ar2));
    }
    
    public int smallestMissingNumber(int[] ar){
        
        //loops through the array
        int number = 0;
        for(int i = 0; i < ar.length; i++){
            number = ar[i];
            if(ar[i + 1] != number + 1){
                return number + 1;
            }
        }
        return -1;
    }
}
