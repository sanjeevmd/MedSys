/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EMSPatient;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class EMSPatientDirectory {
    private ArrayList<EMSPatient> EMSPatientList;

    public EMSPatientDirectory() {
    EMSPatientList = new ArrayList<EMSPatient>();
    }

    public ArrayList<EMSPatient> getEMSPatientList() {
        return EMSPatientList;
    }

    public void setEMSPatientList(ArrayList<EMSPatient> EMSPatientList) {
        this.EMSPatientList = EMSPatientList;
    }
    

    
    public EMSPatient addEMSPatient(EMSPatient EMSPatient){
    EMSPatientList.add(EMSPatient);
    return EMSPatient;
    }
}
