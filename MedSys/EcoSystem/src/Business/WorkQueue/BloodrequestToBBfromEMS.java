/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.EMSPatient.EMSPatient;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Sanjeev MD
 */
public class BloodrequestToBBfromEMS extends WorkRequest {

    public String patientName;
    public String bloodGroup;
    public String reqUnits;
    public UserAccount userAccount;
    public static String REQUEST_PENDING = "Pending";
    public static String REQUEST_REJECT = "Declined";
    public static String REQUEST_PROGRESS = "In Progress";
    public static String REQUEST_COMPLETE = "Completed";

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public static String getREQUEST_PENDING() {
        return REQUEST_PENDING;
    }

    public static void setREQUEST_PENDING(String REQUEST_PENDING) {
        BloodrequestToBBfromEMS.REQUEST_PENDING = REQUEST_PENDING;
    }

    public static String getREQUEST_REJECT() {
        return REQUEST_REJECT;
    }

    public static void setREQUEST_REJECT(String REQUEST_REJECT) {
        BloodrequestToBBfromEMS.REQUEST_REJECT = REQUEST_REJECT;
    }

    public static String getREQUEST_PROGRESS() {
        return REQUEST_PROGRESS;
    }

    public static void setREQUEST_PROGRESS(String REQUEST_PROGRESS) {
        BloodrequestToBBfromEMS.REQUEST_PROGRESS = REQUEST_PROGRESS;
    }

    public static String getREQUEST_COMPLETE() {
        return REQUEST_COMPLETE;
    }

    public static void setREQUEST_COMPLETE(String REQUEST_COMPLETE) {
        BloodrequestToBBfromEMS.REQUEST_COMPLETE = REQUEST_COMPLETE;
    }
    
    
    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getReqUnits() {
        return reqUnits;
    }

    public void setReqUnits(String reqUnits) {
        this.reqUnits = reqUnits;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    

    public BloodrequestToBBfromEMS(String patientName, String bloodGroup, String reqUnits) {
        this.patientName = patientName;
        this.bloodGroup = bloodGroup;
        this.reqUnits = reqUnits;
    }

    @Override
    public String toString(){
        return getBloodGroup();
    }

 

}
