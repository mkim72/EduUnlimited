/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloopfun;

/**
 *
 * @author Education Unlimited
 */
import java.util.Scanner;

public class ForLoopFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("I love Java!");
        }
        System.out.println();
        
        System.out.println("Up to which number should I count?");
        int userInput = Integer.parseInt(keyboard.nextLine());
        for (int i = 0; i < userInput; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        int start = 0, end = 0, count = 0, i = 0;
        System.out.println("I need a starting number, ending number, and number to count by.");
        System.out.print("START: ");
        start = Integer.parseInt(keyboard.nextLine());
        System.out.print("END: ");
        end = Integer.parseInt(keyboard.nextLine());
        System.out.print("COUNT BY: ");
        count = Integer.parseInt(keyboard.nextLine());
        for (i = start; i <= end; i +=count); {
            System.out.print(i + " ");
        }
        
    }
    
}
