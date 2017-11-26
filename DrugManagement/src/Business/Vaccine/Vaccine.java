/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Vaccine;

/**
 *
 * @author Sumanth
 */
public class Vaccine {
    String vName;

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }
    
    @Override
    public String toString(){
        return vName;
    }
}
