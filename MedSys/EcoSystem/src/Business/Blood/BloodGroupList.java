/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Blood;

import java.util.ArrayList;

/**
 *
 * @author harshi
 */
public class BloodGroupList {
    
    private ArrayList<BloodGroup> BloodGroupList;
   
    public BloodGroupList(){
      BloodGroupList = new ArrayList<BloodGroup>();
    
    }

    public ArrayList<BloodGroup> getBloodGroupList() {
        return BloodGroupList;
    }

    public void setBloodGroupList(ArrayList<BloodGroup> BloodGroupList) {
        this.BloodGroupList = BloodGroupList;
    }
    
    public BloodGroup addBG(BloodGroup bg)
    {
        BloodGroupList.add(bg);
        return bg;
    }
    
    public void deleteBG(BloodGroup bg){
        BloodGroupList.remove(bg);
    }  
    
   
}
