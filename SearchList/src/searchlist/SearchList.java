/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchlist;

/**
 *
 * @author Education Unlimited
 */

import java.util.ArrayList;
import java.util.Scanner;
public class SearchList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        // PART ONE: search for a value
        ArrayList array = new ArrayList();
        int i = 0;
        while (i < 10) {
            array.add((int)(Math.random()*50+1));
            i++;
        }
        
        //System.out.println("These are the values: " + array);
        
        System.out.print("Search for a number: ");
        int number = Integer.parseInt(keyboard.nextLine());
        boolean numberFound = false;
        
        i = 0;
        while (i < 10) {
            int arrayValue = (int)array.get(i);
            if (arrayValue == number) {
                numberFound = true;
            }
            i++;
        }
        
        if (numberFound == false) {
            System.out.println("Your number, " + number + ", was not found.");
        }
        if (numberFound == true) {
            System.out.println("Your number, " + number + ", was found!");
        }
        
        System.out.println("These were the values: " + array);
        
        // PART TWO: find the max number
        i = 0;
        int max = 0;
        while (i < 10) {
            int value = (int)array.get(i);
            if (value > max) {
                max = value;
            }
            i++;
        }
        System.out.println("The largest number in the set is " + max + ".");
        
        //PART THREE: alphabetically organize
        ArrayList sentence = new ArrayList();
        sentence.add("A ");
        sentence.add("bunch ");
        sentence.add("of ");
        sentence.add("revolutionary ");
        sentence.add("manumission ");
        sentence.add("abolitionists, ");
        sentence.add("give ");
        sentence.add("me ");
        sentence.add("your ");
        sentence.add("position, ");
        sentence.add("show ");
        sentence.add("me ");
        sentence.add("where ");
        sentence.add("the ");
        sentence.add("ammunition ");
        sentence.add("is!");
        // 16 values in the list
        
        int x = 0, comparison = 0;
        i = 1;
        ArrayList newSentence = new ArrayList();
        while (x < 16) {
            //should run through the array 16 times
            String firstWord = (String)sentence.get(0);
            i = 1;
            while (i < (int)sentence.size()) {
                String word = (String)sentence.get(i);
                comparison = word.compareTo(firstWord);
                if (comparison < 0) {
                    firstWord = word;
                }
                i++;
            }
            newSentence.add(firstWord);
            sentence.remove(firstWord);
            x++;
        }
        System.out.println(newSentence);
    }
    
}
