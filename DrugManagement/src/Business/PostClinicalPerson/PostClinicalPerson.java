/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.PostClinicalPerson;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class PostClinicalPerson {
    private String name;
    private int age; 
    private String disease;
    private String sideEffects;
    private double insuranceMoney;

    public double getInsuranceMoney() {
        return insuranceMoney;
    }

    public void setInsuranceMoney(double insuranceMoney) {
        this.insuranceMoney = insuranceMoney;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    @Override
    public String toString() {
        return name;
    }
}
