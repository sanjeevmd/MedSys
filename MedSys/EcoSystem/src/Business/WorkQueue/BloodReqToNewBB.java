/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Blood.BloodGroup;
import Business.Blood.BloodGroupList;

/**
 *
 * @author harshi
 */
public class BloodReqToNewBB extends WorkRequest{
    
    private BloodGroup bloodgroup;
    
    public static String REQUEST_PENDING = "Pending";
    public static String REQUEST_REJECT = "Declined";
    public static String REQUEST_PROGRESS = "In Progress";
    public static String REQUEST_ACCEPT = "Accepted and Completed";


public void setBloodgroup(BloodGroup bloodgroup) {
     this.bloodgroup = bloodgroup;
    }
    
 public BloodGroup getBloodGroup() {
        return bloodgroup;
    }

    private String bloodtype;
    private String ReqUnits;

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getReqUnits() {
        return ReqUnits;
    }

    public void setReqUnits(String ReqUnits) {
        this.ReqUnits = ReqUnits;
    }

    public BloodReqToNewBB(BloodGroup bloodgroup) {
       this.bloodgroup = bloodgroup;
        this.ReqUnits = ReqUnits;
        this.bloodtype = bloodgroup.getBloodgroup();
    }

   @Override
    public String toString(){
        return this.getBloodtype();
    }
    
    
    
}
