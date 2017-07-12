/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Car.Car;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Education Unlimited
 */
public class CarTester {
    double e = 0.000000001; //error margin, necessary for doubles
    Car carEx = new Car("Toyota", "Highlander", 2016, "Snoopy", "white", 1, 2230.75); //make, model, year, name, color, years owned, miles
    
    @Test
    public void makeGetterTest() {
        assertEquals(carEx.getMake(), "Toyota");
    }
    
    @Test
    public void makeSetterTest() {
        carEx.setMake("Tesla");
    }
    
    @Test
    public void modelGetterTest() {
        assertEquals(carEx.getModel(), "Highlander");
    }
    
    @Test
    public void modelSetterTest() {
        carEx.setModel("TeslaModel");
    }
    
    @Test
    public void yearGetterTest() {
        assertEquals(carEx.getYear(), 2016);
    }
    
    @Test
    public void yearSetterTest() {
        carEx.setYear(2);
    }
    
    @Test
    public void nicknameGetterTest() {
        assertEquals(carEx.getNickname(), "Snoopy");
    }
    
    
    
    public CarTester() {
    }
    
}
