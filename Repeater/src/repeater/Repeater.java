/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeater;

/**
 *
 * @author Education Unlimited
 */
import java.util.Scanner;
public class Repeater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       System.out.print("Type something, and I will repeat it! How many repetitions would you like? ");
       int countInput = Integer.parseInt(keyboard.nextLine());
       System.out.print("What would you like repeated? ");
       String stringInput = keyboard.nextLine();
       
       System.out.println("Here we go!");
       int count = 0; //if count starts at 0, use <countInput & (count+1); if count starts at 1, use <=countInput & (count)
       while (count < countInput) { 
           System.out.println((count+1) + ". " + stringInput);
           count ++;
       }
    }
    
}
