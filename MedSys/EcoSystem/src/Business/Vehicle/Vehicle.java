/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vehicle;


import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Vehicle {
    private boolean available;
    private String vehicleNo;
    private String manufactured_year;
    private String serial_num;
    private String model;
    private String available_locality;
    private Date createdOn;
    private String yes = "Yes";
    private String no = "No";
    
    public Vehicle(boolean available, String vehicleNo, String manufactured_year,String serial_num, String model, String available_locality) {
        this.available = available;
        this.vehicleNo = vehicleNo;
        this.manufactured_year = manufactured_year;
        this.serial_num = serial_num;
        this.model = model;
        this.available_locality = available_locality;
        
    }


    
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    public String availability(){
    if (isAvailable()==true){
        return yes;
    }
    else{
    return no;
    }
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }



    public String getManufactured_year() {
        return manufactured_year;
    }

    public void setManufactured_year(String manufactured_year) {
        this.manufactured_year = manufactured_year;
    }

    public String getSerial_num() {
        return serial_num;
    }

    public void setSerial_num(String serial_num) {
        this.serial_num = serial_num;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAvailable_locality() {
        return available_locality;
    }

    public void setAvailable_locality(String available_locality) {
        this.available_locality = available_locality;
    }


    

    @Override
    public String toString(){
       return this.vehicleNo;
    }    
}
