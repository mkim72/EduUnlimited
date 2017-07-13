/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chooseyourownadventurenest;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ChooseYourOwnAdventureNest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        //SET UP VARIABLES
        System.out.println("Welcome.");
        boolean playAgain = true;
        String choice1, choice2, choice3, choice4;
        //SET UP WHILE LOOP
        while (playAgain == true) {
            //INITIALIZE / RESET VARIABLES
            choice1 = "";
            choice2 = "";
            choice3 = "";
            choice4 = "";
            //INTRO / FIRST ROOM
            System.out.println("\nYou're in a house or a castle, maybe, that much you can tell. You don't know why or how you're here.\nIt at first seems like you're alone, but then you notice two doors in front of you.");
            System.out.println("     LEFT: The door on the left is burnished gold, with faded ornamentations around the handle. \n     The floor is dusty around it.");
            System.out.println("     RIGHT: The door on the right is made of a rotting wood. There is distant music coming from behind the door, \n     and the floor in front of it is clean.");
            System.out.println("You must pick a door -- left or right?");
            System.out.print("CHOOSE: ");
            choice1 = keyboard.nextLine();
                //ERROR MESSAGE (FIRST CHOICE)
                while (!choice1.equals("left") && !choice1.equals("right")) {
                    System.out.println("\nMake your choice -- left or right?");
                    System.out.print("CHOOSE: ");
                    choice1 = keyboard.nextLine();
                }
                //IF LEFT IS CHOSEN (FIRST CHOICE)
                if (choice1.equals("left")) {
                    System.out.println("\nThe door on the left opens to a sitting room. Judging by the sheer amount of gold in the room, \nit was likely used to entertain important guests.");
                    System.out.println("You move aside a thick, heavy rug with tassles. Beneath it is a trapdoor.");
                    System.out.println("     A) You can hear water rushing beneath the floorboards. Do you want to chance an escape?");
                    System.out.println("     B) There's a door on your right, but the handle is scratched up. It looks foreboding.");
                    System.out.println("Make your choice -- A or B?");
                    System.out.print("CHOOSE: ");
                    choice2 = keyboard.nextLine();
                    //ERROR MESSAGE (SECOND CHOICE)
                    while (!choice2.equals("A") && !choice2.equals("B")) {
                        System.out.println("\nMake your choice!");
                        System.out.print("CHOOSE: ");
                        choice2 = keyboard.nextLine();
                    }
                    //IF A IS CHOSEN (SECOND CHOICE)
                    if (choice2.equals("A")) {
                        System.out.println("\nThe trapdoor drops you directly into a stone room. The water is further beneath, and can be accessed by a drain you soon discover.");
                        System.out.println("It is completely dark. Feeling along the walls, you realize you can go further.");
                        System.out.println("     1) You can remove the grate and drop into the rushing waters below. It must leave the house at some point.");
                        System.out.println("     2) You can feel along the walls and perhaps find a tunnel leading out of the house.");
                        System.out.println("Make your choice -- 1 or 2? ");
                        System.out.print("CHOOSE: ");
                        choice3 = keyboard.nextLine();
                        //ERROR MESSAGE (THIRD CHOICE)
                        while (!choice3.equals("1") && !choice3.equals("2")) {
                            System.out.println("\nMake your choice!");
                            System.out.print("CHOOSE: ");
                            choice3 = keyboard.nextLine();
                        }
                        //IF 1 IS CHOSEN (THIRD CHOICE)
                        if (choice3.equals("1")) {
                            System.out.println("\nYou fall into the rushing waters below, but they're too fierce!");
                            System.out.println("You drown in the filthy depths of the sewage.");
                            System.out.println("\nWould you like to play again? ");
                            System.out.print("CHOOSE: ");
                            choice4 = keyboard.nextLine();
                        }
                        //IF 2 IS CHOSEN (THIRD CHOICE)
                        else if (choice3.equals("2")) {
                            System.out.println("\nYou follow the tunnel, and your hopes crawl slowly up as you realize there's a light at the end.");
                            System.out.println("You exit the mansion, but your hopes are crushed when you realize that you're in the middle of the forest.");
                            System.out.println("You die wandering the maze of the dark, dark woods.");
                            System.out.println("\nWould you like to play again? ");
                            System.out.print("CHOOSE: ");
                            choice4 = keyboard.nextLine();
                        }
                    }
                    //IF B IS CHOSEN (SECOND CHOICE)
                    else if (choice2.equals("B")) {
                        System.out.println("\nThe bizarrely scratched up doorknob takes a while to get open, but you soon find yourself in a library.");
                        System.out.println("Faded portraits hang on the walls, and it's somewhat chilling.");
                        System.out.println("     1) There's a tunnel behind a large portrait of an opera singer. Should you chance it?");
                        System.out.println("     2) There's a chill running behind a curtain -- a soft breeze. Could a window be open?");
                        System.out.println("Make your choice -- 1 or 2? ");
                        System.out.print("CHOOSE: ");
                        choice3 = keyboard.nextLine();
                        //ERROR MESSAGE (THIRD CHOICE)
                        while (!choice3.equals("1") && !choice3.equals("2")) {
                            System.out.println("\nMake your choice!");
                            System.out.print("CHOOSE: ");
                            choice3 = keyboard.nextLine();
                        }
                        //IF 1 IS CHOSEN (THIRD CHOICE)
                        if (choice3.equals("1")) {
                            System.out.println("\nYou take the tunnel through the portrait, and it empties into a field of sharp brambles.");
                            System.out.println("Finally, you come to a dimly lit street and a cabdriver.");
                            System.out.println("She's kind enough to give you a ride to the city, where you find the help you need.");
                            System.out.println("\nCongratulations, you survived! Would you like to play again? ");
                            System.out.print("CHOOSE: ");
                            choice4 = keyboard.nextLine();
                        }
                        //IF 2 IS CHOSEN (THIRD CHOICE)
                        else if (choice3.equals("2")) {
                            System.out.println("\nThere is a window! You step out, but you're not on the first floor.");
                            System.out.println("You fall to your death below.");
                            System.out.println("\nWould you like to play again? ");
                            System.out.print("CHOOSE: ");
                            choice4 = keyboard.nextLine();
                        }
                    }
                }
                //IF RIGHT IS CHOSEN (FIRST CHOICE)
                else if (choice1.equals("right")) {
                    System.out.println("\nThe door on the right opens to a grand ballroom. Your footsteps echo throughout the enormous room.");
                    System.out.println("As you wander to the center, the music gets louder.");
                    System.out.println("     A) Do you want to continue following the music to the large organ in the corner?");
                    System.out.println("     B) One of the stained glass windows is broken. Maybe that's your exit.");
                    System.out.println("Make your choice -- A or B?");
                    System.out.print("CHOOSE: ");
                    choice2 = keyboard.nextLine();
                    //ERROR MESSAGE (SECOND CHOICE)
                    while (!choice2.equals("A") && !choice2.equals("B")) {
                        System.out.println("\nMake your choice!");
                        System.out.print("CHOOSE: ");
                        choice2 = keyboard.nextLine();
                    }
                    //IF A IS CHOSEN (SECOND CHOICE)
                    if (choice2.equals("A")) {
                        System.out.println("\nThere's nobody at the organ, and the keys aren't moving. Instead, there's an ancient phonograph playing.");
                        System.out.println("But now that you're at the organ, you can hear something scratching behind the wall.");
                        System.out.println("     1) You can still leave. There's nothing stopping you from exiting the ballroom. Right?");
                        System.out.println("     2) Or, you could pull away the wall panel and see what's scratching.");
                        System.out.println("Make your choice -- 1 or 2? ");
                        System.out.print("CHOOSE: ");
                        choice3 = keyboard.nextLine();
                        //ERROR MESSAGE (THIRD CHOICE)
                        while (!choice3.equals("1") && !choice3.equals("2")) {
                            System.out.println("\nMake your choice!");
                            System.out.print("CHOOSE: ");
                            choice3 = keyboard.nextLine();
                        }
                        //IF 1 IS CHOSEN (THIRD CHOICE)
                        if (choice3.equals("1")) {
                            System.out.println("\nYou turn around to leave the ballroom, terrified, and hurry back to the first room to remake your choice.");
                            playAgain = true;
                        }
                        //IF 2 IS CHOSEN (THIRD CHOICE)
                        else if (choice3.equals("2")) {
                            System.out.println("\nYou manage to pry away at the wall panel, intensely curious. Finally, it's loose!");
                            System.out.println("But behind the panel is a rabid dog. You die at its claws.");
                            System.out.println("\nWould you like to play again? ");
                            System.out.print("CHOOSE: ");
                            choice4 = keyboard.nextLine();
                        }
                    }
                    //IF B IS CHOSEN (SECOND CHOICE)
                    else if (choice2.equals("B")) {
                        System.out.println("\nYou hop out of the stained glass window, but you're too weak and you cut your leg. It's chillingly dark and cold out.");
                        System.out.println("There's two paths in the woods ahead of you.");
                        System.out.println("     1) One is dense with dark trees and looks foreboding.");
                        System.out.println("     2) The other has brambles and other sharp plants, but you can see a faint light at the end.");
                        System.out.println("Risk your leg? 1 or 2. ");
                        System.out.print("CHOOSE: ");
                        choice3 = keyboard.nextLine();
                        //ERROR MESSAGE (THIRD CHOICE)
                        while (!choice3.equals("1") && !choice3.equals("2")) {
                            System.out.println("\nMake your choice!");
                            System.out.print("CHOOSE: ");
                            choice3 = keyboard.nextLine();
                        }
                        //IF 1 IS CHOSEN (THIRD CHOICE)
                        if (choice3.equals("1")) {
                            System.out.println("\nYou wander through the dark forest, limping on your injured leg. It's quickly becoming colder.");
                            System.out.println("You die wandering in the maze-like woods.");
                            System.out.println("\nWould you like to play again? ");
                            System.out.print("CHOOSE: ");
                            choice4 = keyboard.nextLine();
                        }
                        //IF 2 IS CHOSEN (THIRD CHOICE)
                        else if (choice3.equals("2")) {
                            System.out.println("\nYou wander through the brambles, limping on your hurt leg and suffering some more minor injuries.");
                            System.out.println("However, at the end you find a dimly lit street and a cabdriver.");
                            System.out.println("She's kind enough to give you a ride to the city, where you find the help you need.");
                            System.out.println("\nCongratulations, you survived! Would you like to play again? ");
                            System.out.print("CHOOSE: ");
                            choice4 = keyboard.nextLine();
                        }
                    }
                }
            if (choice4.equals("no")) {
                playAgain = false;
            }
            else {
                playAgain = true;
            }
        }
        System.out.println("\nThanks for playing!");
    }
}
