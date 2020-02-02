/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Blood.BloodGroup;
import Business.Blood.BloodGroupList;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ClinicianOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.Bloodbank.ClinicianWorkAreaJPanel;

/**
 *
 * @author harshi
 */
public class ClinicianRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new ClinicianWorkAreaJPanel(userProcessContainer, account, (ClinicianOrganization)organization, enterprise, business);
    }

  
}
    
    
    

