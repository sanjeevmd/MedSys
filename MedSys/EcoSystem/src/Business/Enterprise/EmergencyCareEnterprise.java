/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sanjeev MD
 */
public class EmergencyCareEnterprise extends Enterprise {

    public EmergencyCareEnterprise(String name, String mailId){
        super(name,EnterpriseType.EmergencyCare,mailId);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

}
