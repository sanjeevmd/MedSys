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
public class Allergy {

    private String allergy;


    private ArrayList<String> compound;

    public Allergy(String allergy, ArrayList<String> compounds) {
        this.allergy = allergy;
        compound = compounds;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public ArrayList<String> getCompound() {
        return compound;
    }

    public void setCompound(ArrayList<String> compound) {
        this.compound = compound;
    }

    @Override
    public String toString(){
        return this.getAllergy();
    }

}
