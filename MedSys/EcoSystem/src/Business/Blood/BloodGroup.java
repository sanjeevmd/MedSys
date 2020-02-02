/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Blood;

/**
 *
 * @author harshi
 */
public class BloodGroup {
    
    private String bloodgroup;
    private String availableUnits;
    private String verification;

    public String getAvailableUnits() {
        return availableUnits;
    }

    public void setAvailableUnits(String availableUnits) {
        this.availableUnits = availableUnits;
    }
    
    public BloodGroup(String bloodgroup, String availableUnits){
        this.bloodgroup = bloodgroup; 
        this.availableUnits = availableUnits;
    }

    public String getBloodgroup() { 
        return bloodgroup;
    }

    public void setBloodgroup(String bloodgroup) {
        this.bloodgroup = bloodgroup;
    }
    
     @Override
    public String toString(){
        return this.bloodgroup;
    }
}
