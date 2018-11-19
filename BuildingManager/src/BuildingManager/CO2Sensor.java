/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildingManager;

/**
 *
 * @author AleksanderSTUD
 */
public class CO2Sensor extends Sensor {

    private double value = Math.random() * 100;
    private String unit = "ppm^2";
    
    public CO2Sensor(String name, String location) {
        super(name, location);
    }
    
    @Override
    public String toString() {
        return value + " " + unit;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }
}
