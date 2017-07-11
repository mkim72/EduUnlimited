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
public class Car {

    String make, model; 
    int year;
    boolean isOn;
    String nickname, color;
    int yearsOwned;
    double miles;

    public Car(String newMake, String newModel, int newYear, String newNickname, String newColor, int newYearsOwned, double newMiles) {
        make = newMake;
        model = newModel;
        year = newYear;
        isOn = false;
        nickname = newNickname;
        color = newColor;
        yearsOwned = newYearsOwned;
        miles = newMiles;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("The car is now on!");
    }

    public void turnOff() {
        if (isOn == true) {
            isOn = false;
            System.out.println("The car is now off!");
        } else {
            System.out.println("The car is already off!");
        }
    }
    
    //THE ADDITIONS 
    
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearsOwned() {
        return yearsOwned;
    }

    public void setYearsOwned(int yearsOwned) {
        this.yearsOwned = yearsOwned;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
