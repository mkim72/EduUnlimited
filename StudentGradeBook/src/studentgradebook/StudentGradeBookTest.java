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
        
        //"starting screen"
        System.out.println("\n\nWelcome to GradeBook, a useful electronic tool for storing students' grades!");
        System.out.println("Let's start by building your class.");
        
        //STEP ONE: CREATE A CLASS
        System.out.println("\n\nSTEP 1: CREATE A CLASS");
        System.out.println("First, let's name your class. (Ex: Biology, Period 1)");
        System.out.print("NAME OF CLASS: ");
        String className = keyboard.nextLine();
        //get weights for tests/assignments, to use later in calculating scores, etc
        System.out.println("\nAnd how much weight do tests carry? (Ex: If 50%, enter 50.)");
        System.out.print("\tTESTS: ");
        double testWeight = Double.parseDouble(keyboard.nextLine());
        System.out.println("How much weight do assignments carry? (Ex: If 50%, enter 50.)");
        System.out.print("\tASSIGNMENTS: ");
        double assignWeight = Double.parseDouble(keyboard.nextLine());
        while ((testWeight + assignWeight) != 100) {
            System.out.println("\nYour weights don't add up to 100! Try again.");
            System.out.print("\tTESTS: ");
            testWeight = Double.parseDouble(keyboard.nextLine());
            System.out.print("");
            System.out.print("\tASSIGNMENTS: ");
            assignWeight = Double.parseDouble(keyboard.nextLine());
        }
        System.out.println("\nThank you! Now we can start adding students.");

        //STEP TWO: ADD STUDENTS
        System.out.println("\n\nSTEP 2: ADD STUDENTS");
        //ensures that the for loop (later) will end automatically after all students are added
        System.out.println("How many students are in your class? You can add up to 50 per class.");
        System.out.print("\tNUMBER OF STUDENTS: ");
        int inClass = Integer.parseInt(keyboard.nextLine());
        //in case user tries to add 0 or 5034 students
        while (!(inClass >= 1 && inClass <= 50)) {
            System.out.println("Please enter a valid number.");
            System.out.print("\tNUMBER OF STUDENTS: ");
            inClass = Integer.parseInt(keyboard.nextLine());
        }
        
        StudentGradeBook gradeBook = new StudentGradeBook(); //creates a new StudentGradeBook (class) called "gradeBook"
        
        //for loop that requires # of students to end
        for (int i = 0; i < inClass; i++) {
            //student indentification
            System.out.println("\nSTUDENT #" + (i+1));
            System.out.print("\tFIRST NAME: ");
            String tempFirstName = keyboard.nextLine();
            System.out.print("\tLAST NAME: ");
            String tempLastName = keyboard.nextLine();

            //determines how many test scores the loop will take in
            System.out.println("Let's add test scores for " + tempFirstName + ".");
            System.out.println("How many tests do you plan on adding?");
            System.out.print("\tNUMBER OF TESTS: ");
            int numberOfTests = Integer.parseInt(keyboard.nextLine());
            while (numberOfTests == 0) {
                System.out.println("You must enter at least one test score.");
                System.out.print("\tNUMBER OF TESTS: ");
            }
            ArrayList allTests = new ArrayList();
            //this for loop adds all the test grades together
            for (int x = 0; x < numberOfTests; x++) {
                //user enters test scores
                System.out.print("\t\tTEST SCORE #" + (x+1) + ": ");
                double test = Double.parseDouble(keyboard.nextLine());
                //error message for if the score is not between 0 and 100
                while (test < 0 || test > 100) { 
                    System.out.println("\t\tPlease enter a valid score.");
                    System.out.print("\t\tTEST SCORE #" + (x+1) + ": ");
                    test = Double.parseDouble(keyboard.nextLine());
                }
                allTests.add(test);
            }
            //this function will take the average
            double testAverage = round(findAverage(allTests), 2); //test grade, to 2 decimals

            //determines how many assignment scores the loop wil take in
            System.out.println("Let's add assignment scores for " + tempFirstName + ".");
            System.out.println("How many assignments do you plan on adding?");
            System.out.print("\tNUMBER OF ASSIGNMENTS: ");
            int numberOfAssign = Integer.parseInt(keyboard.nextLine());
            ArrayList allAssign = new ArrayList();
            //this for loop adds all the assignment grades together
            for (int x = 0; x < numberOfAssign; x++) {
                //user enters assignment scores
                System.out.print("\t\tASSIGNMENT SCORE #" + (x+1) + ": ");
                double assign = Double.parseDouble(keyboard.nextLine());
                //error message for if the score is not between 0 and 100
                while (assign < 0 || assign > 100) { 
                    System.out.println("\t\tPlease enter a valid score.");
                    System.out.print("\t\tASSIGNMENT SCORE #" + (x+1) + ": ");
                    assign = Double.parseDouble(keyboard.nextLine());
                }
                allAssign.add(assign);
            }
            //this function will take the average
            double assignAverage = round(findAverage(allAssign), 2); //assignment grade, to 2 decimals
            
            //this function will calculate the student's overall grade based on the weights given earlier
            double tempAverage = round(findStudentAverage(testAverage, assignAverage, testWeight, assignWeight), 2); //the total grade, to 2 decimals

            //this function finds the letter grade based on the overall grade (calculated above)
            String tempGrade = findLetter(tempAverage);
            
            Student newStudent = new Student(tempFirstName, tempLastName, tempAverage, tempGrade, testAverage, assignAverage, allTests, allAssign); //creating a Student
            gradeBook.AddStudent(newStudent); //adding a student to gradeBook (StudentGradeBook class) defined earlier
        }
        System.out.println("\nYOUR GRADEBOOK FOR " + className + ":");
        gradeBook.printSummaries(); //this function prints the students with their overall & letter grades
        System.out.println("\nDONE! Congratulations, you've finished building your class (" + className + ")!");
        
        boolean viewInfo = true;
        while (viewInfo == true) {
            System.out.println("\n\nHere are some options for accessing your students' stats.\nIf you do not want to view your class' stats and would like to exit, type DONE.");
            System.out.println("\t(a) Look at the students' test and assignment scores.\n\t(b) Compare students by class statistics.");
            System.out.print("SELECT: ");
            String select = keyboard.nextLine();
            
            //error message --> forces the user to select again
            while (!select.equals("a") && !select.equals("b") && !select.equals("DONE")) {
                System.out.println("Sorry, didn't catch that! Please select again.");
                System.out.print("SELECT: ");
                select = keyboard.nextLine();
            }
            //allows the user to look at all the scores entered for each student
            if (select.equals("a")) {
                System.out.println("\n\nHere are your students' scores!");
                gradeBook.printScores();
                System.out.println("\nTaking you back to the main screen now.");
            }
            //allows the user to see statistics for the entire class
            if (select.equals("b")) {
                System.out.println("\n\nHere are some statistics regarding your class, " + className + ":");
                gradeBook.printMean();
                System.out.print("The population standard deviation for test scores in the class is ");
                gradeBook.printStandardDeviationTests();
                System.out.print("The population standard deviation for assignment scores in the class is ");
                gradeBook.printStandardDeviationAssign();
                System.out.println("\nTaking you back to the main screen now.");
            }
            //allows the user to exit the loop, ends the class building
            if (select.equals("DONE")) {
                viewInfo = false;
            }
        }
        //final screen/message!
        System.out.println("\n\nAnd you're done! Thank you for building a class with GradeBook!");
        System.out.println("\nHave a great day! :)");
    }
    
    //function used for rounding decimals
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    //function used for finding the average of an ArrayList
    public static double findAverage(ArrayList allWork) {
        double allWorkTogether = 0;
        for (int i = 0; i < allWork.size(); i++){
            allWorkTogether += (double)allWork.get(i);
        }
        return allWorkTogether / allWork.size();
    }
    
    //function used for finding the student's overall grade
    public static double findStudentAverage(double testAvg, double assignAvg, double testWeight, double assignWeight) {
        double tests = testAvg * (testWeight / 100);
        double assignments = assignAvg * (assignWeight / 100);
        return (tests + assignments);
    }
    
    //function used for finding the student's letter grade (nested if statements)
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
