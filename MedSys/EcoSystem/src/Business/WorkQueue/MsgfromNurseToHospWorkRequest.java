/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.EMSPatient.EMSPatient;

/**
 *
 * @author admin
 */
public class MsgfromNurseToHospWorkRequest extends WorkRequest {
    public String message;
    public String patientName;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public MsgfromNurseToHospWorkRequest(String message, String patientName) {
        this.message = message;
        this.patientName = patientName;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
