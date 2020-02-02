/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.EMSPatient.EMSPatientDirectory;

import Business.Blood.BloodGroupList;
import Business.Organization.ClinicianOrganization;

import Business.Location.LocationList;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Patients.PatientDirectory;
import Business.Vehicle.Vehicle;
import Business.Vehicle.VehicleInformationList;

/**
 *
 * @author MyPC1
 */
public abstract class Enterprise extends Organization {

    private EnterpriseType enterpriseType;
    private PatientDirectory patientDirectory;
    private EMSPatientDirectory EMSPatientDirectory;
    private String mailID;

    public String getMailID() {
        return mailID;
    }

    public void setMailID(String mailID) {
        this.mailID = mailID;
    }

    public EMSPatientDirectory getEMSPatientDirectory() {
        return EMSPatientDirectory;
    }

    public void setEMSPatientDirectory(EMSPatientDirectory EMSPatientDirectory) {
        this.EMSPatientDirectory = EMSPatientDirectory;
    }

    public LocationList getLocationList() {
        return locationList;
    }

    public void setLocationList(LocationList locationList) {
        this.locationList = locationList;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    private OrganizationDirectory organizationDirectory;

    private LocationList locationList;
    private VehicleInformationList vehicleInformationList;

    private BloodGroupList bloodgrouplist;

    public BloodGroupList getBloodgrouplist() {
        return bloodgrouplist;
    }

    public void setBloodgrouplist(BloodGroupList bloodgrouplist) {
        this.bloodgrouplist = bloodgrouplist;
    }

    public VehicleInformationList getVehicleInformationList() {
        return vehicleInformationList;
    }

    public void setVehicleInformationList(VehicleInformationList vehicleInformationList) {
        this.vehicleInformationList = vehicleInformationList;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public enum EnterpriseType {
        Hospital("Hospital"), EmergencyCare("EmergencyCare"), BloodBank("BloodBank");

        private String value;

        private EnterpriseType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public Enterprise(String name, EnterpriseType type, String mailID) {
        super(name);
        this.enterpriseType = type;

        if (enterpriseType == EnterpriseType.BloodBank) {
            bloodgrouplist = new BloodGroupList();
        } else if (enterpriseType == EnterpriseType.Hospital) {
            patientDirectory = new PatientDirectory();
            locationList = new LocationList();
        } else if (enterpriseType == EnterpriseType.EmergencyCare) {
            vehicleInformationList = new VehicleInformationList();
            EMSPatientDirectory = new EMSPatientDirectory();
        }
        
        organizationDirectory = new OrganizationDirectory();
        this.mailID = mailID;
    }
   @Override
    public String toString(){
        return this.getName();
    }

}
