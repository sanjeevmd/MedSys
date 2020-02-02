/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medications;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Sanjeev MD
 */
public class Medication {

    public Medication(String name, String compoundName1, String compoundName2) {
        this.name = name;
        this.compoundName1 = compoundName1;
        this.compoundName2 = compoundName2;
    }

    public Medication(int days, int times) {
        medAdmin = new ArrayList<MedicationAdministration>();
        for (int i = 1; i <= days; i++) {
            for (int j = 1; j <= times; j++) {
                MedicationAdministration medadmin = new MedicationAdministration(i, j);
                medAdmin.add(medadmin);
            }
        }
        this.i = days;
        this.j = times;
    }

    private ArrayList<MedicationAdministration> medAdmin;

    private String name;

    private String compoundName1;

    private int i;

    private int j;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public ArrayList<MedicationAdministration> getMedAdmin() {
        return medAdmin;
    }

    public void setMedAdmin(ArrayList<MedicationAdministration> medAdmin) {
        this.medAdmin = medAdmin;
    }

    private String compoundName2;

    private String route;

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompoundName1() {
        return compoundName1;
    }

    public void setCompoundName1(String compoundName1) {
        this.compoundName1 = compoundName1;
    }

    public String getCompoundName2() {
        return compoundName2;
    }

    public void setCompoundName2(String compoundName2) {
        this.compoundName2 = compoundName2;
    }

    private boolean isdiscontinue;

    public boolean isIsdiscontinue() {
        return isdiscontinue;
    }

    public void setIsdiscontinue(boolean isdiscontinue) {
        this.isdiscontinue = isdiscontinue;
    }

    public boolean isDischarged;

    public boolean isIsDischarged() {
        return isDischarged;
    }

    public void setIsDischarged(boolean isDischarged) {
        this.isDischarged = isDischarged;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
