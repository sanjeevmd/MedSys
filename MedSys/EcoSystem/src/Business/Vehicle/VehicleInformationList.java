/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vehicle;

/**
 *
 * @author admin
 */

import java.time.LocalDateTime;
import java.util.ArrayList;

public class VehicleInformationList {
   public ArrayList<Vehicle> vehicleInformationList;
    public LocalDateTime lastUpdated;
    
    public VehicleInformationList(){
    
    vehicleInformationList = new ArrayList<Vehicle>();

    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<Vehicle> getVehicleInformationList() {
        return vehicleInformationList;
    }

    public void setVehicleInformationList(ArrayList<Vehicle> vehicleInformationList) {
        this.vehicleInformationList = vehicleInformationList;
    }
    
    public Vehicle addVehicle(Vehicle vehicle){
    vehicleInformationList.add(vehicle);
    return vehicle;
    }
    
    public int totalVehicleCount(){
    return vehicleInformationList.size();
    }
    
    public void removeVehicle(Vehicle vehicle){
    vehicleInformationList.remove(vehicle);
    }
    
    
    
}
