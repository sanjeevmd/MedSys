/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;



import Business.Blood.BloodGroup;
import Business.Blood.BloodGroupList;

/**
 *
 * @author raunak
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private BloodGroup bloodgroup;
    
    public static String REQUEST_PENDING = "Pending";
    public static String REQUEST_PROGRESS = "In Progress";
    public static String REQUEST_ACCEPT = "Completed";

    public BloodGroup getBloodgroup() {
        return bloodgroup;
    }

    public void setBloodgroup(BloodGroup bloodgroup) {
        this.bloodgroup = bloodgroup;
    }

    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    public String getUnits() {
        return Units;
    }

    public void setUnits(String Units) {
        this.Units = Units;
    }

    public String getImpureUnits() {
        return impureUnits;
    }

    public void setImpureUnits(String impureUnits) {
        this.impureUnits = impureUnits;
    }
    private String bloodtype;
    private String Units;
    private String impureUnits;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    public LabTestWorkRequest(BloodGroup bloodgroup) {
       this.bloodgroup = bloodgroup;
        this.Units = Units;
        this.bloodtype = bloodgroup.getBloodgroup();
    }

   @Override
    public String toString(){
        return this.getBloodtype();
    }
    
}
