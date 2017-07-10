/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booleans;

/**
 *
 * @author Education Unlimited
 */
public class Booleans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x,y;
        boolean a,b,c,d,e,f;
        x=3;
        y=4;
        a= x==y;
        b= x!=y;
        c= x>y;
        d= x<y;
        e= x>=y;
        f= x<=y;
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        System.out.println();
        
        x=15;
        y=87;
        a= x==y;  // == means equal to / prediction: false
        b= x!=y;  //!= means not equal to / prediction: true
        c= x>y;   // > means greater than / prediction: false
        d= x<y;   // < means less than / prediction: true
        e= x>=y;  // >= means greater than or equal to / prediction: false
        f= x<=y;  // <= means less than or equal to / prediction: true
        System.out.println(x + " is equal to " + y + ": " + a);
        System.out.println(x + " is not equal to " + y + ": " + b);
        System.out.println(x + " is greater than " + y + ": " + c);
        System.out.println(x + " is less than " + y + ": " + d);
        System.out.println(x + " is greater than or equal to " + y + ": " + e);
        System.out.println(x + " is less than or equal to " + y + ": " + f);
        System.out.println();
        
        String s1 = "Good morning.";
        String s2 = "Hi there!";
        String s3 = "Howdy, partner!";
        boolean equalCompare = s1.equals(s2);
        System.out.println("'Good morning.' is the same as 'Hi there!': " + equalCompare);
        double compareTo1 = s2.compareTo(s3);
        double compareTo2 = s3.compareTo(s1);
        System.out.println("Comparing 'Hi there!' to 'Howdy, partner! gives " + compareTo1);
        System.out.println("Comparing 'Howdy, partner!' to 'Good morning.' gives " + compareTo2);
        System.out.println();
        
        boolean b1=true, b2=false;
        System.out.println("True and true: " + (b1 && b1));
        System.out.println("False and false: " + (b2 && b2));
        System.out.println("False and true: " + (b2 && b1));
        System.out.println("False or true: " + (b2 || b1));
        System.out.println("False or false: " + (b2 || b2));
        System.out.println("True or true: " + (b1 || b1));
    }    
    
}
