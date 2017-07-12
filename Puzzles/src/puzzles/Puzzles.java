/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzles;

/**
 *
 * @author Education Unlimited
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Puzzles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String FILENAME = "puzzle.txt";
	try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            int lineNumber = 0;

            while (currentLine != null) {
                lineNumber++;
                if (lineNumber%3==0) {
                    System.out.println(currentLine);
                }
                currentLine = reader.readLine();
            }
	}
        catch (IOException e) {
            e.printStackTrace();
	}
    }   
}
