/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Sumanth
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
     public Employee searchEmployee(String name){
        for(Employee n:employeeList){
            if(n.getName().toLowerCase().equals(name.toLowerCase())){
                return n;
            }
        }
        return null;
    }
    
     public void  removeEmployee(Employee e){
        employeeList.remove(e);
    }
}