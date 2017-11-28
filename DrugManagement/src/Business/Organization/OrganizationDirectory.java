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
        if (type.getValue().equals(Type.PreClinicalTrial.getValue())){
            organization = new PreClinicalTrialOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.PostClinicalTrial.getValue())){
            organization = new PostClinicalTrialOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Insurance.getValue())){
            organization = new InsuranceOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Pharma.getValue())){
            organization = new PharmaOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.Authority.getValue())){
            organization = new AuthorityOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.PostTrialPublicSector.getValue())){
            organization = new PostTrialPublicSectorOrganization();
            organizationList.add(organization);
        }else if (type.getValue().equals(Type.PreTrialPublicSector.getValue())){
            organization = new PreTrialPublicSectorOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}