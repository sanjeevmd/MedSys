/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.OrganizationDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, String mailID) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital) {
            enterprise = new HospitalEnterprise(name, mailID);
        } else if (type == Enterprise.EnterpriseType.EmergencyCare) {
            enterprise = new EmergencyCareEnterprise(name, mailID);
        } else if (type == Enterprise.EnterpriseType.BloodBank) {
            enterprise = new BloodBank(name, mailID);
        }

        enterpriseList.add(enterprise);
        return enterprise;
    }

    public void removeEnterprise(Enterprise enterprise) {

        enterpriseList.remove(enterprise);

    }
    
    
}
