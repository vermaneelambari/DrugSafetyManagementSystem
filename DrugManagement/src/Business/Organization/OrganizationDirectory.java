/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Primary.getValue())){
            organization = new PreClinicalTrialOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Final.getValue())){
            organization = new PostClinicalTrialOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Insurance.getValue())){
            organization = new InsuranceOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Pharma.getValue())){
            organization = new PharmaOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}