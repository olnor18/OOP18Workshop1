/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuildingManager;

import java.util.UUID;

/**
 *
 * @author AleksanderSTUD
 */
public abstract class Sensor {
    private UUID id;
    private String name;
    private String location;
    
    public Sensor(String name, String location) {
        this.name = name;
        this.location = location;
        id = UUID.randomUUID();
    }
    
    @Override
    public String toString() {
        return "";
    }
    
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    
}
