/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medications;

import Business.Allergy.Allergy;
import java.util.ArrayList;

/**
 *
 * @author Sanjeev MD
 */
public class MedicationList {

    private ArrayList<Medication> medicationList;

    public MedicationList() {
        medicationList = new ArrayList<Medication>();
    }

    public ArrayList<Medication> getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(ArrayList<Medication> medicationList) {
        this.medicationList = medicationList;
    }

    public void addMed(Medication premed, int i, int j) {

        Medication med = new Medication(i, j);
        med.setRoute(premed.getRoute());
        med.setName(premed.getName());
        med.setCompoundName1(premed.getCompoundName1());
        med.setCompoundName2(premed.getCompoundName2());
        med.setRoute(premed.getRoute());
        medicationList.add(med);
    }

    public Medication checkMedwhileAddAllergy(Allergy allergy) {

        for (Medication m : medicationList) {
            for (String s : allergy.getCompound()) {
                if (!m.isIsdiscontinue()) {
                    if (m.getCompoundName1().equals(s) || m.getCompoundName2().equals(s)) {
                        for (MedicationAdministration medAdmin : m.getMedAdmin()) {
                            if (!medAdmin.getIsAdministered()) {
                                return m;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}
