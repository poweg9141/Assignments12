/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1;

import java.util.Scanner;

/**
 *
 * @author poweg9141
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
        Scanner in = new Scanner(System.in);
        int tickets = 35;
        //asks users how much the DJ costs
        System.out.println("How much does the DJ cost?:");
        //stores it in the double named dj
        //repeats the same proccess for every other expense
        double dj = in.nextDouble();
        System.out.println("How much does the hall rental cost?:");
        double hall = in.nextDouble();
        System.out.println("How much do the decoarations cost?:");
        double decor = in.nextDouble();
        System.out.println("How much dose the wait staff cost?:");
        double staff = in.nextDouble();
        System.out.println("How much do any other miscellaneous expenses cost?:");
        double misc = in.nextDouble();
        //adds all expenses up in the total double
        double total = dj + hall + decor + staff + misc;
        //divides the total by the ticket cost and rounds up to the nearest ticket number
        double ticketAmount = Math.ceil(total / tickets);
        //prints the answer to the screen
        System.out.println("You will need to sell " + ticketAmount + " tickets to break even!");
    }
}
