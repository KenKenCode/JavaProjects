import java.util.Scanner;
/**
 * Laboratory 4 Program number 2 is an application that detects whether an is a consonant letter, vowel, or if an input is not a letter.
 * Group 13 
 * Authors: Lobingco, Kenneth F.
 *          Islanan, Lenito Laurencio Lamberto
 * Laboratory Exercise 4 Program 2         
 * Date: March 19, 2021
 */
public class IT1A_Group13_Lab4_Prog2
{
    public static void main (String [] args) {
       
        String letter;
        int length;
        boolean isItTrueorFalse;
        char characterDeclare;
        
        Scanner scanInput = new Scanner (System.in);
        
        System.out.print("Enter a letter: ");
        letter = scanInput.nextLine();
        
        characterDeclare = letter.charAt(0);
        length = letter.length();
        isItTrueorFalse = Character.isLetter(characterDeclare);
        
        if (characterDeclare == 'a' || characterDeclare == 'A' || characterDeclare == 'e' || characterDeclare == 'E' || characterDeclare == 'i' || characterDeclare == 'I' || characterDeclare == 'o' || characterDeclare == 'O' || characterDeclare == 'u' || characterDeclare == 'U') {
            
            System.out.println("Letter " + letter + " is a vowel");
            
        }
        else {
            
            if (length > 1) {
                System.out.println("Error! Enter single letter only ");
            }
            else if (isItTrueorFalse == true){
                
                System.out.println("Letter " + letter + " is a consonant");
                
            }
            else if (isItTrueorFalse != true){
                
                System.out.println("Error! " + letter + " is not a letter");
                
            }
            
            
            
            
            
        }
        
    }
}
