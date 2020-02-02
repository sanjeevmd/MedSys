/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.DriverRole;
import Business.Role.EMSManagerRole;
import Business.Role.EMSNurseRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class EMSNurseOrganization extends Organization{
    
        public EMSNurseOrganization()
    {
        super(Organization.Type.EMSNurse.getValue());
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EMSNurseRole());
        return roles;
    }  
    
}
