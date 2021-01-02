import java.util.Random;
import java.util.Scanner;

public class Mission05Marshall
{

   public static void main (String[] args)
   {
      int number; //declares integer
      int player1; //declares integer
      char playAgain; //declares character
      String input; //declares string
      String userChoice; //declares string
      
      Scanner keyboard = new Scanner(System.in); //initializes scanner
   
      Random randomNumbers = new Random(); //initializes randomNumbers and creates a random numbers
      number = randomNumbers.nextInt(3) + 1; //tells random to pick a number 1-3
      
      System.out.println("Let's play a game!."); //output
      
      do 
      {
      
         System.out.println("Please enter 1 for rock, 2 for paper, or 3 for scissors. "); //asks user for input
         userChoice = keyboard.nextLine(); //reads user input
         player1 = Integer.parseInt(userChoice); //converts string to int
                              
         compHand(number); //calls method
      
         winner(player1, number); //calls method
            
         System.out.println("Would you like to play again? Y/N");//ask for user input
         input = keyboard.nextLine(); //reads input
         playAgain = input.charAt(0); //reads charecter
      
      }
      
      while (playAgain == 'Y' || playAgain == 'y'); //decides if loop should continue
      {
         System.out.println("Let's play again soon!"); //output
      }
   
   }
   
   /**
      this method decides what output to use depending on random number
   */
   public static void compHand(int number)
   {
      String compChoice;
      
      if (number == 1)
      {
         compChoice = "Rock";
         System.out.println("The computer chooses " + compChoice + ".");
      }
      
      else if (number == 2)
      {
         compChoice = "Paper";
         System.out.println("The computer chooses " + compChoice + ".");
      }
      
      else if (number == 3)
      {
         compChoice = "Scissors";
         System.out.println("The computer chooses " + compChoice + ".");
      } 
   }
   
   /**
      This method tests who the winner is
   */
   
   public static void winner(int player1, int player2)
   {
      if (player1 == 1 && player2 == 1)
      {
         System.out.println("It's a tie!");
      }
      
      else if (player1 == 2 && player2 == 2)
      {
         System.out.println("It's a tie!");
      }
      
      else if (player1 == 3 && player2 == 3)
      {
         System.out.println("It's a tie!");
      }
      
      else if (player1 == 1 && player2 == 3)
      {
         System.out.println("You win! Rock smashes scissors!");
      }
      
      else if (player1 == 3 && player2 == 1)
      {
         System.out.println("The computer wins! Rock smashes scissors!");
      }
      
      else if (player1 == 2 && player2 == 1)
      {
         System.out.println("You win! Paper covers rock!");
      }
      
      else if (player1 == 1 && player2 == 2)
      {
         System.out.println("The computer wins! Paper covers rock!");
      }
      
      else if (player1 == 3 && player2 == 2)
      {
         System.out.println("You win! Scissors cut paper!");
      }
      
      else if (player1 == 2 && player2 == 3)
      {
         System.out.println("The computer wins! Scissors cut paper!");
      }
   }
      
}
   
   
   
   
   
      
