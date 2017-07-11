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
        //PART #1
        for (int i = 0; i < 10; i++) {
            System.out.println("I love Java!");
        }
        System.out.println();
        
        //PART #2
        System.out.print("Up to which number should I count? ");
        int userInput = Integer.parseInt(keyboard.nextLine());
        for (int i = 0; i < userInput; i++) {
            System.out.print((i+1) + " ");
        }
        System.out.println("\n");
        
        //PART #3 (IC)
        System.out.println("I need a starting number, ending number, and number to count by.");
        System.out.print("START: ");
        int start = Integer.parseInt(keyboard.nextLine());
        System.out.print("END: ");
        int end = Integer.parseInt(keyboard.nextLine());
        System.out.print("COUNT BY: ");
        int count = Integer.parseInt(keyboard.nextLine());
        for (int i = start; i <= end; i+=count) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
        
        //PART #4
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i + 1;
        }
        int[] arrayCopy = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayCopy[i] = array[i] + 2;
            System.out.print(arrayCopy[i] + " ");
        }
        System.out.println("\n");
        
        //PART #5
        int[] array100 = new int[100];
        for (int i = 0; i < 100; i++) {
            array100[i] = i + 1;
            if (array100[i]%5 == 0) {
                System.out.println(array100[i] + "!");
            }
            else {
                System.out.println(array100[i]);
            }
        }
    }
}
