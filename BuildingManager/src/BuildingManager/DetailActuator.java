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
public class DetailActuator extends Actuator {

    private double value;
    private double desiredValue;

    public DetailActuator(String name, String location) {
        super(name, location);
        this.value = Math.random();
    }

    @Override
    public String toString() {
        return this.value + "";
    }

    public double getValue() {
        return value;
    }

    public double getDesiredValue() {
        return desiredValue;
    }

    public void setDesiredValue(double desiredValue) {
        this.desiredValue = desiredValue;
    }

}
