/*
Name: Christopher Lewis White
Assignment:WhiteCAssignment2
Class: CSCI 1301-01
Date: 10-10-2018

Algorithm:
Start
1. Get input from player 1 to play the game.
2. Choose a number between 1 and 5.
3. If player 1 chooses numbers between 1 and 5, they are able to play the game.
4. If no, repeat step 2.
5. Get input from player 2 to play the game.
6. Choose a number between 1 and 5.
7. If player 2 chooses numbers between 1 and 5, they are able to play the game.
8. Otherwise, repeat step 6
9. Comparison of choices
10.Display results
Stop
*/

import java.util.Scanner;
public class WhiteCAssignment2
{
   public static void main (String [] args)

   {
   
      Scanner input = new Scanner(System.in);
      
      int monkey = 1;
      int robot = 2;
      int pirate = 3;
      int ninja = 4;
      int zombie = 5;
      int first = 0;
      int second = 0; 
      char play = 'y';
      
      
      do{
         System.out.println("Player 1 enter a number 1-5 for Monkey, Robot, Pirate, Ninja, or Zombie!");
         first = input.nextInt();
         if(first > 5 || first < 1)
         {
            System.out.println("Invalid choice! Player 1 enter a number 1-5 for Monkey, Robot, Pirate, Ninja, or Zombie!");
            first = input.nextInt();
         }
         
         System.out.println("Player 2 enter a number 1-5 for Monkey, Robot, Pirate, Ninja, or Zombie!");
         second = input.nextInt();
         if(second > 5 || second < 1)
         {
            System.out.println("Invalid choice! Player 2 enter a number 1-5 for Monkey, Robot, Pirate, Ninja, or Zombie!");
            second = input.nextInt();
         }
         
         if(first==second)
         {
            System.out.println("Nobody wins!");
         }else if (first==1 && second == 4)
         {
            System.out.println("Monkey fools Ninja. Player 1 wins!");
         }else if (second==1 && first == 4)
         {
            System.out.println("Monkey fools Ninja. Player 2 wins!");
         }else if (first==1 && second == 2)
         {
            System.out.println("Monkey unplugs Robot. Player 1 wins!");
         }else if (second==1 && first == 2)
         {
            System.out.println("Monkey unplugs Robot. Player 2 wins!");
         }else if (first==2 && second == 4)
         {
            System.out.println("Robot chokes Ninja. Player 1 wins!");
         }else if (second==2 && first == 4)
         {
            System.out.println("Robot chokes Ninja. Player 2 wins!");
         }else if (first==2 && second == 5)
         {
            System.out.println("Robot crushes Zombie. Player 1 wins!");
         }else if (second==2 && first == 5)
         {
            System.out.println("Robot crushes Zombie. Player 2 wins!");
         }else if (first==3 && second == 2)
         {
            System.out.println("Pirate drowns Robot. Player 1 wins!");
         }else if (second==3 && first == 2)
         {
            System.out.println("Pirate drowns Robot. Player 2 wins!");
         }else if (first==3 && second == 1)
         {
            System.out.println("Pirate skewers Monkey. Player 1 wins!");
         }else if (second==3 && first == 1)
         {
            System.out.println("Pirate skewers Monkey. Player 2 wins!");
         }else if (first==4 && second == 3)
         {
            System.out.println("Ninja karate chops Pirate. Player 1 wins!");
         }else if (second==4 && first == 3)
         {
            System.out.println("Ninja karate chops Pirate. Player 2 wins!");
         }else if (first==4 && second == 5)
         {
            System.out.println("Ninja decapitates Zombie. Player 1 wins!");
         }else if (second==4 && first == 5)
         {
            System.out.println("Ninja decapitates Zombie. Player 2 wins!");
         }else if (first==5 && second == 3)
         {
            System.out.println("Zombie eats Pirate. Player 1 wins!");
         }else if (second==5 && first == 3)
         {
            System.out.println("Zombie eats Pirate. Player 2 wins!");
         }else if (first==5 && second == 1)
         {
            System.out.println("Zombie savages Monkey. Player 1 wins!");
         }else if (second==5 && first == 1)
         {
            System.out.println("Zombie savages Monkey. Player 2 wins!");
         }
         
          
         System.out.println("The game has finished!");
         
         System.out.println("Would you like to play again?");
         play = input.next().charAt(0);
      }
      while(play == 'y');
   
    
   }
} 
