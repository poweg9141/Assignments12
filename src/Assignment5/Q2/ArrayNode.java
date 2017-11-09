/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5.Q2;

/**
 *
 * @author poweg9141
 */
public class ArrayNode {

    //variable to store the number of items stored in the array
    private int items;
    //array list to store all the items
    private int[] array;

    /**
     * constructor to create an ArrayNode, initializes the classes variables
     */
    public ArrayNode() {
        items = 0;
        array = new int[10];
    }

    /**
     * method to get the amount of numbers stored in the array
     *
     * @return the number of items stored in the array
     */
    public int size() {
        return items;
    }

    /**
     * checks if the array node is empty
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return items == 0;
    }

    /**
     * adds a number to the desired index in the array node, if something
     * already exists at that spot, shifts everything down to accomodate the new
     * number
     *
     * @param index the index to put the number in
     * @param num the number to be placed in the index
     */
    public void add(int index, int num) {
        //if the array index is to small to accomodate the new number, the array is doubled
        if (items + 1 >= array.length) {
            doubleSize();
        }
        //runs through the array and shifts down every number at or after the
        //new numbers desired position by one spot in the array
        for (int i = array.length - 2; i > index; i--) {
            array[i] = array[i - 1];
        }
        //put the new number at the desired position
        array[index] = num;
        //add one to the total items in the array
        items++;
    }

    /**
     * returns the number at a given index in the array
     *
     * @param index the index to return the number of
     * @return the number at the given index
     */
    public int get(int index) {
        return array[index];
    }

    /**
     * private method doubles the size of the array when called
     */
    private void doubleSize() {
        //creates a temporary array twice the size of the the previous
        int[] temp = new int[array.length * 2];
        //copies the current array to the temp array
        System.arraycopy(array, 0, temp, 0, array.length);
        //sets the array to the temp array which is now double the length
        array = temp;
    }
}
