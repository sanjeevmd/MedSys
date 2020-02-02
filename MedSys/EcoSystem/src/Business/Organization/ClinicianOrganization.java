/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClinicianRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author harshi
 */
public class ClinicianOrganization extends Organization{

   public ClinicianOrganization() {
        super(Organization.Type.Clinicians.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClinicianRole());
        return roles;
    }

    
    
}
