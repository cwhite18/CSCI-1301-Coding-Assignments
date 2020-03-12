/*
Name: Christopher White
Assignment: WhiteCAssignment4
Date: 11-18-2018
Class: CSCI 1301-01
*/

import java.util.Scanner;
public class WhiteCAssignment4
{ public static void main(String[] args)//This is how your main method should always start//
   {
      Scanner gd = new Scanner(System.in);
      //variable = gd.nextInt();
      int[] data = {1, 2, 3, 4};//This is a one dimensional array//
      //String[]teams = new String[3];
      
      System.out.println("What is the make of your car?");
      String carMake = gd.nextLine();
      System.out.println("Is your car an import?");
      String isImport = gd.nextLine();
      
      double p = carMaintenence(carMake);
      System.out.println("\nTotal Price before Tax and labor = "+p+"\n");
      
      calcFinalPricemethod(p, isImport);
               
   }//End of Main Method
   
   
   
  public static double carMaintenence(String carMake)
    {
      String[] services = {"Oil Change", "Coolant Flush", "Brake Job", "Tune Up"};
      double[] prices = {39.99, 49.99, 119.99, 109.99};
     // System.out.print("These are the services we offer");
      /*for(int i=0; i < services.length; i++)
      {
       System.out.println(services[i]+"\t\t"+prices[i]);  
      }*/

      System.out.println("Services: " +services[0]+", "+services[1]+", "+services[2]+", "+services[3]+".\n");
      System.out.println("Prices, respectively: " +prices[0]+", "+prices[1]+", "+prices[2]+", "+prices[3]+"\n");
      System.out.println("Please select the services you would like for " +carMake+"\n"); 
      
      double acc =0.0;
      
      Scanner gd = new Scanner(System.in);
      for(int i=0; i < services.length; i++)
      {
         System.out.println(services[i]+": Please enter Y or N =");
         String choices = gd.nextLine();
         
         if(choices.equalsIgnoreCase("Y"))
         {
           acc = acc + prices[i]; 
         }
      }
      
      return acc;  
    }
    
    
    
    
   public static void calcFinalPricemethod(double p, String isImport)
    {
        //labor
        p = p + (p*0.25);
        
        //import
        if (isImport.equalsIgnoreCase("yes"))
        {
            p = p + (p*0.06);
        }
        
        //tax
        p = p + (p*0.07);
        
        System.out.printf("The Final Price with Tax and Labor = %.2f",p);
    }
}//End of Program

