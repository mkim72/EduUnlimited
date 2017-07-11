/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highorlow;

/**
 *
 * @author Education Unlimited
 */
import java.util.Scanner;

public class HighOrLow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int numberReal = (int) (Math.random() * 100 + 1);
        int numberGuess = 0;
        int guesses = 0;
        int hintValue = 0;
        System.out.println("I'm thinking of a number between 1 and 100!\n");
        while (numberReal != numberGuess) {
            System.out.print("What number am I thinking of? ");
            numberGuess = Integer.parseInt(keyboard.nextLine());
            if (numberGuess < numberReal) {
                System.out.println("Bummer, too low!\n");
                guesses++;
            }
            if (numberGuess > numberReal) {
                System.out.println("Yikes, too high!\n");
                guesses++;
            }
            if (numberGuess == numberReal) {
                guesses++;
                System.out.println("\nCongratulations, you guessed it! I was thinking of " + numberReal + ".");
                System.out.println("Only took you " + guesses + " guesses!");
            }
            //HINT :)
            if (guesses == 10 && (numberReal != numberGuess)) {
                hintValue = numberReal / 10 * 10;
                System.out.println("Having trouble? Try numbers " + hintValue + " to " + (hintValue + 10) + ".\n");
            }
        }
    }

}
