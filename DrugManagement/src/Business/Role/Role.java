/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Authority("Authority"),
        Insurance("Insurance"),
        Pharma("Pharma Company"),
        PostClinicalPublicSector("Post Clinical Trial Public Sector"),
        PreClinicalPublicSector("Pre Clinical Trial Public Sector"),
        PreClinicalTrial("Pre Clinical Trial"),
        PostClinicalTrial("Post Clinical Trial");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business,
            Network network);

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    
}