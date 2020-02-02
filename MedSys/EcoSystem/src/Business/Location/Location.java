/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Location;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author Sanjeev MD
 */
public class Location {


    public Location(int capacity) {
        max = capacity;
        this.NurseList = new ArrayList<Employee>();
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getMax() {
        return max;
    }

    public ArrayList<Employee> getNurseList() {
        return NurseList;
    }

    public void setNurseList(ArrayList<Employee> NurseList) {
        this.NurseList = NurseList;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int max;

    private String name;

    private int counter;

    private ArrayList<Employee> NurseList;

    @Override
    public String toString() {
        return this.getName();
    }

    public void addNurse(Employee e) {
        this.NurseList.add(e);
    }

    public Boolean checkNurse(Employee e) {

        boolean b = true;
        for (Employee emp : this.NurseList) {
            if (emp.getName().equals(e.getName())) {
                b = false;
                break;
            }
        }
        return b;

}
}
