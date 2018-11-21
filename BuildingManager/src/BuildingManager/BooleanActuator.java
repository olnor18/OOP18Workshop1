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
public class BooleanActuator extends Actuator {

    private boolean value;
    private boolean desiredValue;

    public BooleanActuator(String name, String location) {
        super(name, location);
    }

    @Override
    public String toString() {
        return value + "";
    }

    public boolean isValue() {
        return value;
    }

    public boolean isDesiredValue() {
        return desiredValue;
    }

    public void setDesiredValue(boolean desiredValue) {
        this.desiredValue = desiredValue;
    }

}
