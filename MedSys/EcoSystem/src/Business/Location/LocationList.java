/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Location;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Sanjeev MD
 */
public class LocationList {

    private ArrayList<Location> locationList;

    public LocationList() {
        locationList = new ArrayList<Location>();
    }

    public ArrayList<Location> getLocationList() {
        return locationList;
    }

    public void setLocationList(ArrayList<Location> locationList) {
        this.locationList = locationList;
    }

    public void addLocation(String Name, int capacity) {
        Location location = new Location(capacity);
        location.setName(Name);
        locationList.add(location);
    }
}
