/*
Christopher Lewis White
CSCI 1301-01
10-26-2018
*/

import java.util.Scanner;
public class WhiteCAssignment3
{
   public static void main (String [] args)
   {
      String[] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
      String[] drinks = {"Soda", "Sweet Tea", "Lemonade", "Frozen Lemonade", "Coffee-Hot", "Coffee-Iced", "Latte"};
      double[] price = new double[7];
      
      Scanner input = new Scanner(System.in);
      for(int i = 0; i < 7; i++)
      {
         System.out.println("What is the price of a "+ drinks[i]+"?");
         price[i] = input.nextDouble();
         input.nextLine();
      }

      System.out.println("What day of the week do you want the discounted drink price for?");
      String answer = input.nextLine();
      
      for(int i = 0; i < 7; i++)
      {
         if(answer.equals(daysOfWeek[i]))
         {
            double dp = price[i]-(price[i]*0.35);
            double p = 0.0;
            String d = " ";
            if(p<price[i])
            {
               p=price[i];
               d=drinks[i];
            }
            System.out.println(" ");
            System.out.println("Weekday\t\tDrinks\t\tOriginal-Price\tDiscounted-Price");
            System.out.println("-------------------------------------------------------");
            System.out.println(daysOfWeek[i]+"\t\t\t"+drinks[i]+"\t\t\t$"+price[i]+"\t\t\t\t$"+dp);
            System.out.println("\n\nThe highest price drink = "+d+" at "+p);
         }
      }
   }
}