/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Patients.Patient;

/**
 *
 * @author Sanjeev MD
 */
public class DischargeReqtoNurse extends WorkRequest {

    private Patient patient;

    public Patient getPatient() {
        return patient;
    }

    private String Patientname;

    public String getPatientname() {
        return Patientname;
    }

    public void setPatientname(String Patientname) {
        this.Patientname = Patientname;
    }
    
    public DischargeReqtoNurse(Patient patient) {
        this.patient = patient;
        this.Patientname = patient.getPatientName();
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    @Override
    public String toString(){
        return this.getPatientname();
    }

}
