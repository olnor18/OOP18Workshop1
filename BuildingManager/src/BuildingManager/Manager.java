package BuildingManager;

import java.util.HashMap;
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
    
}
