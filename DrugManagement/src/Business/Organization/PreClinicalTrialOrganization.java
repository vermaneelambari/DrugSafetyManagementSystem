/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PrimaryTestRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class PreClinicalTrialOrganization extends Organization{
    public PreClinicalTrialOrganization() {
        super(Organization.Type.PreClinicalTrial.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PrimaryTestRole());
        return roles;
    }
}
