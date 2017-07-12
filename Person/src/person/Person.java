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

    String phoneNumber, firstName, lastName;
    String hobby;
    int age, grade;
    double height;
    boolean isAStudent;
    
    public Person (String newFirstName, String newLastName, String newPhoneNumber) {
        firstName = newFirstName;
        lastName = newLastName;
        phoneNumber = newPhoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
