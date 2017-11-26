/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Disease.Disease;
import Business.Vaccine.Vaccine;

/**
 *
 * @author Sumanth
 */
public class Employee {
    
    private String name;
    private int id;
    private Vaccine vaccine;
    private Disease disease;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
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

    public int getId() {
        return id;
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
