/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment5.Q1;

/**
 *
 * @author poweg9141
 */
public class OrderedList {

    private Node head;
    private int numItems;

    public OrderedList() {
        head = null;
        numItems = 0;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creates an object of the OrderedList
        OrderedList list = new OrderedList();
        //adds three numbers in random order
        list.add(2);
        list.add(17);
        list.add(13);
        //prints out the list to ensure it was ordered correctly
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //removes a random previously added number
        list.remove(13);
        //line to separate the two printed lists
        System.out.println("********************************");
        //prints out the list to ensure the correct number was removes
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    /**
     * adds the specified number to the list in its correct order from smallest
     * to largest
     *
     * @param num the number to be added to the list
     */
    public void add(int num) {
        //start at beggining of list
        Node node = head;
        //see if first item
        if (node == null) {
            Node temp = new Node(num);
            head = temp;
        } else {
            //finds the node one before it should be inserted
            while (node.getNext() != null && node.getNext().getNum() <= num) {
                //travelling to the next node
                node = node.getNext();
            }
            //gets the node one after where it should be inserted
            Node next = node.getNext();
            //sets the node before where it should be inserted to point to the new node
            node.setNext(new Node(num));
            //sets the new node to point to the one after whre it should be inserted
            node.getNext().setNext(next);

        }
        //increase the size counter
        numItems++;
    }

    /**
     * gets the size of the OrderedList
     *
     * @return the size
     */
    public int size() {
        return numItems;
    }

    /**
     * checks if the ordered list is empty
     *
     * @return true if empty, false otherwise
     */
    public boolean isEmpty() {
        return numItems == 0;
    }

    /**
     * gets the number stored in the node at a specified position in the
     * OrderedList
     *
     * @param pos the position to get the number from
     * @return the number at the specified position
     */
    public int get(int pos) {
        //start at the head
        Node node = head;
        //move the number of items
        for (int i = 0; i < pos; i++) {
            node = node.getNext();
        }
        return node.getNum();
    }

    /**
     * removes the specified number from the list, does nothing if the number
     * does not exist in the list, removes only the first found number if their
     * are duplicates
     *
     * @param num the number to remove
     */
    public void remove(int num) {
        //starts at the head of the node
        Node node = head;
        //while the next node exists and the number stored in it is not the number to remove
        while (node.getNext() != null && node.getNext().getNum() != num) {
            //advance to the next node
            node = node.getNext();
        }
        //only completes the remove operation if the node to remove was found
        //since if the node does not exist, the while loop will stop at the last node
        if (node.getNext().getNum() == num) {
            //temporarily stores the node we want to remove
            Node toRemove = node.getNext();
            //sets the node before the one we want to remove to point to the one after
            node.setNext(node.getNext().getNext());
            //removes the pointer of the node we want to remove
            toRemove.setNext(null);
        }
        //reduces the size of the orderedList
        numItems--;
    }
}
