package BuildingManager;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AleksanderSTUD
 */
public class Manager implements IExtendedBuildingManagementSystem{
    private HashMap<UUID, Building> buildings = new HashMap<>();
    
    @Override
    public HashMap<UUID, Building> getBuildings() {
        HashMap<UUID, Building> clonedBuildings = new HashMap(buildings);
        return clonedBuildings;
    }

    @Override
    public void addBuilding(Building b) {
        buildings.put(b.getId(), b);
    }
    
    @Override
    public void removeBuilding(UUID id) {
        buildings.remove(id);
    }
    
    @Override
    public Building getBuilding(UUID id) {
        return buildings.get(id);
    }
    
    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("The manager has the following buildings:\n");
       for (Map.Entry<UUID, Building> entry : buildings.entrySet())
       {
           sb.append("----------------------------------------\n").append(entry.getValue().toString()).append("\n");
       }
       sb.append("----------------------------------------\n");
       return sb.toString();
    }

    @Override
    public Map<UUID, String> getBuildingInformation() {
        HashMap<UUID, String> output = new HashMap<>();
        for (Map.Entry<UUID, Building> entry : buildings.entrySet()) {
            UUID key = entry.getKey();
            String descriptionString = entry.getValue().toString();
            output.put(key, descriptionString);
            
        }
        return output;
    }

    @Override
    public Map<UUID, String> getSensorInformation(UUID buildingId) {
        HashMap<UUID, String> output = new HashMap<>();
        for (Map.Entry<UUID, Sensor> entry : buildings.get(buildingId).getSensors().entrySet()) {
            UUID key = entry.getKey();
            String descriptionString = entry.getValue().toString();
            output.put(key, descriptionString);
        }
        return output;
    }

    @Override
    public Map<UUID, String> getActuatorInformation(UUID buildingId) {
        HashMap<UUID, String> output = new HashMap<>();
        for (Map.Entry<UUID, Actuator> entry : buildings.get(buildingId).getActuators().entrySet()) {
            UUID key = entry.getKey();
            String descriptionString = entry.getValue().toString();
            output.put(key, descriptionString);
        }
        return output;
    }

    @Override
    public UUID addTemperatureSensor(UUID buildingId, String name) {
        return buildings.get(buildingId).addSensor(new TemperatureSensor(name, "unknown"));
    }

    @Override
    public UUID addCo2Sensor(UUID buildingId, String name) {
        return buildings.get(buildingId).addSensor(new CO2Sensor(name, "Unknown"));
    }

    @Override
    public void removeSensor(UUID buildingId, UUID sensorId) {
        buildings.get(buildingId).removeSensor(sensorId);
    }

    @Override
    public UUID addVentilationActuator(UUID buildingId, String name) {
       return buildings.get(buildingId).addActuator(new DetailActuator(name, "Unknown"));
    }

    @Override
    public void removeActuator(UUID buildingId, UUID actuatorId) {
     buildings.get(buildingId).removeActuator(actuatorId);
    }
}
