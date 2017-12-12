/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author neelambariverma
 */
public class Person {
    
    private String name;
    private int age; 
    private String disease;
    private double money;
    private ArrayList<String> diseaseList;

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
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

    public ArrayList<String> getDiseaseList() {
        return diseaseList;
    }

    public void setDiseaseList(ArrayList<String> diseaseList) {
        this.diseaseList = diseaseList;
    }

     
    @Override
    public String toString() {
        return name;
    }
}
