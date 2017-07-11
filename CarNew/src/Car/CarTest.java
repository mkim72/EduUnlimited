/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Education Unlimited
 */
public class CarTest {
    public static void main(String[] args) {
        String make1 = "Toyota";
        String model1 = "Camry";
        int year1 = 2332;
        String nickname1 = "Enterprise", color1 = "white";
        int yearsOwned1 = 1;
        double miles1 = 1701.1;

        Car car1 = new Car(make1, model1, year1, nickname1, color1, yearsOwned1, miles1);

        System.out.println("Car 1: " + color1 + " " + car1.getMake() + " " + car1.getModel() + " from " + car1.getYear() + ", nicknamed " + nickname1 + ".");
        System.out.println("Owned for " + yearsOwned1 + " year(s), with " + miles1 + " miles.");
       
        car1.turnOn();
        car1.turnOff();
        car1.turnOff();
    }
}