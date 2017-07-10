/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathoperations;

/**
 *
 * @author Education Unlimited
 */
public class MathOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p,q,r,s,t,u;
        double a,b,c;
        String first, second, together;
 
        p = 8;
        q = 25;
        System.out.println( "p is " + p + ", q is " + q );
 
        r = p + q;
        System.out.println( "p+q is " + r );
        s = p - q;
        System.out.println( "p-q is " + s );
        t = p+q*3;
        System.out.println( "p+q*3 is " + t );
        u = q / 2;
        System.out.println( "q/2 is " + u );
        
        a = 1.1;
        System.out.println( "a is " + a );
        b = a*a;
        System.out.println( "a*a is " + b );
        c = b / 2;
        System.out.println( "b/2 is " + c );
        System.out.println();

        first = "peanut butter";
        second = "jelly";
        together = first + " and " + second;
        System.out.println( together );
        System.out.println();
        
        //my additions
        int x, y, z;
        double n, m;
        x = (p+q)*2; //66
        System.out.println("(p+q)*2 is " + x);
        y = (p/2)*(q-5); //80
        System.out.println("(p/2)*(q-5) is " + y);
        z = (p+q-3)/2; //15
        System.out.println("(p+q-3)/2 is " + z);
        n = a*2-b;
        System.out.println("a*2-b is " + n);
        m = (b/a)*3;
        System.out.println("(b/a)*3 is " + m);
        
        p--; //p=p-1
        System.out.println("p-- is " + p);
        p++;
        System.out.println("p++ is " + p);
        p+=7;
        System.out.println("p+=7 is " + p);
        p-=10;
        System.out.println("p-=10 is " + p);
    }
    
}
