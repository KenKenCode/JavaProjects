/**
 * A Java program that implements two-dimensional array and performscommon matrix manipulations like addition, subtraction, and
multiplication. If the sizes of arrays are equal, user will enter array
elements and the program would calculate a chosen arithmetic expression
for the elements.
 * Group 13
 * Authors: Lobingco, Kenneth F.
 *          Islanan, Lenito Laurencio Lamberto
 * Laboratory #7
 * Date: May 20, 2021
 */
import java.util.Scanner;

public class IT1A_Group13_Lab7

{
    
    public static void main (String [] args) {
     Scanner readInput = new Scanner (System.in);
     int condition = 5;
     char decide;
     int [][] addRowArrayOne, addRowArrayTwo, subtractRowArrayOne, subtractRowArrayTwo, multiplyRowArrayOne, multiplyRowArrayTwo ; //arrays
     int rowInput, columnInput, secondRowInput, secondColumnInput; //addition
     int rowInputSubtract, columnInputSubtract, secondRowInputSubtract, secondColumnInputSubtract; //subtraction
     int rowInputMultiply, columnInputMultiply, secondRowInputMultiply, secondColumnInputMultiply; //multiplication
     
     
     do {
     System.out.println("   Matrix Operations");
     System.out.println("      Main Menu");
     
     System.out.println("[1] Matrix Addition");
     System.out.println("[2] Matrix Subtraction");
     System.out.println("[3] Matrix Multiplication");
     System.out.println("[4] Quit");
     System.out.println("Enter your choice: ");
     char whatNumber = readInput.next().charAt(0); //input chooser
     
     if (whatNumber != '1' && whatNumber != '2' && whatNumber != '3' && whatNumber != '4') {
     do {
         System.out.println("Invalid input, please try again");
         System.out.println("   Matrix Operations");
     System.out.println("      Main Menu");
     
     System.out.println("[1] Matrix Addition");
     System.out.println("[2] Matrix Subtraction");
     System.out.println("[3] Matrix Multiplication");
     System.out.println("[4] Quit");
     System.out.println("Enter your choice: ");
      whatNumber = readInput.next().charAt(0);
        } while (whatNumber != '1' && whatNumber != '2' && whatNumber != '3' && whatNumber != '4');
    } 
      
    
        
     switch (whatNumber) {
         
         case '1': 
         do{
             do{
         //Addition
         //The two matrices should be same in size to perform addition
         System.out.println("You chose addition");
         System.out.println("[First size] ");
         System.out.print("Enter the row: ");
         rowInput = readInput.nextInt();
         System.out.print("Enter the columns: ");
         columnInput = readInput.nextInt();
         
         addRowArrayOne  = new int [rowInput][columnInput];
         
         System.out.println("---------------------------");
         System.out.println("[Second size] ");
         System.out.print("Enter the row: ");
         secondRowInput = readInput.nextInt();
         System.out.print("Enter the columns: ");
         secondColumnInput = readInput.nextInt();
         
         addRowArrayTwo = new int [secondRowInput] [secondColumnInput];
         
         if (rowInput != secondRowInput || columnInput != secondColumnInput) {
             System.out.println("Unequal array size, please make sure that column\n and rows of the two arrays are matched. ");
            }
         
            
        } while (rowInput != secondRowInput || columnInput != secondColumnInput);
        
         int r, c;
         int sum = 0;
         
        System.out.println("Enter elements: ");
        for (r = 0; r < rowInput; r++) {
            for (c = 0; c < columnInput; c++) {
                addRowArrayOne [r] [c] = readInput.nextInt();
                
            }
        }
         
        System.out.println("Enter second element: ");
        for (int i = 0; i < rowInput; i++) {
            for (int j = 0; j < columnInput; j++) {
                addRowArrayTwo [i][j] = readInput.nextInt(); //Make sure i and j are corresponding with row and column
            }
        }
        
        //Summation
        int sumAddition [] [];
        sumAddition = new int [rowInput] [columnInput];
        
        System.out.println("Sum: \n");
        for (int i = 0; i < secondRowInput; i++) {
            for (int j = 0; j < secondColumnInput; j++) {
             sumAddition [i][j] = addRowArrayTwo[i][j] + addRowArrayOne[i][j];
             
             System.out.printf("%5d", sumAddition [i][j] );
                          
            }
            System.out.println(" ");
        }
        
        System.out.println("Try again? (Y/N)");
        
        decide = readInput.next().charAt(0);
        
        if (decide == 'N' || decide == 'n') 
        {
         break;   
        }
        else 
        {
         while ((decide != 'Y' && decide != 'y') && (decide != 'N' && decide != 'n')) 
         {
             System.out.println("Invalid input, try again (Y/N)");
             decide = readInput.next().charAt(0);
             
            }
            if (decide == 'N' || decide == 'n') 
            {
                break;
            }
        }
        
    } while (decide == 'Y' || decide == 'y');
        break;
    
        
        
        case '2':
        do 
        {
            do
            {
        //Subtraction
         
         //Subtraction
         //The two matrices should be same in size to perform subtraction
         System.out.println("You chose subtraction");
         
         System.out.println("First size ");
         System.out.print("Enter the row: ");
         rowInputSubtract = readInput.nextInt();
         System.out.print("Enter the columns: ");
         columnInputSubtract = readInput.nextInt();
         
         subtractRowArrayOne  = new int [rowInputSubtract][columnInputSubtract];
         
         System.out.println("---------------------------");
         System.out.println("Second size ");
         System.out.print("Enter the row: ");
         
         secondRowInputSubtract = readInput.nextInt();
         System.out.print("Enter the columns: ");
         secondColumnInputSubtract = readInput.nextInt();
         
         subtractRowArrayTwo = new int [secondRowInputSubtract] [secondColumnInputSubtract];
         
         if (rowInputSubtract != secondRowInputSubtract || columnInputSubtract != secondColumnInputSubtract) 
         {
             
             System.out.println("Unequal array size, please make sure that column\n and rows of the two arrays are matched. ");
            
            }
         
        }while (rowInputSubtract != secondRowInputSubtract || columnInputSubtract != secondColumnInputSubtract);
        
         int rMinus, cMinus;
         int minus = 0;
         System.out.println("Enter elements: ");
         for (rMinus = 0; rMinus < rowInputSubtract; rMinus++) 
         {
            for (cMinus = 0; cMinus < columnInputSubtract; cMinus++) 
            {
                subtractRowArrayOne [rMinus] [cMinus] = readInput.nextInt();
                
            }
        }
        
        System.out.println("Enter second element: ");
        for (int iMinus = 0; iMinus < rowInputSubtract; iMinus++) 
        {
            for (int jMinus = 0; jMinus < columnInputSubtract; jMinus++) 
            {
                subtractRowArrayTwo [iMinus][jMinus] = readInput.nextInt();
            }
        }
        
        //Summation
        int minusSubtraction [] [];
        minusSubtraction = new int [rowInputSubtract] [columnInputSubtract];
        
        System.out.println("Difference: ");
        for (int i = 0; i < secondRowInputSubtract; i++) 
        {
            for (int j = 0; j < secondColumnInputSubtract; j++) 
            {
             minusSubtraction [i][j] = subtractRowArrayTwo[i][j] - subtractRowArrayOne[i][j];
             System.out.println(minusSubtraction[i][j] + "\n");
            }
        }
        
        System.out.println("Try again? (Y/N)");
        decide = readInput.next().charAt(0);
        
        if (decide == 'N' || decide == 'n') 
        {
         break;   
        }
        
         else 
         {
         while ((decide != 'Y' && decide != 'y') && (decide != 'N' && decide != 'n')) 
         {
             System.out.println("Invalid input, try again (Y/N)");
             decide = readInput.next().charAt(0);
             
            }
            if (decide == 'N' || decide == 'n') {
                break;
            }
        }
        

        
    } while (decide == 'Y' || decide == 'y');
    break;
    
        case '3': 
        do 
        {
            do
            {
        //Multiplication
         
         
         //The two matrices should be same in size to perform addition
         System.out.println("You chose multiplication");
         
         System.out.println("First size ");
         System.out.print("Enter the row: ");
         rowInputMultiply = readInput.nextInt();
         System.out.print("Enter the columns: ");
         columnInputMultiply = readInput.nextInt();
         
         multiplyRowArrayOne  = new int [rowInputMultiply][columnInputMultiply];
         
         System.out.println("---------------------------");
         System.out.println("Second size ");
         System.out.print("Enter the row: ");
         
         secondRowInputMultiply = readInput.nextInt();
         System.out.print("Enter the columns: ");
         secondColumnInputMultiply = readInput.nextInt();
         
         multiplyRowArrayTwo = new int [secondRowInputMultiply] [secondColumnInputMultiply];
         
         if (rowInputMultiply != secondRowInputMultiply || columnInputMultiply != secondColumnInputMultiply) 
         {
             System.out.println("Unequal array size, please make sure that column\n and rows of the two arrays are matched. ");
            }
         
        } while (rowInputMultiply != secondRowInputMultiply || columnInputMultiply != secondColumnInputMultiply);
        
         int rTimes, cTimes;
         int times = 0;
         System.out.println("Enter elements: ");
         for (rTimes = 0; rTimes < rowInputMultiply; rTimes++) 
         {
            for (cTimes = 0; cTimes < columnInputMultiply; cTimes++) 
            {
                multiplyRowArrayOne [rTimes] [cTimes] = readInput.nextInt();
                
            }
        }
        
        System.out.println("Enter second element: ");
        for (int iTimes = 0; iTimes < rowInputMultiply; iTimes++) 
        {
        for (int jTimes = 0; jTimes < columnInputMultiply; jTimes++) 
        {
                multiplyRowArrayTwo [iTimes][jTimes] = readInput.nextInt();
            }
        }
        
        //Summation
        int timesMultiplication [] [];
        timesMultiplication = new int [rowInputMultiply] [columnInputMultiply];
        
        System.out.println("Product: ");
        for (int i = 0; i < secondRowInputMultiply; i++) 
        {
            for (int j = 0; j < secondColumnInputMultiply; j++) 
            {
             timesMultiplication [i][j] = multiplyRowArrayTwo[i][j] * multiplyRowArrayOne[i][j];
             System.out.println(timesMultiplication[i][j] + "\n");
            }
        }
        
        System.out.println("Try again? (Y/N)");
        
        decide = readInput.next().charAt(0);
        
        if (decide == 'N' || decide == 'n') {
         break;   
        }
        else {
         while ((decide != 'Y' && decide != 'y') && (decide != 'N' && decide != 'n')) 
         {
             System.out.println("Invalid input, try again (Y/N)");
             decide = readInput.next().charAt(0);
             
            }
            if (decide == 'N' || decide == 'n') {
                break;
            }
        }


    } while (decide == 'Y' || decide == 'y');
    break; 
        
        case '4': System.exit(0); 
        break;
    }
            
} while (condition == 5);

}
}



