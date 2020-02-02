/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Allergy;

import java.util.ArrayList;

/**
 *
 * @author Sanjeev MD
 */
public class AllergyList {

    private ArrayList<Allergy> allergyList;

    public AllergyList() {
        allergyList = new ArrayList<>();
    }

    public ArrayList<Allergy> getAllergyList() {
        return allergyList;
    }

    public void setAllergyList(ArrayList<Allergy> allergyList) {
        this.allergyList = allergyList;
    }

    public boolean checkexist(Allergy selectedAllergy) {
        for (Allergy alg : allergyList) {
            if (selectedAllergy.getAllergy().equals(alg.getAllergy())) {
                return false;
            }
        }
        return true;
    }

    public void addAllergy(Allergy selectedAllergy) {
        Allergy allergy = new Allergy(selectedAllergy.getAllergy(), selectedAllergy.getCompound());
        allergyList.add(allergy);
    }

}
