/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Patients.Patient;

/**
 *
 * @author Sanjeev MD
 */
public class BloodrequestToBBfromHospital extends WorkRequest {

    public Patient Patient;

    public int reqUnits;

    public Enterprise senderEnterprise;

    public Enterprise getSenderEnterprise() {
        return senderEnterprise;
    }

    public void setSenderEnterprise(Enterprise senderEnterprise) {
        this.senderEnterprise = senderEnterprise;
    }

    public Patient getPatient() {
        return Patient;
    }

    public void setPatient(Patient Patient) {
        this.Patient = Patient;
    }

    public int getReqUnits() {
        return reqUnits;
    }

    public void setReqUnits(int reqUnits) {
        this.reqUnits = reqUnits;
    }

    @Override
    public String toString() {
        return this.getPatient().getBloodGroup();
    }
}
