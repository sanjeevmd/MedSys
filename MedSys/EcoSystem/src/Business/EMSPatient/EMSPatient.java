/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EMSPatient;

/**
 *
 * @author admin
 */
public class EMSPatient {
    
    private String patientName;
    
    private String contactNo;
    
    private String source;
    
    private String destination;
    
    public EMSPatient(String patientName, String contactNo, String source, String destination ){
    this.patientName=patientName;
    this.contactNo=contactNo;
    this.source=source;
    this.destination=destination;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }


    
   
}
