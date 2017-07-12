/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathio2;

/**
 *
 * @author Education Unlimited
 */
import java.io.*;

public class MathIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String FILENAME = "numbers.txt";

        //Part 1
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            //here is where you should put your numbers
            String line = "0.01 \n0.02 \n0.03 \n0.04 \n0.05";

            //here is where you should write your numbers to the file
            writer.write(line);
            System.out.println("Done\n");
        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }

        //Part 2
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {

            String currentLine = reader.readLine();
            double sum = 0.0;

            while (currentLine != null) {
                System.out.println("number: " + currentLine);
                double number = Double.parseDouble(currentLine);
                sum = sum + number;
                System.out.println("sum: " + sum + "\n");
                currentLine = reader.readLine(); // sets the while loop to read the next line
            }
        } 
        
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
