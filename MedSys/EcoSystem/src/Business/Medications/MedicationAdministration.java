/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medications;

import Business.Employee.Employee;

/**
 *
 * @author Sanjeev MD
 */
public class MedicationAdministration {

    public MedicationAdministration(int day, int time) {
        this.day = day;
        this.time = time;
        isAdministered = false;
        administeredBy = new Employee();
    }

    private int day;

    private int time;

    private int Sequence = 0;

    private Boolean isAdministered;

    private Employee administeredBy;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public Boolean getIsAdministered() {
        return isAdministered;
    }

    public void setIsAdministered(Boolean isAdministered) {
        this.isAdministered = isAdministered;
    }

    public Employee getAdministeredBy() {
        return administeredBy;
    }

    public void setAdministeredBy(Employee administeredBy) {
        this.administeredBy = administeredBy;
    }

    @Override
    public String toString() {
        return this.getDay() + "";
    }

}
