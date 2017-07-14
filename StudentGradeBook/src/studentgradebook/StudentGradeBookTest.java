/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradebook;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Education Unlimited
 */
public class StudentGradeBookTest {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to GradeBook, a useful electronic tool for storing students' grades!");
        System.out.println("Let's start by building your class.");
        
        System.out.println("\n\nSTEP 1: CREATE A CLASS");
        System.out.println("First, let's name your class. (Ex: Biology, Period 1)");
        System.out.print("NAME OF CLASS: ");
        String className = keyboard.nextLine();
        System.out.println("\nThank you! You may now start adding students to " + className + ".");

        System.out.println("\n\nSTEP 2: ADD STUDENTS");
        //FOR LOOP WILL AUTOMATICALLY END AFTER NUMBER OF STUDENTS ARE ENTERED
        System.out.println("How many students are in your class? You can add up to 50 per class.");
        System.out.print("\tNUMBER OF STUDENTS: ");
        int inClass = Integer.parseInt(keyboard.nextLine());
        while (inClass < 1 || inClass > 50) {
            System.out.println("Please enter a valid number.");
            System.out.print("\tNUMBER OF STUDENTS: ");
            inClass = Integer.parseInt(keyboard.nextLine());
        }
        //GET WEIGHT FOR TESTS & ASSIGNMENTS
        System.out.println("\nAnd how much weight do tests carry? (Ex: If 50%, enter 50.)");
        System.out.print("\tTESTS: ");
        double testWeight = Double.parseDouble(keyboard.nextLine());
        System.out.println("How much weight do assignments carry? (Ex: If 50%, enter 50.)");
        System.out.print("\tASSIGNMENTS: ");
        double assignWeight = Double.parseDouble(keyboard.nextLine());
        System.out.println("\nThank you! Now we can start adding students.");

        StudentGradeBook gradeBook = new StudentGradeBook(); //creates a new StudentGradeBook class called "gradeBook"

        for (int i = 0; i < inClass; i++) {
            //STUDENT INDENTIFICATION
            System.out.println("\nSTUDENT #" + (i+1));
            System.out.print("\tFIRST NAME: ");
            String tempFirstName = keyboard.nextLine();
            System.out.print("\tLAST NAME: ");
            String tempLastName = keyboard.nextLine();

            //ADD TEST SCORES, FIND AVERAGE
            System.out.println("Let's add test scores for " + tempFirstName + ".");
            System.out.println("How many tests do you plan on adding?");
            System.out.print("\tNUMBER OF TESTS: ");
            int numberOfTests = Integer.parseInt(keyboard.nextLine());
            ArrayList allTests = new ArrayList();
            for (int x = 0; x < numberOfTests; x++) {
                System.out.print("\t\tTEST SCORE #" + (x+1) + ": ");
                double test = Double.parseDouble(keyboard.nextLine());
                allTests.add(test);
            }
            double testAverage = round(findAverage(allTests), 2); //test grade to 2 decimals

            //ADD ASSIGNMENT SCORES, FIND AVERAGE
            System.out.println("Let's add assignment scores for " + tempFirstName + ".");
            System.out.println("How many assignments do you plan on adding?");
            System.out.print("\tNUMBER OF ASSIGNMENTS: ");
            int numberOfAssign = Integer.parseInt(keyboard.nextLine());
            ArrayList allAssign = new ArrayList();
            for (int x = 0; x < numberOfAssign; x++) {
                System.out.print("\t\tASSIGNMENT SCORE #" + (x+1) + ": ");
                double assign = Double.parseDouble(keyboard.nextLine());
                allAssign.add(assign);
            }
            double assignAverage = round(findAverage(allAssign), 2); //assignment grade to 2 decimals
            
            double tempAverage = round(findStudentAverage(testAverage, assignAverage, testWeight, assignWeight), 2); //the total grade to 2 decimals

            String tempGrade = findLetter(tempAverage);
            
            Student newStudent = new Student(tempFirstName, tempLastName, tempAverage, tempGrade, testAverage, assignAverage, allTests, allAssign);
            gradeBook.AddStudent(newStudent); //adding objects to class type student, which holds the info
        }
        System.out.println("\nYOUR GRADEBOOK FOR " + className + ":");
        gradeBook.printSummaries(); //print students with grades!
        System.out.println("\nDONE! Congratulations!");
        
        System.out.println("\n\nNow that you're done building your class, here are some options for accessing your students' stats:");
        System.out.println("\t(a) Look at the specific scores for one student.\n\t(b) Compare students to check for advancement by number.\n\t(c) Compare students to check for advancement by graph.");
        System.out.print("SELECT: ");
        String select = keyboard.nextLine();
    }
    
    //FOR ROUNDING STUFF
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public static double findAverage(ArrayList allWork) {
        double allWorkTogether = 0;
        for (int i = 0; i < allWork.size(); i++){
            allWorkTogether += (double)allWork.get(i);
        }
        return allWorkTogether / allWork.size();
    }
    
    public static double findStudentAverage(double testAvg, double assignAvg, double testWeight, double assignWeight) {
        double tests = testAvg * (testWeight / 100);
        double assignments = assignAvg * (assignWeight / 100);
        return (tests + assignments);
    }
    
    public static String findLetter(double averageTestScore) {
        String rV = "error";
        if (averageTestScore > 0) {
            rV = "F";
        }
        if (averageTestScore > 59.49) {
            rV = "D-";
        }
        if (averageTestScore > 63.49) {
            rV = "D";
        }
        if (averageTestScore > 67.49) {
            rV = "D+";
        }
        if (averageTestScore > 69.49) {
            rV = "C-";
        }
        if (averageTestScore > 73.49) {
            rV = "C";
        }
        if (averageTestScore > 77.49) {
            rV = "C+";
        }
        if (averageTestScore > 79.49) {
            rV = "B-";
        }
        if (averageTestScore > 83.49) {
            rV = "B";
        }
        if (averageTestScore > 87.49) {
            rV = "B+";
        }
        if (averageTestScore > 89.5) {
            rV = "A-";
        }
        if (averageTestScore > 93.49) {
            rV = "A";
        }
        if (averageTestScore > 97.49) {
            rV = "A+";
        }
        return rV;
    }
}
