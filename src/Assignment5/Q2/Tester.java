/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5.Q2;

/**
 *
 * @author poweg9141
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates a new ArrayNode object
        ArrayNode node = new ArrayNode();
        //checks idf it is empty
        System.out.println(node.isEmpty());
        //adds something to the arraynode
        node.add(0, 12);
        //checks if it is empty again
        System.out.println(node.isEmpty());
        //adds random numbers to the array node in random spots
        node.add(1, 3);
        node.add(2, 123);
        node.add(1, 43);

        //prints out the resulting array node
        System.out.println(node.size());
        for (int i = 0; i < node.size(); i++) {
            System.out.println(node.get(i));
        }
    }
}
