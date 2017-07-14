/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradebook;

import java.util.Scanner;

/**
 *
 * @author Education Unlimited
 */
public class StudentGradeBook {            
    Student[] gradeBook; //gradebook will be an arraylist of students
    int numberOfStudents;
    
    public StudentGradeBook() {
        gradeBook = new Student[50]; //gradebook can hold up to 50 students
        numberOfStudents = 0; //initialize the number of students to zero
    }
    
    public void AddStudent(Student individual) { //Student class variable called individual
        gradeBook[numberOfStudents++] = individual; // the gradeBook takes in a new student (number of people increases by one, will go up to 50)
    }
    
    public void printSummaries() { //function for printing basic student info
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(gradeBook[i].getLastName() + ", " + gradeBook[i].getFirstName() + ".\t" + gradeBook[i].getTotalAverage() + "% (" + gradeBook[i].getLetterGrade() + ").");
            System.out.println("Test average is " + gradeBook[i].getTestScoreAvg() + "%. Assignment average is " + gradeBook[i].getAssignScoreAvg() + "%.\n");
            //^^ from the getter/setter functions created in the student.java
        }
    }
}
