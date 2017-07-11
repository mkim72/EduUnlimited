/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author Education Unlimited
 */
public class Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this part will test the functions
        System.out.println("(0,-3) to (-1,-7) has slope " + slope(0,-3,-1,-7) + ".");
        System.out.println("(2,8) to (4,-4) has slope " + slope(2,8,4,-4) + ".");

        System.out.println("(0,-3) to (-1,-7) has distance " + distance(0,-3,-1,-7) + ".");
        System.out.println("(2,8) to (4,-4) has distance " + distance(2,8,4,-4) + ".");
        
        formula(-6, -19, 0, 5);
        formula(0, 7, 4, 7);
    }
    public static double slope(int x1, int y1, int x2, int y2)
    {
        return (y2-y1)/(x2-x1);
    }
        
    public static double distance(int x1, int y1, int x2, int y2)
    {
        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    }
    
    public static void formula(int x1, int y1, int x2, int y2)
    {
        //print y=mx+b
        double slope = slope(x1, y1, x2, y2);
        double yInt = y1 - slope * x1;
        System.out.println("In slope-intercept form, the formula for the line is y=" + slope + "x+" + yInt + ".");
    }   
}