/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class PersonDirectory {
    private ArrayList<Person> personList;
       
       public PersonDirectory(){
           personList = new ArrayList<>();
       }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public Person addPerson(){
        Person p = new Person();
        personList.add(p);
        return p;
    }
    
    public void deletePerson(Person p){
        personList.remove(p);
    }
    
//    public void UpdatePerson(){
//        
//    }
    
    public Person searchPerson(String name){
        for(Person p : personList){
            if(p.getName()== name){
                return p;
            }
        } 
        return null; 
    }
}
