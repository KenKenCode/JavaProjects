import java.util.Scanner;
/**
 * 4th laboratory exercise in Java Program 1(Intermediate Programming) This program is for calculating and giving remarks to students' grades
 * Group 13
 * Authors: Lobingco, Kenneth F.
 *          Islanan, Lenito Laurencio Lamberto
 * Laboratory Exercise 4 Program 1
 * Date: April 18, 2021
 * 
   */
public class IT1A_Group13_Lab4_Prog1
{
    
    public static void main (String [] args) {
        
        Scanner inputGradeorName = new Scanner (System.in);
        double majorExam, quizzes, projects;
        String name;
        System.out.print("Enter student's name: ");
        name = inputGradeorName.nextLine();
        System.out.print("Major Exam: ");
        majorExam = inputGradeorName.nextInt();
        System.out.print("Quizzes: ");
        quizzes = inputGradeorName.nextInt();
        System.out.print("Projects: ");
        projects = inputGradeorName.nextInt();
        
        double totalExam, totalQuiz, totalProjects;
        totalExam = majorExam * 0.40;
        totalQuiz = quizzes * 0.20;
        totalProjects = projects * 0.40;
        
        double finalGrade = totalExam + totalQuiz + totalProjects;
        
        if (finalGrade >= 95 && finalGrade <= 100) {
            System.out.println("");
            System.out.printf("%-10s %30s %30s \n", "Student's name", "Final Grade", "Remarks");
            System.out.printf("%-10s %30f %30s \n", name, finalGrade, "Outstanding");
            
        }
        
        if (finalGrade >= 89 && finalGrade <= 95) {
            System.out.println("");
            System.out.printf("%-10s %30s %30s \n", "Student's name", "Final Grade", "Remarks");
            System.out.printf("%-10s %30f %30s \n", name, finalGrade, "Very Satisfactory");
            
        }
        if (finalGrade >= 80 && finalGrade <= 89) {
            System.out.println("");
            System.out.printf("%-10s %30s %30s \n", "Student's name", "Final Grade", "Remarks");
            System.out.printf("%-10s %30f %30s \n", name, finalGrade, "Satisfactory");
            
        }
        if (finalGrade >= 75 && finalGrade <= 80) {
            System.out.println("");
            System.out.printf("%-10s %30s %30s \n", "Student's name", "Final Grade", "Remarks");
            System.out.printf("%-10s %30f %30s \n", name, finalGrade, "Fair");
            
        }
        if (finalGrade < 75) {
            System.out.println("");
            System.out.printf("%-10s %30s %30s \n", "Student's name", "Final Grade", "Remarks");
            System.out.printf("%-10s %30f %30s \n", name, finalGrade, "Failed");
            
        }
        
        
        
    }
}
