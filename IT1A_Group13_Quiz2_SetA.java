/**
 * A Java program that prints a right triangle with numbers as elements and the length of the numbers are based on numeric input of the user
 * Group 13
 * Authors: Lobingco, Kenneth F.
 *          Islanan, Lenito Laurencio Lamberto
 * Quiz #2
 * Date: April 29, 2021
 */
import java.util.Scanner;
public class IT1A_Group13_Quiz2_SetA
{
    public static void main (String [] args) {
    
   Scanner readInput = new Scanner (System.in);
   System.out.printf("Enter the length of triangle : ");
   
   int first = readInput.nextInt();
   System.out.println(" ");
   int i, j;
   
   for (i = 1; i <= first; i++){
        for (j = 1; j <= i; j++) {
            System.out.print(" " + i + " "); // print and not println so the elements would not be single line away from each other
            //i is inside of println because it is the one that should increment
            //Example: 
            /*
             * 1
             * 2 2
             * 3 3 3
             * 4 4 4 4
             * 5 5 5 5 5
             */
        }
        System.out.println("");
    }
}
}
