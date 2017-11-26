/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class DiseaseCatalog {
    ArrayList<Disease> diseaseCatalog;
    
    public DiseaseCatalog(){
        diseaseCatalog = new ArrayList();
    }

    public ArrayList<Disease> getDiseaseCatalog() {
        return diseaseCatalog;
    }

    public void setDiseaseCatalog(ArrayList<Disease> diseaseCatalog) {
        this.diseaseCatalog = diseaseCatalog;
    }
    
    public Disease addDisease(){
        Disease v = new Disease();
        diseaseCatalog.add(v);
        return v;
    }
    
    public void removeDisease(Disease d){
        diseaseCatalog.remove(d);
    }
    
}
