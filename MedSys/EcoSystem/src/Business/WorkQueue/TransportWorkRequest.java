/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author admin
 */

import Business.EMSPatient.EMSPatient;
import Business.Enterprise.Enterprise;
import Business.Patients.Patient;
import Business.Vehicle.Vehicle;
import Business.Vehicle.VehicleInformationList;
public class TransportWorkRequest extends WorkRequest {
 
 private EMSPatient EMSPatient;
 private Vehicle vehicle;



    public static String getREQUEST_PROCESSING() {
        return REQUEST_PROCESSING;
    }

    public static void setREQUEST_PROCESSING(String REQUEST_PROCESSING) {
        TransportWorkRequest.REQUEST_PROCESSING = REQUEST_PROCESSING;
    }
    
    public static String REQUEST_PENDING = "Pending";
    public static String REQUEST_PROCESSING = "In Progress";
    public static String REQUEST_COMPLETED = "Completed";
 
    public TransportWorkRequest(EMSPatient EMSPatient,Vehicle vehicle ){
    this.EMSPatient=EMSPatient;
    this.vehicle= vehicle;
    }
    
    public boolean isTransfer;
    
    public Patient transferPatient;

    public Enterprise receiverEnterprise;

    public Enterprise getReceiverEnterprise() {
        return receiverEnterprise;
    }

    public void setReceiverEnterprise(Enterprise receiverEnterprise) {
        this.receiverEnterprise = receiverEnterprise;
    }

    
    public boolean isIsTransfer() {
        return isTransfer;
    }

    public void setIsTransfer(boolean isTransfer) {
        this.isTransfer = isTransfer;
    }

    public Patient getTransferPatient() {
        return transferPatient;
    }

    public void setTransferPatient(Patient transferPatient) {
        this.transferPatient = transferPatient;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public EMSPatient getEMSPatient() {
        return EMSPatient;
    }


    public static String getREQUEST_PENDING() {
        return REQUEST_PENDING;
    }

    public static void setREQUEST_PENDING(String REQUEST_PENDING) {
        TransportWorkRequest.REQUEST_PENDING = REQUEST_PENDING;
    }

    public static String getREQUEST_COMPLETED() {
        return REQUEST_COMPLETED;
    }

    public static void setREQUEST_COMPLETED(String REQUEST_COMPLETED) {
        TransportWorkRequest.REQUEST_COMPLETED = REQUEST_COMPLETED;
    }

    public void setEMSPatient(EMSPatient EMSPatient) {
        this.EMSPatient = EMSPatient;
    }

    @Override
    public String toString(){
        return EMSPatient.getPatientName();
    }
    
}
    
