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
public interface IExtendedBuildingManagementSystem extends IBuildingManagementSystem{
    void addBuilding(Building b);

    Building getBuilding(UUID id);

    HashMap<UUID, Building> getBuildings();

    void removeBuilding(UUID id);
}
