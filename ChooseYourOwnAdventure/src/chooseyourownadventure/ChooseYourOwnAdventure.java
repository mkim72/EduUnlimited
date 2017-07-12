/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourownadventure;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ChooseYourOwnAdventure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // first round: choice1
        // second round: choice2
        // third round: choice3
        //RESTART
        boolean playAgain = false;
        while (playAgain = false) {
            //CHOICE #1
            System.out.println("You're in a house or a castle, maybe, that much you can tell. You don't know why or how you're here.\nIt at first seems like you're alone, but then you notice two doors in front of you.");
            System.out.println("     ** The door on the left is burnished gold, with faded ornamentations around the handle. \n     The floor is dusty around it.");
            System.out.println("     ** The door on the right is made of a rotting wood. There is distant music coming from behind the door, \n     and the floor in front of it is clean.");
            System.out.println("You must pick a door -- left or right?");
            System.out.print("CHOOSE: ");
            String choice1 = keyboard.nextLine();

            //CHOICE #2
            String choice2 = "";
            if (choice1.equals("left")) {
                System.out.println("\nThe door on the left opens to a sitting room. Judging by the sheer amount of gold in the room, \nit was likely used to entertain important guests.");
                System.out.println("You move aside a thick, heavy rug with tassles. Beneath it is a trapdoor.");
                System.out.println("     A) You can hear water rushing beneath the floorboards. Do you want to chance an escape?");
                System.out.println("     B) There's a door on your right, but the handle is scratched up. It looks foreboding.");
                System.out.println("Make your choice -- A or B?");
                System.out.print("CHOOSE: ");
                choice2 = keyboard.nextLine();
            }
            if (choice1.equals("right")) {
                System.out.println("\nThe door on the right opens to a grand ballroom. Your footsteps echo throughout the enormous room.");
                System.out.println("As you wander to the center of the room, the music gets louder.");
                System.out.println("     C) Do you want to continue following the music to the large organ in the corner?");
                System.out.println("     D) One of the stained glass windows is broken. Maybe that's your exit.");
                System.out.println("Make your choice -- C or D?");
                System.out.print("CHOOSE: ");
                choice2 = keyboard.nextLine();
            }
            else {
                System.out.println("\nYou may only go left or right.");
                System.out.print("CHOOSE: ");
            }

            //CHOICE #3
            String choice3 = "";
            if (choice2.equals("A")) {
                System.out.println("\nThe trapdoor drops you directly into a stone room. The water is further beneath, and can be accessed by a drain you soon discover.");
                System.out.println("It is completely dark. Feeling along the walls, you realize you can go further.");
                System.out.println("     1) You can remove the grate and drop into the rushing waters below. It must leave the house at some point.");
                System.out.println("     2) You can feel along the walls and perhaps find a tunnel leading out of the house.");
                System.out.println("Make your choice -- 1 or 2?");
                choice3 = keyboard.nextLine();
            }
            if (choice2.equals("B")) {
                System.out.println("\nThe bizarrely scratched up doorknob takes a while to get open, but you soon find yourself in a library.");
                System.out.println("Faded portraits hang on the walls, and it's somewhat chilling.");
                System.out.println("     3) There's a tunnel behind a large portrait of an opera singer. Should you chance it?");
                System.out.println("     4) There's a chill running behind a curtain -- a soft breeze. Could a window be open?");
                System.out.println("Make your choice -- 3 or 4?");
                choice3 = keyboard.nextLine();
            }
            if (choice2.equals("C")) {
                System.out.println("\nThere's nobody at the organ, and the keys aren't moving. Instead, there's an ancient phonograph playing.");
                System.out.println("But now that you're at the organ, you can hear something scratching behind the wall.");
                System.out.println("     5) You can still leave. There's nothing stopping you from exiting the ballroom. Right?");
                System.out.println("     6) Or, you could pull away the wall panel and see what's scratching.");
                System.out.println("Make your choice -- 5 or 6?");
                choice3 = keyboard.nextLine();
            }
            if (choice2.equals("D")) {
                System.out.println("\nYou hop out of the stained glass window, but you're too weak and you cut your leg. It's chillingly dark and cold out.");
                System.out.println("There's two paths in the woods ahead of you.");
                System.out.println("     7) One is dense with dark trees and looks foreboding.");
                System.out.println("     8) The other has brambles and other sharp plants, but you can see a faint light at the end.");
                System.out.println("Risk your leg? 7 or 8.");
                choice3 = keyboard.nextLine();
            }
            else {
                System.out.println("\nYou MUST make a choice! Hurry!");
                System.out.print("CHOOSE: ");
            }

            //FINAL ROOMS
            String choice4 = "";
            if (choice3.equals("1")) {
                System.out.println("\nYou fall into the rushing waters below, but they're too fierce.");
                System.out.println("You drown in the filthy depths of the sewage.");
                System.out.print("\nWould you like to play again? ");
                choice4 = keyboard.nextLine();
            }
            if (choice3.equals("2")) {
                System.out.println("\nYou follow the tunnel, and your hopes crawl slowly up as you realize there's a light at the end.");
                System.out.println("You exit the mansion, but your hopes are crushed when you realize that you're in the middle of the forest.");
                System.out.println("You die wandering the maze of the dark, dark woods.");
                System.out.print("\nWould you like to play again? ");
                choice4 = keyboard.nextLine();
            }
            if (choice3.equals("3")) {
                System.out.println("\nYou take the tunnel through the portrait, and it empties into a field of sharp brambles.");
                System.out.println("You wander through the sharp bushes until you meet a cabdriver.");
                System.out.println("She's kind enough to give you a ride to the city, where you find the help you need.");
                System.out.print("\nCongratulations, you survived! Would you like to play again? ");
                choice4 = keyboard.nextLine();
            }
            if (choice3.equals("4")) {
                System.out.println("\nYou step out the window, but you're not on the first floor.");
                System.out.println("You fall to your death below.");
                System.out.print("\nWould you like to play again? ");
                choice4 = keyboard.nextLine();
            }
            
            if (choice4 == "yes") {
                playAgain = false;
            }
            if (choice4 == "no") {
                playAgain = true;
            }
        }
        System.out.println("\nThanks for playing!");
    }
}
