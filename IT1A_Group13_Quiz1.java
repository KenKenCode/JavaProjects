import java.util.Scanner;
/**
 * Quiz 1 in Java Flag control while loop odd and even  calculator
 * Group 13
 * Authors: Lobingco, Kenneth F.
 *          Islanan, Lenito Laurencio Lamberto
 * Quiz 1
 * Date: April 22, 2021
 * 
   */
class IT1A_Group13_Quiz1{
public static void main (String args[]){
int num;  
int oddSum=0,evenSum=0, sum=0;
boolean exit = true;

Scanner scan=new Scanner(System.in);

System.out.println("Enter the numbers: \n");


while(exit){  
num=scan.nextInt();


if(num%2==0) {
    evenSum+=num;
} 
else if (num < 0) {
    break;
}
else { 
    oddSum+=num;
}
   
 if(num<0){
     exit=false;
 }
}

System.out.println("Sum of all even numbers are: "+evenSum);
System.out.println("Sum of all odd numbers are: "+oddSum);

   
}


}




