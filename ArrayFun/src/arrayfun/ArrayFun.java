/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayfun;

/**
 *
 * @author Education Unlimited
 */
public class ArrayFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] array1 = new int[10];
        array1[0] = 1;
        array1[1] = 3;
        array1[2] = 5;
        array1[3] = 7;
        array1[4] = 9;
        array1[5] = 11;
        array1[6] = 13;
        array1[7] = 15;
        array1[8] = 17;
        array1[9] = 19;
        
        System.out.println("Index 0 of array1 is " + array1[0] + ".");
        System.out.println("Index 1 of array1 is " + array1[1] + ".");
        System.out.println("Index 2 of array1 is " + array1[2] + ".");
        System.out.println("Index 3 of array1 is " + array1[3] + ".");
        System.out.println("Index 4 of array1 is " + array1[4] + ".");
        System.out.println("Index 5 of array1 is " + array1[5] + ".");
        System.out.println("Index 6 of array1 is " + array1[6] + ".");
        System.out.println("Index 7 of array1 is " + array1[7] + ".");
        System.out.println("Index 8 of array1 is " + array1[8] + ".");
        System.out.println("Index 9 of array1 is " + array1[9] + ".\n");
        
        double[] array2 = new double[10];
        int index2 = 0;
        while (index2 < array2.length) {
            array2[index2] = 1.25;
            System.out.println("Index " + index2 + " of array2 is " + array2[index2] + ".");
            index2++;
        }
        System.out.print("\n");
        
        int[] array3 = new int[1000];
        int index3 = 0;
        while (index3 < array3.length) {
            array3[index3] = (int)(Math.random() * 1000 + 1);
            if (array3[index3] < 10) {
                System.out.print(array3[index3] + "   ");
            }
            if (array3[index3] >= 10 && array3[index3] < 100) {
                System.out.print(array3[index3] + "  ");
            }
            if (array3[index3] >= 100) {
                System.out.print(array3[index3] + " ");
            }
            if ((index3 + 1) == (index3 + 1) / 20 * 20) {
                System.out.print("\n");
            }
            index3++;
        }
    }
    
}
