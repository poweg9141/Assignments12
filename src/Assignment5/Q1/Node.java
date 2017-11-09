/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5.Q1;

/**
 *
 * @author poweg9141
 */
public class Node {

    private int item;
    private Node next;

    public Node(int num) {
        item = num;
        next = null;
    }

    /**
     * gets the number stored in the node
     *
     * @return the number stores
     */
    public int getNum() {
        return item;
    }

    /**
     * returns the node that comes after
     *
     * @return the next node
     */
    public Node getNext() {
        return next;
    }

    /**
     * Sets the node that comes after
     *
     * @param next the node to point to
     */
    public void setNext(Node next) {
        this.next = next;
    }
}
