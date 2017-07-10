/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Education Unlimited
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age = 17;
        double height = 5.25; //feet
        String firstName = "Michelle";
        String lastName = "Kim";
        boolean isAStudent = true;
        int grade = 12;
        String instrument = "piano";
        
        System.out.println("My name is " + firstName + " " + lastName + ".");
        System.out.println("I am " + age + " years old.");
        System.out.println("My height, in feet, is " + height + ".");
        System.out.println("It is " + isAStudent + " that I am a student.");
        System.out.println("Next school year, I will be in " + grade + "th grade.");
        System.out.println("I can play the " + instrument + ".");
    }
    
}
