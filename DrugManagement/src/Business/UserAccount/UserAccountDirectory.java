/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount createUserAccount(String username, String password, Employee employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String username, EcoSystem system) {
        for(UserAccount u:system.getUserAccountDirectory().getUserAccountList()){
            if(u.getUsername().equals(username)){
                return false;
            }
        }
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterPriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (ua.getUsername().equals(username)) {
                        return false;
                    }
                }
                for(Organization o: enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount ua:o.getUserAccountDirectory().getUserAccountList()){
                        if (ua.getUsername().equals(username)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public void deleteUserForEnterprise(UserAccount u, EcoSystem system) {
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterPriseList()) {
                for(UserAccount acc:enterprise.getUserAccountDirectory().getUserAccountList()){
                    if(acc.getUsername().equals(u.getUsername())){
                        enterprise.getUserAccountDirectory().getUserAccountList().remove(u);
                        break;
                    }
                }
            }
        }
    }
    
    public void deleteUserForOrganization(UserAccount u, EcoSystem system) {
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterPriseList()) {
                for(Organization o: enterprise.getOrganizationDirectory().getOrganizationList()){
                    for(UserAccount usr:o.getUserAccountDirectory().getUserAccountList()){
                        if(usr.getUsername().equals(u.getUsername())){
                            o.getUserAccountDirectory().getUserAccountList().remove(u);
                            break;
                        }
                    }
                }
            }
        }
    }
}
