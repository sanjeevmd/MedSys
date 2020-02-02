/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EMSNurseOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EMS.EMSDriver.DriverWorkAreaJPanel;
import userinterface.EMS.EMSManager.EMSManagerJPanel;
import userinterface.EMS.EMSNurse.EMSNurseWorkAreaJPanel;

/**
 *
 * @author admin
 */
public class EMSNurseRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
            return new EMSNurseWorkAreaJPanel(userProcessContainer, account, (EMSNurseOrganization)organization, enterprise,business);
    }
    
}
