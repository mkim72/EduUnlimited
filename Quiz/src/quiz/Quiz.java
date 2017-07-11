/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Education Unlimited
 */
import java.util.Scanner;

public class Quiz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int rightAnswers = 0;
        int totalQuestions = 0;
        System.out.println("Here comes a quiz. No cheating!");
    
        System.out.println("Question 1: What is the capital of California?");
        System.out.println("\tA) San Francisco");
        System.out.println("\tB) Sacramento");
        System.out.println("\tC) Los Angeles");
        System.out.println("\tD) San Jose");
        System.out.print("Your answer: ");
        String answer1 = keyboard.nextLine();
        totalQuestions++;
        if (answer1.equals("B")) {
            System.out.println("Correct! \n");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, the captital is actually Sacramento! \n");
        }
        
        System.out.println("Question 2: Which of the following is a prime number?");
        System.out.println("\tA) 81");
        System.out.println("\tB) 121");
        System.out.println("\tC) 33");
        System.out.println("\tD) 2");
        System.out.print("Your answer: ");
        String answer2 = keyboard.nextLine();
        totalQuestions++;
        if (answer2.equals("D")) {
            System.out.println("Correct! \n");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, 2 was the prime number. \n");
        }
        
        System.out.println("Question 3: Who is credited with the Theory of Evolution?");
        System.out.println("\tA) Kepler");
        System.out.println("\tB) Mendel");
        System.out.println("\tC) Darwin");
        System.out.println("\tD) Einstein");
        System.out.print("Your answer: ");
        String answer3 = keyboard.nextLine();
        totalQuestions++;
        if (answer3.equals("C")) {
            System.out.println("Correct! \n");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, that was Charles Darwin. \n");
        }
        
        System.out.println("Question 4: Which of the following data types can store two?");
        System.out.println("\tA) int");
        System.out.println("\tB) double");
        System.out.println("\tC) string");
        System.out.println("\tD) char");
        System.out.print("Your answer: ");
        String answer4 = keyboard.nextLine();
        totalQuestions++;
        if (answer4.equals("C")) {
            System.out.println("Correct! \n");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, that was a string. \n");
        }
        
        System.out.println("Question 5: Who is the 16th President of the United States?");
        System.out.println("\tA) Abraham Lincoln");
        System.out.println("\tB) Ulysses S Grant");
        System.out.println("\tC) Theodore Roosevelt");
        System.out.println("\tD) Andrew Jackson");
        System.out.print("Your answer: ");
        String answer5 = keyboard.nextLine();
        totalQuestions++;
        if (answer5.equals("A")) {
            System.out.println("Correct! \n");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, that was Lincoln. \n");
        }
        
        System.out.println("Question 6: What is French for 'thanks!'?");
        System.out.println("\tA) bonjour!");
        System.out.println("\tB) salut!");
        System.out.println("\tC) chat!");
        System.out.println("\tD) merci!");
        System.out.print("Your answer: ");
        String answer6 = keyboard.nextLine();
        totalQuestions++;
        if (answer6.equals("D")) {
            System.out.println("Correct! \n");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, 'merci!' is correct. \n");
        }
        
        System.out.println("Question 7: True or False? Gal Gadot portrays Wonder Woman in the recent DC films.");
        System.out.print("Your answer: ");
        String answer7 = keyboard.nextLine();
        totalQuestions++;
        if (answer7.equals("True")) {
            System.out.println("Correct! She's cool. \n");
            rightAnswers++;
        }
        else {
            System.out.println("Sorry, that was . \n");
        }
        
        System.out.println("Your score is " + rightAnswers + " out of " + totalQuestions + " questions.");
    }
    
}
