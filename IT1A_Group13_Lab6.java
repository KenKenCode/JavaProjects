/**
 * A Java program that stores an array, reverses it, and prints a reversed array 
 * Group 13
 * Authors: Lobingco, Kenneth F.
 *          Islanan, Lenito Laurencio Lamberto
 * Laboratory #6
 * Date: May 8, 2021
 */
import java.util.Scanner;

public class IT1A_Group13_Lab6 {
    public static void main (String [] args) {
        int fiveNumFirstLimit = 0;
        int fiveNumSecondLimit = 0;
        char runProgramQuestion;
        
        //do... while loop should be used so that while statement could get value in the loop-again-program question part
        do{
        int readNumInput;
        int forArray, initiate, end; //Initiate would be the start of array element (0), and end would be the end element of the array
    initiate = 0;
Scanner sc=new Scanner(System.in);  

System.out.print("Enter the array size you want to process ");  

readNumInput=sc.nextInt();  
end = readNumInput - 1; //minus 1 in end so that it can read the next line in it's left when stored
int array [] = new int[readNumInput];

System.out.println("Enter the " + readNumInput + " elements of the array: ");

for(int i=0; i<readNumInput; i++)  
{  
 
 array[i]=sc.nextInt();  
 
}  

System.out.println("The " + readNumInput + " Array elements are: ");  

for (int i = 0; i<readNumInput; i++)   
{
    
      fiveNumFirstLimit++;
      if (fiveNumFirstLimit > 5) {
          System.out.println();
          fiveNumFirstLimit = 1;
        }
      
      System.out.printf("%5d ", array[i] ); 
      
}
System.out.printf("\nThe " + readNumInput + " rearranged array elements and then reversed output: \n");
while (initiate < end)
        {
            //This for statement is the code for storing the array, very important 'for' statement
            forArray = array[initiate];
            array[initiate] = array[end];
            array[end] = forArray;
            
            initiate++;
            end--;
            
        }
        
for (int i = 0; i<readNumInput; i++)   
{  
      fiveNumSecondLimit++; //restrict the print to 5 numbers per line
      if (fiveNumSecondLimit > 5) {
          System.out.println();
          fiveNumSecondLimit = 1;
        }
      System.out.printf("%5d ", array[i]); 
      
}

System.out.printf("\nTry again the program? Type Y/y to repeat program \n type N/n to stop program, \nother input would prompt this question again\n");

Scanner read = new Scanner (System.in);
runProgramQuestion = read.next().charAt(0);
//Use && in the while loop so that a wrong input would always be false
while (runProgramQuestion != 'Y' && runProgramQuestion != 'N' && runProgramQuestion != 'y' && runProgramQuestion != 'n') {
    System.out.println("You can only choose between Y/y, or N/n");
    runProgramQuestion = read.next().charAt(0);
}

if (runProgramQuestion == 'N' || runProgramQuestion == 'n') {
 System.exit(0);   
}

} while (runProgramQuestion == 'Y' || runProgramQuestion == 'y');

}
}
