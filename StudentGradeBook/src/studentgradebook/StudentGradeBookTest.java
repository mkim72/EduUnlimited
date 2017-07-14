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
        
        boolean createClass = true;
        
        System.out.println("Welcome to GradeBook, a useful electronic tool for storing students' grades!");
        
        while (createClass == true) {
            System.out.println("\n\nSTEP 1: CREATE A CLASS");
            System.out.println("First, let's name your class. (Ex: Biology, Period 1)");
            System.out.print("NAME OF CLASS: ");
            String className = keyboard.nextLine();
            System.out.println("\nThank you! You may now start adding students to " + className + ".");
            
            System.out.println("\n\nSTEP 2: ADD STUDENTS");
            System.out.println("How many students are in your class? You can add up to 50 per class.");
            System.out.print("NUMBER OF STUDENTS: ");
            int inClass = Integer.parseInt(keyboard.nextLine());
            System.out.println("\nThank you! Let's start adding students.");
            
            StudentGradeBook gradeBook = new StudentGradeBook(); //creates a new StudentGradeBook class called "gradeBook"
            
            for (int i = 0; i < inClass; i++) {
                //STUDENT INDENTIFICATION
                System.out.println("\nSTUDENT #" + (i+1));
                System.out.print("FIRST NAME: ");
                String tempFirstName = keyboard.nextLine();
                System.out.print("LAST NAME: ");
                String tempLastName = keyboard.nextLine();
                
                //ADD TEST SCORES, FIND AVERAGE
                System.out.println("\nLet's add test scores first.");
                boolean addTests = true;
                ArrayList allTests = new ArrayList();
                while (addTests == true) {
                    System.out.print("ADD A TEST SCORE: ");
                    double test = Double.parseDouble(keyboard.nextLine());
                    allTests.add(test);
                    System.out.print("CONTINUE? ");
                    String response = keyboard.nextLine();
                    if (response.equals("no")) {
                        addTests = false;
                    }
                }
                double testAverage = round(findAverage(allTests), 2);
                
                //ADD ASSIGNMENT SCORES, FIND AVERAGE
                System.out.println("Awesome! Now, let's add assignment scores.");
                boolean addAssign = true;
                ArrayList allAssign = new ArrayList();
                while (addAssign == true) {
                    System.out.print("ADD A TEST SCORE: ");
                    double assign = Double.parseDouble(keyboard.nextLine());
                    allAssign.add(assign);
                    System.out.print("CONTINUE? ");
                    String response = keyboard.nextLine();
                    if (response.equals("no")) {
                        addAssign = false;
                    }
                }
                double assignAverage = round(findAverage(allAssign), 2);
                
                System.out.println("\nHow much weight do tests carry? (Ex: If 50%, enter 50.)");
                System.out.print("TESTS: ");
                double testWeight = Double.parseDouble(keyboard.nextLine());
                
                System.out.println("\nHow much weight do assignments carry? (Ex: If 50%, enter 50.)");
                System.out.print("ASSIGNMENTS: ");
                double assignWeight = Double.parseDouble(keyboard.nextLine());
                
                double tempAverage = findStudentAverage(testAverage, assignAverage, testWeight, assignWeight);
                
                String tempGrade = findLetter(tempAverage);
                Student newStudent = new Student(tempFirstName, tempLastName, tempAverage, tempGrade, testAverage, assignAverage);
                gradeBook.AddStudent(newStudent);
            }
            System.out.println("\n");
            gradeBook.printSummaries(); //print students and grades!
            System.out.println("\nDONE!");
            System.out.print("\nWould you like to add another class? ");
            String continueYesOrNo = keyboard.nextLine();
            if (continueYesOrNo.equals("no")) {
                createClass = false;
            }
        }
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
