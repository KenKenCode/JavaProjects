
/**
 * Program that reads a customers' accounts at the end of each month.
 * The bank offers two types of accounts: savings and checking
 * Group 14
 * Authors: Lobingco, Kenneth F.
 *          Islanan, Lenito Laurencio Lamberto
 *          Del Rosario, Editha
 * Laboratory Exercise 1
 * Date: September 14, 2021
 * 
 * */
import java.util.*; 
public class IT2A_Group14_Lab1B
{
    
    public static double savingsPrice = 10000; //minimum savings balance
    public static double checkingPrice = 50000; //minimum check balance
    public static double savingsInterest = 0.03;
    public static double checkMinInterest = 0.02;
    public static double checkNotMinInterest = 0.04;
    public static double serviceCharge_S = 100.00; // service Charge in savings
    public static double serviceCharge_C = 500.00; // service Charge in checking
    public static double currentBalance;
    public static double currentBalCheck;
    public static double appliedInterest_S; //apply Interest in savings 
    public static double appliedInterest_C; //apply interest in checking
    public static double appliedInterest_C_Two; //apply interest in checking
    public static double newBalance;
    public static double newBalCheck;
    public static double newBalMinInterestCheck;
    public static double newBalMaxInterestCheck;
    public static double newBalCheckFiftyOneHundred;
    public static double newBalCheckOneHundred;
    //below minimum balance receives charge of 100.00 for savings
    //below minimum balance receives charge of 500.00 for checking

    //Note: cannot call a method to another method

    
public static double savingsSub_Method (double aSave, double bSave) {
    
    double resultSave = aSave - bSave;
    
    return resultSave;
}

public static double savingsInterestMethod (double aInterestSave, double bInterestSave) {
    
    double resultInterest = aInterestSave * bInterestSave;
    return resultInterest;
    
}

public static double chargeSub_CheckMethod (double aCheck, double bCheck) {
    double resultCheck = aCheck - bCheck;
    return resultCheck;

}

public static double notMinCheckMethod (double aNotMinCheck, double bNotMinCheck) {
    
    double resultCheckNotMin = aNotMinCheck * bNotMinCheck;
    return resultCheckNotMin;
    
}

public static double maxMin_CheckMethod (double aMaxCheck, double bMaxCheck) {
    
    double resultMaxCheck = aMaxCheck * bMaxCheck;
    return resultMaxCheck;
    
}

    public static void main (String [] args) {
        boolean program = true;
        
        Scanner read = new Scanner (System.in); 
        do {
          
 System.out.print("Enter Account No: ");
 int accountNumber = read.nextInt();

 System.out.println("");
 System.out.print("Account Type: ");
 char accountType = read.next().charAt(0);
 System.out.println("");
 switch (accountType) {
     
     //This case is for running savings method
     case 's':
     case 'S':
     System.out.print("Current Balance: ");
     currentBalance = read.nextDouble();
     System.out.println("");
     if (currentBalance < savingsPrice) {
         double subCurrent_Charge = savingsSub_Method(currentBalance,serviceCharge_S); //Subtracts charge from savings
         newBalance = subCurrent_Charge;
         String format = "%-10s %15s %15s %15s %15s %15s\n";
     Date dateToday = new Date();
     System.out.println("Run Date: " + dateToday);
     System.out.printf(format, "Account No", "Account Type", "Current Balance", "Interest", "Service Charge", "New Balance");
     System.out.printf(format, accountNumber, accountType, currentBalance, "", serviceCharge_S, newBalance);
        
        }
     else if (currentBalance > savingsPrice) {
        appliedInterest_S = savingsInterestMethod(currentBalance, savingsInterest); //Multiplies interest to savings
        newBalance = currentBalance + appliedInterest_S;
        String format = "%-10s %15s %15s %15s %15s %15s\n";
     Date dateToday = new Date();
     System.out.println("Run Date: " + dateToday);
     System.out.printf(format, "Account No", "Account Type", "Current Balance", "Interest", "Service Charge", "New Balance");
     System.out.printf(format, accountNumber, accountType, currentBalance, appliedInterest_S, "", newBalance);
        
        }
        
     else if (currentBalance == savingsPrice) {
         
         
         
        }
     break;
     
     //This case is for running the checking methods
     case 'c':
     case 'C':
     System.out.print("Current Balance: ");
     currentBalCheck = read.nextDouble();
     if (currentBalCheck < checkingPrice) {
         double checkBalanceToCharge = chargeSub_CheckMethod(currentBalCheck, serviceCharge_C);
         newBalCheck = checkBalanceToCharge;
         String format = "%-10s %15s %15s %15s %15s %15s\n";
         //String formatDouble = "%-10d %15.2f %15.2f %15.2f %15.2f %15.2f";
     Date dateToday = new Date();
     System.out.println("Run Date: " + dateToday);
     System.out.printf(format, "Account No", "Account Type", "Current Balance", "Interest", "Service Charge", "New Balance");
     System.out.printf(format, accountNumber, accountType, currentBalCheck, "", serviceCharge_C, newBalCheck);
        
        }
        
     else if (currentBalCheck > 50000 && currentBalCheck <= 100000) {
         
         appliedInterest_C = notMinCheckMethod(currentBalCheck, checkNotMinInterest);
         newBalMinInterestCheck = appliedInterest_C;
         newBalCheckFiftyOneHundred = newBalMinInterestCheck + currentBalCheck;
         String format = "%-10s %15s %15s %15s %15s %15s\n";
         String formatDouble = "%-10d %15.2f %15.2f %15.2f %15.0f %15.2f";
     Date dateToday = new Date();
     System.out.println("Run Date: " + dateToday);
     System.out.printf(format, "Account No", "Account Type", "Current Balance", "Interest", "Service Charge", "New Balance");
     System.out.printf(format, accountNumber, accountType, currentBalCheck, newBalMinInterestCheck, "", newBalCheckFiftyOneHundred);
         
        }
        
        else if (currentBalCheck > 100000) {
            
            appliedInterest_C_Two = maxMin_CheckMethod(currentBalCheck, checkMinInterest);
            newBalMaxInterestCheck = appliedInterest_C_Two;
            newBalCheckOneHundred = newBalMaxInterestCheck + currentBalCheck;
            String format = "%-10s %15s %15s %15s %15s %15s\n";
            String formatDouble = "%-10d %15.2f %15.2f %15.2f %15.0f %15.2f";
            Date dateToday = new Date();
            System.out.println("Run Date: " + dateToday);
            System.out.printf(format, "Account No", "Account Type", "Current Balance", "Interest", "Service Charge", "New Balance");
            System.out.printf(format, accountNumber, accountType, currentBalCheck, newBalMaxInterestCheck, "", newBalCheckOneHundred);
            
            
        }
        break;
        
     
     default: System.out.println("ERROR, invalid input");
    }
    
    System.out.println("Try Again? (Y/N)");
char tryAgain = read.next().charAt(0);
if (tryAgain != 'y' && tryAgain != 'Y' && tryAgain != 'n' && tryAgain != 'N') {
    do {
        System.out.println("Try Again? (Y/N)");
        tryAgain = read.next().charAt(0);
    } while (tryAgain != 'y' && tryAgain != 'Y' && tryAgain != 'n' && tryAgain != 'N');
}
else if (tryAgain == 'n' || tryAgain == 'N') {
    System.exit(0);
}


} while (program == true);
        
    }
    
}
