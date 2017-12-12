/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Disease.Disease;
import Business.PharmaMoney.PharmaMoney;
import Business.Vaccine.Vaccine;

/**
 *
 * @author Sumanth
 */
public class Employee {
    
    private String name;
    private Vaccine vaccine;
    private Disease disease;
    private PharmaMoney pharmaMoney;

    public PharmaMoney getPharmaMoney() {
        return pharmaMoney;
    }

    public void setPharmaMoney(PharmaMoney pharmaMoney) {
        this.pharmaMoney = pharmaMoney;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
