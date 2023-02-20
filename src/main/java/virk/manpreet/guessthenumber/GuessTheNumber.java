/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package virk.manpreet.guessthenumber;
import java.util.Scanner;
import java.security.SecureRandom;
/**
 *
 * @author sukhm
 */
public class GuessTheNumber {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       boolean PlayAgain = true;
              while (PlayAgain){
       SecureRandom random = new SecureRandom();
              

       int Guess, guess;
        
      Guess = random.nextInt(1000)+1;
      System.out.print("Guess a number 0 - 1000");
      guess = scanner.nextInt();
     
      while (guess != Guess) {
                if (guess < Guess) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
                guess = scanner.nextInt();
      }
      System.out.println("Congrats");
           String input = scanner.nextLine();

            if (input.equals("y")) {
                PlayAgain = true;
            } else {
                PlayAgain = false;
            }
        }
    
              
              
    }
       
            

    }


