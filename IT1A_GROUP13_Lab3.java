/**  This program outputs the original price of the item, the marked-up 
percentage of the item, the store’s selling price of the item, the sales tax rate, the 
sales tax, and the final price of the item. It displays output in columns. 
 * Group 13 (Replace # with your group number) 
 * Authors: Lobingco, Kenneth 
 * Islanan, Lenito Laurencio Lamberto 
 * Laboratory Exercise #3
 * Date: March 25, 2021 (date the program was created) 
 */
import java.util.Scanner;

public class IT1A_GROUP13_Lab3
{
    
    public static void main (String [] args) {
        


String item;
double originalprice, markeduppercent, sellingprice, salestax, finalprice;
double m_price = 0.20;
double st_rate = 0.12;

Scanner sc = new Scanner(System.in);
    
System.out.print("Input item: ");
item = sc.nextLine();
System.out.print("Input price: ");
originalprice = sc.nextDouble();

markeduppercent = originalprice * m_price;
sellingprice = originalprice + markeduppercent;
salestax = sellingprice * st_rate;
finalprice = sellingprice + salestax;

System.out.print("\n");
 
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.printf("%-15s %25s %20s %25s %25s %15s %n", "Original Price","Markup Percentage","Selling price","Sales tax rate", "Sales tax", "Final price");
System.out.println("-------------------------------------------------------------------------------------------------");
System.out.printf("%-15s %25s %20s %25s %25s %15s %n", originalprice, markeduppercent, sellingprice, "12%", salestax, finalprice );     
System.out.println("-------------------------------------------------------------------------------------------------");
       
            
    
   

            
        }
        
         
    }
