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
public class TestClass {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Building b1 = new Building("Building 1", "Location 1");
        Building b2 = new Building("Building 2", "Location 2"); 
        manager.addBuilding(b1);
        manager.addBuilding(b2);
        
        Sensor s1 = new TemperatureSensor("Temp", "Room1");
        manager.getBuilding(b1.getId()).addSensor(s1);
        
        Actuator a1 = new DetailActuator("Radiator", "Room1");
        manager.getBuilding(b1.getId()).addActuator(a1);
        
        System.out.println(manager.getBuilding(b1.getId()).getActuator(a1.getId()).toString());
        System.out.println(manager.getBuilding(b1.getId()).getSensor(s1.getId()).toString());
        System.out.println(manager.toString());
        System.out.println(manager.getBuildings().size());
        manager.removeBuilding(b2.getId());
        System.out.println(manager.getBuildings().size());
        System.out.println(manager.toString());
        
    }
}
