/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

/**
 *
 * @author poweg9141
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //object of A3Q1 for basic method use
        A3Q1 call = new A3Q1();
        A3Q4 test = new A3Q4();
        //new array with 100 spots
        int[] ar = new int[100];
        //fills the array with numbers from 0 to 100
        for (int i = 0; i < ar.length; i++) {
            //make a random number either 0 or 1
            ar[i] = (int) (Math.random() * 101);
        }

        //prints out the unsorted array
        System.out.println("BEFORE:");
        call.print(ar);
        int[] ans = test.countingSort(ar);
        System.out.println("AFTER");
        call.print(ans);
    }
    
    //method to sort array using counting sort
    public int[] countingSort(int[] ar){
        
        //new array to store the couting
        int[] count = new int[101];
        //loops through the passed array
        for(int i = 0; i < ar.length; i++){
            //adds one to the numbers corresponding spot in the counting array
            count[ar[i]]++;
        }
        
        //creates a new array the length of the passed one
        int[] ans = new int[ar.length];
        //new counter to store the spot in the answer array we are at
        int ansSpot = 0;
        //loops through the counting array
        for(int i = 0; i < count.length; i++){
            //loops through the number of times as the number in that element
            //in the sorting array
            for(int j = 0; j < count[i]; j++){
                ans[ansSpot] = i;
                ansSpot++;
            }
        }
        //returns the correct array
        return ans;
    }
}
