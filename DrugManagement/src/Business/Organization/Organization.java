/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Disease.DiseaseCatalog;
import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.Request.Request;
import Business.Request.RequestList;
import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public abstract class Organization {

    private String name;
    private RequestList requestList;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private PersonDirectory personDirectory;
    private DiseaseCatalog diseaseCatalog;

    public DiseaseCatalog getDiseaseCatalog() {
        return diseaseCatalog;
    }

    public void setDiseaseCatalog(DiseaseCatalog diseaseCatalog) {
        this.diseaseCatalog = diseaseCatalog;
    }
    
    public enum Type{
        Admin("Admin Organization"), Pharma("Pharma Organization"), PreClinicalTrial("Pre Clinical Trial Organization"),PostClinicalTrial("Post Clinical Trial Organization"),Insurance("Insurance Organization"),PreTrialPublicSector("Pre Trial PublicSector Organization"),PostTrialPublicSector("Post Trial PublicSector Organization"),Authority("Authority Organization");
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        requestList = new RequestList();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        diseaseCatalog = new DiseaseCatalog();
        personDirectory = new PersonDirectory();
    }

    public abstract ArrayList<Role> getSupportedRole();

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public RequestList getRequestList() {
        return requestList;
    }

    public void setRequestList(RequestList requestList) {
        this.requestList = requestList;
    }

   
    @Override
    public String toString() {
        return name;
    }
    
    
}
