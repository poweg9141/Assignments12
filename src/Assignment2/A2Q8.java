/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

/**
 *
 * @author poweg9141
 */
public class A2Q8 {

    /**
     * @param args the command line arguments
     */
    //https://github.com/nayuki/DWITE-programming-contest-solutions/blob/master/testdata/DATA11Dec2006.txt
    public static void main(String[] args) {

        //new class object
        A2Q8 call = new A2Q8();

        int[] a1 = {12, 14, 18, 33};
        int b1 = 50;
        //max is 47

        int[] a2 = {12, 18, 22, 67, 50, 23};
        int b2 = 123;
        //max is 120

        int[] a3 = {123, 321, 23, 54, 67, 543, 111, 134, 432, 654};
        int b3 = 1000;

        int[] a4 = {12, 18, 22, 67, 50, 23};
        int b4 = 100;
        //67, 50, 23, 22, 18, 12
        //max is 95

        int[] a5 = {25, 25, 70, 50};
        int b5 = 75;
        //max is 75

        int[] array = a4;
        int max = b4;
        array = call.sortArray(array, 0);
        int[] store = new int[array.length * array.length * 3];
        int ans = call.jimmysMarbles(max, array, store, 0);
        System.out.println("Answer: " + ans);

    }

    //method to check if numbers can add together
    public int jimmysMarbles(int max, int[] ar, int[] ans, int pos) {
        A2Q8 call = new A2Q8();
        if (pos == ar.length) {
            int[] sorted = sortArray(ans, 0);
            int marbles = sorted[0];
            return marbles;
        }
        for (int i = ar.length * pos; i < (ar.length * pos) + ar.length; i++) {
            if (ar[pos] + ar[i - ar.length * pos] <= max) {
                ans[i] = ar[pos] + ar[i - ar.length * pos];
                int largestrem = 0;
                int count = 0;
                for (int j = ar.length - 1; j > 0; j--) {
                    if (max - ans[i] - ar[j] >= 0) {
                        largestrem = ar[j];
                        count = j;
                        break;
                    }
                }
                ans[(i * 2) + count] = ans[i] + largestrem;
            }
        }
        return jimmysMarbles(max, ar, ans, pos + 1);
    }

    //method to reaggange an array from largest to smallest
    public int[] sortArray(int[] ar, int pos) {
        //loops through each number in the array and checks if its larger than the first
        for (int i = pos; i < ar.length; i++) {
            //if it is swaps the two numbers
            if (ar[pos] < ar[i]) {
                int temp = ar[i];
                ar[i] = ar[pos];
                ar[pos] = temp;
            }
        }
        //if the number its checking is at the end it stops
        if (pos + 1 >= ar.length) {
            return ar;
            //if not, it calls the method again, checking the next numer in the array
        } else {
            return sortArray(ar, pos + 1);
        }
    }
}
