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
public class TemperatureSensor extends Sensor {

    private double value = Math.random() * 100 - Math.random() * 100;
    private String unit = "\u00B0" + "C";

    public TemperatureSensor(String name, String location) {
        super(name, location);
    }

    @Override
    public String toString() {
        return this.value + " " + this.unit;
    }

    public double getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }
}
