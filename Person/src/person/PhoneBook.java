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
public class PhoneBook {
    
    Person[] pB; // <-- using the Person class (instead of String class)
    int numberPeople;
    
    public PhoneBook() {
        pB = new Person[100];
        numberPeople = 0;
    } 
    
    public void AddPerson(Person individual) { //Person class variable called individual
        pB[numberPeople++] = individual; // the phonebook takes in a new person (number of people increases by one, will go up to 100)
    }
    
    public void printEntries() {
        for (int i = 0; i < numberPeople; i++) {
            System.out.println(pB[i].getFirstName() + " " + pB[i].getLastName() + ", " + pB[i].getPhoneNumber());
        }
    }
}