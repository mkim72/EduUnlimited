/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentgradebook;

/**
 *
 * @author Education Unlimited
 */
import java.util.ArrayList;

public class Student {
    // naming objects
    String firstName, lastName, letterGrade;
    double testScoreAvg, assignScoreAvg, totalAverage; //totalAverage = 89.5%
    ArrayList testScores, assignScores;
    
    public Student (String newFirstName, String newLastName, double newTotalAverage, String newLetterGrade, double newTestScoreAvg, double newAssignScoreAvg, ArrayList newTestScores, ArrayList newAssignScores) {
        firstName = newFirstName;
        lastName = newLastName;
        totalAverage = newTotalAverage;
        letterGrade = newLetterGrade;
        testScoreAvg = newTestScoreAvg;
        assignScoreAvg = newAssignScoreAvg;
        testScores = newTestScores;
        assignScores = newAssignScores;
    }
    
    // getting/setting objects
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

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public double getTestScoreAvg() {
        return testScoreAvg;
    }

    public void setTestScoreAvg(double testScoreAvg) {
        this.testScoreAvg = testScoreAvg;
    }

    public double getTotalAverage() {
        return totalAverage;
    }

    public void setTotalAverage(double totalAverage) {
        this.totalAverage = totalAverage;
    }
    
    public double getAssignScoreAvg() {
        return assignScoreAvg;
    }

    public void setAssignScoreAvg(double assignScoreAvg) {
        this.assignScoreAvg = assignScoreAvg;
    }
    
    public ArrayList getTestScores() {
        return testScores;
    }

    public void setTestScores(ArrayList testScores) {
        this.testScores = testScores;
    }

    public ArrayList getAssignScores() {
        return assignScores;
    }

    public void setAssignScores(ArrayList assignScores) {
        this.assignScores = assignScores;
    }
}
