/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scanneruserdata;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class ScannerUserData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "What is your name?" );
        String name = keyboard.nextLine();
        System.out.println("Hello, " + name + "! How old are you?");
        int age = Integer.parseInt(keyboard.nextLine());
        System.out.println("Cool! What month were you born in?");
        String birthMonth = keyboard.nextLine();
        System.out.println("Which day? (number)");
        int birthDay = Integer.parseInt(keyboard.nextLine());
        System.out.println("Which year?");
        int birthYear = Integer.parseInt(keyboard.nextLine());
        System.out.println("What's your favorite book, " + name + "?");
        String book = keyboard.nextLine();
        System.out.println("What's your hometown?");
        String town = keyboard.nextLine();
        System.out.println("What's your lucky number?");
        double number = Double.parseDouble(keyboard.nextLine());
        System.out.println("What size shoes do you wear?");
        double shoe = Double.parseDouble(keyboard.nextLine());
        System.out.println("And on a scale from 1-5, how excited are you to learn Java?");
        double javaFun = Double.parseDouble(keyboard.nextLine());
        System.out.println("And finally, " + name + ", give a cool fact about yourself!");
        String funFact = keyboard.nextLine();
        
        System.out.println("\n " + name + ", age " + age + ", was born on " + birthMonth + " " + birthDay + ", " + birthYear + ".");
        System.out.println(" From " + town + ", " + name + " likes the book " + book + ", and has the lucky number " + number + " and a shoe size of " + shoe + ".");
        System.out.println(" One a scale from 1-5, " + name + " is this excited to learn about Java -- a " + javaFun + "!");
        System.out.println(" A fun fact about " + name + " is: " + funFact + "\n");
        
        int age5 = age + 5;
        System.out.println("In five years, " + name + " will be " + age5 + ".");
        boolean ageDay = age==birthDay;
        System.out.println("It is " + ageDay + " that " + name + "'s age is equal to " + name + "'s day of birth.");
        boolean year2000 = ((birthYear/2000) > 1);
        System.out.println("It is " + year2000 + " that " + name + " was born after the year 2000.");
        double shoeFun = shoe*javaFun;
        System.out.println(name + "'s shoe size multiplied by excitement level is " + shoeFun + "!");
    }
    
}
