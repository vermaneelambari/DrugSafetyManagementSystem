/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PreClinicalPubSecRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author neelambariverma
 */
public class PreClinicalPubSecJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    EcoSystem system;


    /**
     * Creates new form PreClinicalPubSecJPanel
     */
    public PreClinicalPubSecJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system){
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.system = system; 
        this.enterprise = enterprise;
        if(system.getPersonDirectory().getPersonList().size()==0){
            addData();
        }
        populatePreClinicalPubSecTable();
        
    }

    public void addData(){
        String csvFile = "Project_Disease.csv";
        BufferedReader bufferedReader = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            bufferedReader = new BufferedReader(new FileReader(csvFile));
            ArrayList<String[]> dataCsvArr = new ArrayList();
            int count = 0;
            while ((line = bufferedReader.readLine()) != null) {
                String[] dataFromCsv = line.split(cvsSplitBy);
                dataCsvArr.add(count, dataFromCsv);
                count++;
            }
            for (int i = 1; i < dataCsvArr.size(); i++) {
                String valuesOfArray[] = dataCsvArr.get(i);
                List<String> list4 = Arrays.asList(new String());
                list4 = Arrays.asList(valuesOfArray[3].split("\\|"));
                Person p = system.getPersonDirectory().addPerson();
                p.setDiseaseList(list4);
                p.setName(valuesOfArray[0]);
                p.setAge(Integer.parseInt(valuesOfArray[1]));
                p.setDisease(valuesOfArray[2]);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(PreClinicalPubSecJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void populatePreClinicalPubSecTable(){
        DefaultTableModel dtm = (DefaultTableModel)tblPreClinical.getModel();
        dtm.setRowCount(0);
        
        for(Person person: system.getPersonDirectory().getPersonList()){
            Object row[] = new Object[3];
            row[0] = person;
            row[1] = person.getAge();
            row[2] = person.getDisease();
            dtm.addRow(row);
        }  
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */

    @SuppressWarnings("unchecked")
      
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPreClinical = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSearchByName = new javax.swing.JButton();
        TxtSearch = new javax.swing.JTextField();

        tblPreClinical.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Age", "Disease "
            }
        ));
        jScrollPane1.setViewportView(tblPreClinical);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("Pre-Clinical Public Sector Work Area");

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSearchByName.setText("Search by Name :");
        btnSearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchByNameActionPerformed(evt);
            }
        });

        TxtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSearchByName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(94, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchByName)
                    .addComponent(TxtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        
        int selectedRow = tblPreClinical.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a person");
            return;
        }
        Person p = (Person) tblPreClinical.getValueAt(selectedRow, 0);
        system.getPersonDirectory().deletePerson(p);
        JOptionPane.showMessageDialog(null, "Person" + p.getName()+ " has been removed");

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddPersonJPanel aap = new AddPersonJPanel(userProcessContainer, system);
        userProcessContainer.add("ManageUserAccountPanel", aap);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
      
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblPreClinical.getSelectedRow();

        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(null,"Please select a row from the table first","Warning",JOptionPane.WARNING_MESSAGE);

        }
        else
        {
            Person p = (Person) tblPreClinical.getValueAt(selectedRow, 0);
            UpdateJPanel ujp = new UpdateJPanel(userProcessContainer, p);
            
            userProcessContainer.add("UpdateJPanel", ujp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
             
            
             

        }
       
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchByNameActionPerformed
        // TODO add your handling code here:
        
         if(TxtSearch.getText().equalsIgnoreCase(""))
        {
            JOptionPane.showMessageDialog(null, "Please Enter Person's Name");
        }
        else 
         {
          String name = TxtSearch.getText();
          Person p = system.getPersonDirectory().searchPerson(name);
          SearchPersonJPanel spjp = new SearchPersonJPanel(userProcessContainer, p);
          userProcessContainer.add("SearchPersonJPanel", spjp);
          CardLayout layout = (CardLayout) userProcessContainer.getLayout();
          layout.next(userProcessContainer);
    
         }
    }//GEN-LAST:event_btnSearchByNameActionPerformed

    private void TxtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSearchActionPerformed
        // TODO add your handling code here:
        
          
       
    }//GEN-LAST:event_TxtSearchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtSearch;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSearchByName;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPreClinical;
    // End of variables declaration//GEN-END:variables

}