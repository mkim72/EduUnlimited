/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hatshop;

/**
 *
 * @author Education Unlimited
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
import java.util.ArrayList;
public class HatShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        ArrayList cart = new ArrayList();
        String selection = "";
        int numberOfHats = 5;
        
        while (!selection.equals("d")) {
            System.out.println("Welcome to Hattie's Hat Shop, where we fulfill all of your hat-y needs!");
            System.out.println("Here, you can: \n\t(a) Design and order a hat, \n\t(b) See your cart, \n\t(c) Remove hats from your order, or \n\t(d) Check out!");
            System.out.println("\nWhat would you like to do right now? Select a, b, c, or d.");
            System.out.print("SELECT: ");
            selection = keyboard.nextLine();
            
            //SELECT: ORDER A HAT
            if (selection.equals("a")) {
                boolean orderAgain = true;
                if (numberOfHats == 0) {
                    System.out.println("\nSorry! You already have 5 hats. Please proceed to check out, or remove a hat to order another.\n");
                }
                while (orderAgain == true && numberOfHats != 0) {
                    //WELCOME SCREEN
                    System.out.println("\nYOU'VE CHOSEN TO: DESIGN AND ORDER A HAT");
                    System.out.println("We're so glad you've decided to order a hat with us! You can order up to 5 today at Hattie's Hat Shop.");
                    System.out.println("You can order " + numberOfHats + " more hats.");
                    System.out.println("Please specify what you'd like in your hat.");
                    //RESET VARIABLES
                    String color = "", style = "";
                    double price = 0;
                    //CHOOSE A STYLE
                    System.out.println("\nPlease choose a style for your hat: \n\tBowler ----- $49.99 \n\tFedora ----- $49.99 \n\tTop Hat ---- $45.99");
                    System.out.print("SELECT: ");
                    style = keyboard.nextLine();
                    while (!style.equals("Bowler") && !style.equals("Fedora") && !style.equals("Top Hat")) {
                        System.out.println("\nSorry, we don't carry that. Please make your selection.");
                        System.out.print("SELECT: ");
                        style = keyboard.nextLine();
                    }
                    if (style.equals("Bowler")) {
                        price += 44.99;
                    }
                    else if (style.equals("Fedora")) {
                        price += 49.99;
                    }
                    else if (style.equals("Top Hat")) {
                        price += 45.99;
                    }
                    //CHOOSE A COLOR
                    System.out.println("\nPlease choose a color for your hat: \n\tClassic Black ------- $34.99 \n\tBurnished Brown ----- $27.99 \n\tRoyal Blue ---------- $37.50 \n\tEmerald Green ------- $36.50");
                    System.out.print("SELECT: ");
                    color = keyboard.nextLine();
                    while (!color.equals("Classic Black") && !color.equals("Burnished Brown") && !color.equals("Royal Blue") && !color.equals("Emerald Green")) {
                        System.out.println("\nSorry, we don't carry that. Please make your selection.");
                        System.out.print("SELECT: ");
                        color = keyboard.nextLine();
                    }
                    if (color.equals("Classic Black")) {
                        price += 34.99;
                        price = round(price, 2);
                    }
                    else if (color.equals("Burnished Brown")) {
                        price += 27.99;
                        price = round(price, 2);
                    }
                    else if (color.equals("Royal Blue")) {
                        price += 37.50;
                        price = round(price, 2);
                    }
                    else if (color.equals("Emerald Green")) {
                        price += 36.50;
                        price = round(price, 2);
                    }
                    //THANK YOU, END
                    System.out.println("\nThanks for choosing to design a hat with us! Please verify your order.");
                    System.out.println(style + ", " + color + ": $" + price);
                    System.out.println("\nIs this correct? (yes or no)");
                    System.out.print("SELECT: ");
                    String verify = keyboard.nextLine();

                    if (verify.equals("yes")) {
                        System.out.println("\nThank you! We'll return you to the home screen now.\n");
                        addHatToCart(cart, style, color, price);
                        numberOfHats--;
                        orderAgain = false;
                    }
                    else if (verify.equals("no")) {
                        System.out.println("\nSorry about that! Let's re-order your hat.\n");
                        orderAgain = true;
                    }
                }
            }
            //SELECT: SEE CART
            else if (selection.equals("b")) {
                seeCart(cart);
                System.out.println("\nWe'll return you to the homescreen now.\n");
            }
            else if (selection.equals("c")) {
                /*if (numberOfHats == 5) {
                    System.out.print
                }*/
                System.out.println("\nWhich hat order would you like to remove? Select its number.");
                seeCart(cart);
                System.out.println("\nREMOVE: ");
                int remove = Integer.parseInt(keyboard.nextLine());
                removeHatFromCart(cart, remove, numberOfHats);
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
    
    public static void addHatToCart(ArrayList cart, String style, String color, double price) {
        cart.add(style);
        cart.add(color);
        cart.add(price);
    }
    
    public static void seeCart(ArrayList cart) {
        System.out.println("\nHere's your order!");
        double totalPrice = 0;
        int number = 0;
        for (int i = 0; i < cart.size(); i++) {
            if ((i+1)%3 == 0) {
                number++;
                System.out.println("(" + number + ") " + cart.get(i-2) + ", " + cart.get(i-1) + ": $" + cart.get(i));
                totalPrice += (double)cart.get(i);
            }
        }
        System.out.println("Your total cost comes out to $" + totalPrice + ".");
    }
    
    public static void removeHatFromCart(ArrayList cart, int remove, int numberOfHats) {
        //remove is i+1
        cart.remove(remove);
        cart.remove(remove);
        cart.remove(remove-1);
        numberOfHats++;
    }
}
