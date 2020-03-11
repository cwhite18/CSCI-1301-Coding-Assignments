/*
Name: Christopher Lewis White
Assignment: LogicalOperatorsIFStatements&LoopsAssignment(Part1)
Class: CSCI 1301-01
Date: 10-12-2018

Algorithm:
1. Start
2. Get input from user by prompting them to type in one of the months of the year in the specified format.
3. Generate a response that tells the user the exact number of days that are in that particular calendar month.
4. Stop
*/

import java.util.Scanner;
public class LogicalOperatorsIFStatementsLoopsAssignment
{
   public static void main (String [] args)
   {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter a month (January, February, March, April, May, June, July, August, September, October, November, December):");
      String month = input.nextLine();
      
      if(month.equals("January"))
      {
         System.out.println("Number of days is 31.");
      }else if(month.equals("February"))
      {
         System.out.println("Number of days is 28.");
      }else if(month.equals("March"))
      {
         System.out.println("Number of days is 31.");
      }else if(month.equals("April"))
      {
         System.out.println("Number of days is 30.");
      }else if(month.equals("May"))
      {
         System.out.println("Number of days is 31.");
      }else if(month.equals("June"))
      {
         System.out.println("Number of days is 30.");
      }else if(month.equals("July"))
      {
         System.out.println("Number of days is 31.");
      }else if(month.equals("August"))
      {
         System.out.println("Number of days is 31.");
      }else if(month.equals("September"))
      {
         System.out.println("Number of days is 30.");
      }else if(month.equals("October"))
      {
         System.out.println("Number of days is 31.");
      }else if(month.equals("November"))
      {
         System.out.println("Number of days is 30.");
      }else if(month.equals("December"))
      {
         System.out.println("Number of days is 31.");
      }


      

      
      
   
   
   
   
   
   
   
   
   
   }  
}
   
  