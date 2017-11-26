/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterPriseList;
    
    public EnterpriseDirectory(){
        enterPriseList = new ArrayList();
    }

    public ArrayList<Enterprise> getEnterPriseList() {
        return enterPriseList;
    }

    public void setEnterPriseList(ArrayList<Enterprise> enterPriseList) {
        this.enterPriseList = enterPriseList;
    }
    
    public Enterprise createAndAddEnterPrise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type==Enterprise.EnterpriseType.FDA){
            enterprise = new FDAEnterprise(name);
            enterPriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.DrugManufacturing){
            enterprise = new DrugManufacturingEnterprise(name);
            enterPriseList.add(enterprise);
        }else if(type==Enterprise.EnterpriseType.DrugTesting){
            enterprise = new DrugTestingEnterprise(name);
            enterPriseList.add(enterprise);
        }
        return enterprise;
    }
    
    public void deleteEnterprise(Enterprise e){
        enterPriseList.remove(e);
    }
}
