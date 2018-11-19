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
public class Manager {
    private HashMap<UUID, Building> buildings = new HashMap<>();
    
    public HashMap<UUID, Building> getBuildings() {
        HashMap<UUID, Building> clonedBuildings = new HashMap(buildings);
        return clonedBuildings;
    }

    public void addBuilding(Building b) {
        buildings.put(b.getId(), b);
    }
    
    public void removeBuilding(UUID id) {
        buildings.remove(id);
    }
    
    public Building getBuilding(UUID id) {
        return buildings.get(id);
    }
    
    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append("The manager has the following buildings:\n");
       for (Map.Entry<UUID, Building> entry : buildings.entrySet())
       {
           sb.append("--------------------\n").append(entry.getValue().toString()).append("\n");
       }
       sb.append("--------------------\n");
       return sb.toString();
    }
}
