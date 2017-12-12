/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea.Disease;

import Business.Disease.Disease;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class ManageDiseaseCatalog extends javax.swing.JPanel {

    /**
     * Creates new form ManageDiseaseCatalog
     */
    
    JPanel userProcessContainer;
    EcoSystem system;
    public ManageDiseaseCatalog(JPanel userProcessContainer, EcoSystem system) {
       initComponents(); 
       this.userProcessContainer = userProcessContainer;
       this.system = system;
       populateTable();
    }
    
    void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) vaccineJTable.getModel();
        dtm.setRowCount(0);
        for(Disease v:system.getDiseaseCatalog().getDiseaseCatalog()){
            Object[] row = new Object[1];
            row[0] = v;
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
        vaccineJTable = new javax.swing.JTable();
        delBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        updBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vaccineJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disease Name"
            }
        ));
        jScrollPane1.setViewportView(vaccineJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 690, 120));

        delBtn.setText("Delete Disease");
        delBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        delBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delBtnMouseEntered(evt);
            }
        });
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 200, 150, 30));

        addBtn.setText("Add Disease");
        addBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBtnMouseEntered(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 110, 30));

        updBtn.setText("Update Disease");
        updBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        updBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updBtnMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updBtnMouseEntered(evt);
            }
        });
        updBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updBtnActionPerformed(evt);
            }
        });
        add(updBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 150, 30));

        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 153), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 80, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Manage Disease Catalog ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SystemAdminWorkArea/Disease/being-sick-filled.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 130, 200));
    }// </editor-fold>//GEN-END:initComponents

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        int selectedRow = vaccineJTable.getSelectedRow();
        if(selectedRow>=0){
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null,"Would you like to delete the Disease ", "Warning", dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION){
                Disease disease = (Disease) vaccineJTable.getValueAt(selectedRow,0);
                system.getDiseaseCatalog().removeDisease(disease);
                populateTable();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please Select Any Row","Warning",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        AddDiseaseJPanel manageVaccineCatalogJPanel = new AddDiseaseJPanel(userProcessContainer, system);
        userProcessContainer.add("AddDiseaseJPanel", manageVaccineCatalogJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addBtnActionPerformed

    private void updBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updBtnActionPerformed
        int selectedRow = vaccineJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
            return;
        }
        Disease disease = (Disease) vaccineJTable.getValueAt(selectedRow, 0);
        UpdateDiseaseJPanel manageVaccineCatalogJPanel = new UpdateDiseaseJPanel(userProcessContainer, disease);
        userProcessContainer.add("UpdateDiseaseJPanel", manageVaccineCatalogJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseEntered
        // TODO add your handling code here
        this.addBtn.setBackground(Color.green); 

    }//GEN-LAST:event_addBtnMouseEntered

    private void addBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseExited
        // TODO add your handling code here:
                                   this.addBtn.setBackground(Color.lightGray); 

    }//GEN-LAST:event_addBtnMouseExited

    private void delBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delBtnMouseEntered
        // TODO add your handling code here:
                this.delBtn.setBackground(Color.red); 

        
    }//GEN-LAST:event_delBtnMouseEntered

    private void delBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delBtnMouseExited
        // TODO add your handling code here:
        
                this.delBtn.setBackground(Color.lightGray); 

    }//GEN-LAST:event_delBtnMouseExited

    private void updBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updBtnMouseEntered
        // TODO add your handling code here:
        
                        this.updBtn.setBackground(Color.YELLOW); 

    }//GEN-LAST:event_updBtnMouseEntered

    private void updBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updBtnMouseExited
        // TODO add your handling code here:
        
                        this.updBtn.setBackground(Color.lightGray); 

    }//GEN-LAST:event_updBtnMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton delBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton updBtn;
    private javax.swing.JTable vaccineJTable;
    // End of variables declaration//GEN-END:variables
}
