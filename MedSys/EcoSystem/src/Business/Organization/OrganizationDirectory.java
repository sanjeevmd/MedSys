/*kdg
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;

        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganization();
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new LabOrganization();
        } else if (type.getValue().equals(Type.Nurse.getValue())) {
            organization = new NurseOrganization();
        } else if (type.getValue().equals(Type.EMSNurse.getValue())){
            organization = new EMSNurseOrganization();
        } else if (type.getValue().equals(Type.EMSManager.getValue())) {
            organization = new EMSManagerOrganization();           
        } else if (type.getValue().equals(Type.Driver.getValue())) {
            organization = new DriverOrganization();
        } else if((type.getValue().equals(Type.Manager.getValue()))) {
            organization = new ManagerOrganization();
        } else if (type.getValue().equals(Type.Clinicians.getValue())) {
            organization = new ClinicianOrganization();
        }       
        organizationList.add(organization);
        return organization;
    }
    public void deleteOrganization(Organization organization)
    {
      organizationList.remove(organization);
    }
    
}
