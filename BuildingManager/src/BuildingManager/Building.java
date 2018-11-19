/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildingManager;

import java.util.HashMap;
import java.util.UUID;


/**
 *
 * @author AleksanderSTUD
 */
public class Building {

    private UUID id;
    private String name;
    private String location;
    private HashMap<UUID, Sensor> sensors  = new HashMap<>();
    private HashMap<UUID, Actuator> actuators  = new HashMap<>();
    
    public Building(String name, String location){
        this.name = name;
        this.location = location;
        id = UUID.randomUUID();
        
    }

    public void addSensor(Sensor s){
        sensors.put(s.getId(), s);
    }
    
    public void removeSensor(UUID id) {
        sensors.remove(id);
    }
    
    public Sensor getSensor(UUID id){
        return sensors.get(id);
    }
    
    public void addActuator(Actuator a){
        actuators.put(a.getId(), a);
    }
    
    public void removeActuator(UUID id){
        actuators.remove(id);
    }
    
    public Actuator getActuator(UUID id){
        return actuators.get(id);
    }
    
    @Override
    public String toString() {
        return "";
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public HashMap<UUID, Sensor> getSensors() {
        HashMap<UUID, Sensor> clonedSensor = new HashMap(sensors);
        return clonedSensor;
    }

    public HashMap<UUID, Actuator> getActuators() {
        HashMap<UUID, Actuator> clonedActuator = new HashMap(actuators);
        return clonedActuator;
    }

}
