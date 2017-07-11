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
        // first round: roomC1R1
        // second round: roomC2R1, roomC2R2
        // third round: roomC3R1, roomC3R2, roomC3R3, roomC3R4
        System.out.println("You're in a house or a castle, maybe, that much you can tell. You don't know why or how you're here.\n It at first seems like you're alone, but then you notice two doors in front of you.");
        System.out.println("1) The door on the left is burnished gold, with faded ornamentations around the handle. The floor is dusty around it.");
        System.out.println("2) The door on the right is made of a rotting wood. There is distant music coming from behind the door, and the floor in front of it is clean.");
        System.out.println("You must pick a door -- left or right?");
        String choice1 = keyboard.nextLine();
        
        if (choice1.equals("left")) {
            System.out.println("The door on the left opens to a sitting room. Judging by the sheer amount \nof gold in the room, it was likely used to entertain important guests.");
            System.out.println("You move aside a thick, heavy rug with tassles. Beneath it is a trapdoor.");
            System.out.println("1) You can hear water rushing beneath the floorboards. Do you want to chance an escape?");
            System.out.println("2) There's a door on your right, but the handle is ");
        }
    }
}
