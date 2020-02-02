/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.EMSManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.EMS.EMSDriver.DriverWorkAreaJPanel;
import userinterface.EMS.EMSManager.EMSManagerJPanel;

/**
 *
 * @author admin
 */
public class EMSManagerRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, 
            Organization organization, Enterprise enterprise, EcoSystem business) {
        return new EMSManagerJPanel(userProcessContainer, account, (EMSManagerOrganization)organization, enterprise);
    }
    
}
