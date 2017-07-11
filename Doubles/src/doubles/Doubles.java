/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubles;

/**
 *
 * @author Education Unlimited
 */
import java.util.Scanner;

public class Doubles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int dice1 = 0;
        int dice2 = 1;
        int round = 0;
        boolean quit = false;
        String choice = "";
        while(dice1 != dice2) {
            //round one
            if (round == 0) {
                System.out.println("Let's roll the dice!");
                dice1 = (int)(Math.random()*6 + 1);
                dice2 = (int)(Math.random()*6 + 1);
                System.out.println("\nDice One shows " + dice1 + ", Dice Two shows " + dice2 + ".");
                    if (dice1 == dice2) {
                        System.out.println("Conratulations, doubles!");
                    }
                round++;
            }
            //all other rounds
            if (round != 0 && (dice1 != dice2)) {
                System.out.println("Do you want to roll again? (yes or no)");
                choice = keyboard.nextLine();
                if (choice.equals("no")) {
                    dice1 = 1;
                    dice2 = 1;
                    System.out.println("\nQuitter!");
                }
                if (choice.equals("yes")) {
                dice1 = (int)(Math.random()*6 + 1);
                dice2 = (int)(Math.random()*6 + 1);
                System.out.println("\nDice One shows " + dice1 + ", Dice Two shows " + dice2 + ".");
                    if (dice1 == dice2) {
                        System.out.println("Congratulations, doubles!");
                    }
                }
            }
        }
        System.out.println("\nGame over!");
    }    
}
