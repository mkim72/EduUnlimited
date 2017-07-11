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
            System.out.println("\nThe door on the right opens to a grand ballroom. That's confusing -- you could've sworn you were on the second floor.");
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
            System.out.println("The trapdoor drops you directly into a stone room. The water is further beneath, and can be accessed by a drain you soon discover.");
            System.out.println("It is completely dark. Feeling along the walls, you realize you can go further.");
            System.out.println("     1) You can remove the grate and drop into the rushing waters below. It must leave the house at some point.");
            System.out.println("     2) You can feel along the walls and perhaps find a tunnel leading out of the house.");
            System.out.println("Make your choice -- 1 or 2?");
            choice3 = keyboard.nextLine();
        }
        if (choice2.equals("B")) {
            System.out.println("The bizarrely scratched up doorknob takes a while to get open, but you soon find yourself in a library.");
            System.out.println("Faded portraits hang on the walls, and ");
            System.out.println("     1) You can remove the grate and drop into the rushing waters below. It must leave the house at some point.");
            System.out.println("     2) You can feel along the walls and perhaps find a tunnel leading out of the house.");
            System.out.println("Make your choice -- 1 or 2?");
            choice3 = keyboard.nextLine();
        }
    }
}
