/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

/**
 *
 * @author Sumanth
 */
public class Disease {
    String dName;

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }
    
    @Override
    public String toString(){
        return dName;
    }
}
