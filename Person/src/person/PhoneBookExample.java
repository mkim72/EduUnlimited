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
public class PhoneBookExample {
     public static void main(String[] args) {
         //use the Person array! not individual strings
         
         Person indiv1 = new Person("George", "Washington", "(123) 456-7890");
         Person indiv2 = new Person("Abraham", "Lincoln", "(345) 345-3456");
         Person indiv3 = new Person("Marilyn", "Monroe", "(789) 789-7890");
         
         PhoneBook pB = new PhoneBook();
         pB.AddPerson(indiv1);
         pB.AddPerson(indiv2);
         pB.AddPerson(indiv3);
         pB.printEntries();             //functions created in PhoneBook
     }
    
}
