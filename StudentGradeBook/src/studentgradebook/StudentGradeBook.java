/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradebook;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
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
    
    //print the basic ending summary of scores
    public void printSummaries() { //function for printing basic student info
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println(gradeBook[i].getLastName() + ", " + gradeBook[i].getFirstName() + ".\t" + gradeBook[i].getTotalAverage() + "% (" + gradeBook[i].getLetterGrade() + ").");
            System.out.println("Test average is " + gradeBook[i].getTestScoreAvg() + "%. Assignment average is " + gradeBook[i].getAssignScoreAvg() + "%.\n");
            //^^ from the getter/setter functions created in the student.java
        }
    }
    
    //print individual scores in a list, called in printScores
    public void printWorkScores(ArrayList workScores) {
        for (int i = 0; i < workScores.size(); i++) {
            if (i != workScores.size()-1) {
                System.out.print(workScores.get(i) + "%, ");
            }
            if (i == workScores.size()-1) {
                System.out.print(workScores.get(i) + "%");
            }
        }
    }
    
    //print all score information, calls upon printWorkScores
    public void printScores() {
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("\n" + gradeBook[i].getFirstName() + " " + gradeBook[i].getLastName() + "'s test scores: ");
            printWorkScores(gradeBook[i].getTestScores());
            System.out.println("");
            System.out.print(gradeBook[i].getFirstName() + " " + gradeBook[i].getLastName() + "'s assignment scores: ");
            printWorkScores(gradeBook[i].getAssignScores());
            System.out.println("");
            System.out.println("Test average: " + gradeBook[i].getTestScoreAvg() + "%. Assignment average: " + gradeBook[i].getAssignScoreAvg() + "%.\n");
        }
    }
    
    //print class stats: mean
    public void printMean() {
        //mean value for tests
        double testScoresAddedTogether = 0;
        for (int x = 0; x < numberOfStudents; x++) {
            testScoresAddedTogether += gradeBook[x].getTestScoreAvg();
        }
        double printTests = round((testScoresAddedTogether / numberOfStudents), 2);
        System.out.println("The mean test score for the class is " + printTests + "%.");
        //mean value for assignments
        double assignScoresAddedTogether = 0;
        for (int x = 0; x < numberOfStudents; x++) {
            assignScoresAddedTogether += gradeBook[x].getAssignScoreAvg();
        }
        double printAssignments = round((assignScoresAddedTogether / numberOfStudents), 2);
        System.out.println("The mean assignment score for the class is " + printAssignments + "%.");
    }
    
    //print class stats: standard deviation
    public void printStandardDeviationTests() {
        //pulled from the printMean function
        double testScoresAddedTogether = 0;
        for (int x = 0; x < numberOfStudents; x++) {
            testScoresAddedTogether += gradeBook[x].getTestScoreAvg();
        }
        double testsMean = round((testScoresAddedTogether / numberOfStudents), 2);
        
        //make a temp array to hold ALL of the test scores for the class
        ArrayList tempDeviations = new ArrayList();
        for (int z = 0; z < numberOfStudents; z++) {
            //make a temporary array to make code more readable, essentially holds individual scores and adds to the total/final array
            ArrayList arrayTests = new ArrayList();
            arrayTests = gradeBook[z].getTestScores();
            for (int x = 0; x < arrayTests.size(); x++) {
                double addToDeviations = (double)arrayTests.get(x);
                tempDeviations.add(addToDeviations);
            }
        }
        //make another array to hold the (values-mean)^2
        ArrayList deviations = new ArrayList();
        for (int i = 0; i < tempDeviations.size(); i++) {
            double temp = (double)tempDeviations.get(i);
            temp = (temp - testsMean)*(temp - testsMean); //(value-mean)^2 --> solving for standard deviation
            deviations.add(temp);
        }
        //add all the values of the array together!
        double sum = 0;
        for (int n = 0; n < deviations.size(); n++) {
            sum += (double)(deviations.get(n));
        }
        sum = sum / deviations.size(); //divide by the amount of values to get the mean
        
        double standardDeviation = round(Math.sqrt(sum), 2); //square the mean
        
        System.out.println(standardDeviation + "."); //print with period on the end
    }
    
    public void printStandardDeviationAssign() {
        //pulled from the printMean function
        double assignScoresAddedTogether = 0;
        for (int x = 0; x < numberOfStudents; x++) {
            assignScoresAddedTogether += gradeBook[x].getAssignScoreAvg();
        }
        double assignMean = round((assignScoresAddedTogether / numberOfStudents), 2);
        
        //make a temp array to hold ALL of the test scores for the class
        ArrayList tempDeviations = new ArrayList();
        for (int z = 0; z < numberOfStudents; z++) {
            //make a temporary array to make code more readable, essentially holds individual scores and adds to the total/final array
            ArrayList arrayAssign = new ArrayList();
            arrayAssign = gradeBook[z].getTestScores();
            //for each of the students, add their scores to the total/final array
            for (int x = 0; x < arrayAssign.size(); x++) {
                double addToDeviations = (double)arrayAssign.get(x);
                tempDeviations.add(addToDeviations);
            }
        }
        //make another array to hold the (values-mean)^2
        ArrayList deviations = new ArrayList();
        for (int i = 0; i < tempDeviations.size(); i++) {
            double temp = (double)tempDeviations.get(i);
            temp = (temp - assignMean)*(temp - assignMean); //(value-mean)^2 --> solving for standard deviation
            deviations.add(temp);
        }
        //add all the values of the array together!
        double sum = 0;
        for (int n = 0; n < deviations.size(); n++) {
            sum += (double)(deviations.get(n));
        }
        sum = sum / deviations.size(); //divide by the amount of values for the mean
        
        double standardDeviation = round(Math.sqrt(sum), 2); //square the mean
        
        System.out.println(standardDeviation + "."); //print the standard deviation with a period
    }
    
    //FOR ROUNDING DECIMALS
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
