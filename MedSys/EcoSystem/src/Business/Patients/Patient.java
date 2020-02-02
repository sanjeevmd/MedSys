/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patients;

import Business.Allergy.AllergyList;
import Business.Employee.Employee;
import Business.Location.Location;
import Business.Medications.MedicationList;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Sanjeev MD
 */
public class Patient {

    public Patient() {
        this.medList = new MedicationList();
        this.allergies = new AllergyList();
    }

    private String patientName;

    private String patientHRN;

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientHRN() {
        return patientHRN;
    }

    public void setPatientHRN(String patientHRN) {
        this.patientHRN = patientHRN;
    }

    public Employee getDoctor() {
        return doctor;
    }

    public void setDoctor(Employee doctor) {
        this.doctor = doctor;
    }

    public MedicationList getMedList() {
        return medList;
    }

    public void setMedList(MedicationList medList) {
        this.medList = medList;
    }

    public AllergyList getAllergies() {
        return allergies;
    }

    public void setAllergies(AllergyList allergies) {
        this.allergies = allergies;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    private Employee doctor;

    private MedicationList medList;

    private AllergyList allergies;

    private Location location;

    private String BloodGroup;
    
    private boolean isDischarged;

    public boolean isIsDischarged() {
        return isDischarged;
    }

    public void setIsDischarged(boolean isDischarged) {
        this.isDischarged = isDischarged;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String BloodGroup) {
        this.BloodGroup = BloodGroup;
    }

    @Override
    public String toString() {
        return this.getPatientName();
    }
}
