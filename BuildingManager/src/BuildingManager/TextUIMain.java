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
public class TextUIMain {

    public static void main(String[] args) {
        IExtendedBuildingManagementSystem manager = new Manager();
        Building b1 = new Building("44", "Ø1-100-3");
        Building b2 = new Building("45", "Ø2-100-3");
        System.out.println("Buldings added .... \n");
        manager.addBuilding(b1);
        manager.addBuilding(b2);

        Sensor s1 = new TemperatureSensor("Temperature Sensor", "44.1");
        Sensor s2 = new CO2Sensor("Co2 Sensor", "44.1");
        Actuator a1 = new DetailActuator("Radiator", "44.1");
        
        Sensor s3 = new TemperatureSensor("Temperature Sensor", "45.1");
        Sensor s4 = new CO2Sensor("Co2 Sensor", "45.1");
        Actuator a2 = new DetailActuator("Radiator", "45.1");
        
        b1.addSensor(s1);
        b1.addSensor(s2);
        b1.addActuator(a1);
        
        b2.addSensor(s3);
        b2.addSensor(s4);
        b2.addActuator(a2);
        
        
        //System.out.println(manager.getBuilding(b1.getId()).getActuator(a1.getId()).toString());
        //System.out.println(manager.getBuilding(b1.getId()).getSensor(s1.getId()).toString());

        System.out.println(manager.toString());

        manager.removeBuilding(b2.getId());
        System.out.println("Removing building with UUID " + b2.getId() + " .... \n");
        System.out.println(manager.toString());

    }
}
