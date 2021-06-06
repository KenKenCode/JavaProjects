import java.util.Scanner;
/**
 * EOF Controlled while loop that read some numbers, and get the sum of all odd numbers and sum of all  even numbers entered.
 * Group 13
 * Authors: Lobingco, Kenneth F.
 *          Islanan, Lenito Laurencio Lamberto
 * Laboratory Exercise 5
 * Date: April 25, 2021
 */
public class IT1A_Group13_Lab5
{
    public static void main (String [] args) {
        
        
        Scanner input = new Scanner(System.in);

        int number;
        int sumEven = 0;
        int sumOdd = 0;
        int i = 1, countEven = 0, countOdd = 0;
        System.out.println("Please enter a number: (To end the input, press ctrl + z)");

        while (input.hasNext()) {
            number = input.nextInt();
                while (number > 0) {
                int rem = number % 10;

                if (rem % 2 == 0) 
                    
                    sumEven += number % 10;
                if (rem % 2 == 0) 
                    
                    countEven++;    
                
                if (rem % 2 != 0) 
                 
                    sumOdd = sumOdd + number % 10;
                    number /= 10;
                
                if (rem % 2 != 0) 
                
                    countOdd++;
                

            }

            i++;
            
        
        }
        
        System.out.println("The sum of the " + countEven + " even numbers read = " + sumEven);
        System.out.println("The sum of the " + countOdd + " odd numbers read = " + sumOdd);

}
}


