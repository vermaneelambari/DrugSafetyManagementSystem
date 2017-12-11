/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea.Enterprise;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sumanth
 */
public class UpdateEnterpriseUserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateEnterpriseUserJPanel
     */
    JPanel userProcessContainer;
    UserAccount u;
    UpdateEnterpriseUserJPanel(JPanel userProcessContainer, UserAccount u) {
       initComponents();
       this.userProcessContainer = userProcessContainer;
       this.u = u;
       vacName.setText(u.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vacName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(vacName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 130, 30));

        jLabel1.setText("UserName:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 90, 30));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        btnUpdate.setText("Update");
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnUpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnUpdateMouseExited(evt);
            }
        });
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 90, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Update Enterprise Admin");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 310, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/SystemAdminWorkArea/Disease/rsz_approve-and-update-filled.png"))); // NOI18N
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, -10, 130, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageEnterpriseAdminJPanel sysAdminwjp = (ManageEnterpriseAdminJPanel) component;
        sysAdminwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String name = vacName.getText();
        if(name.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter User Name");
            return;
        }
        if ( !(name.matches("[a-zA-Z0-9]+"))) {
                  JOptionPane.showMessageDialog(null,"Please insert only characters for UserName.");
                  return;
            }
        u.setUsername(name);
        JOptionPane.showMessageDialog(null, "Username Updated Successfully");
        vacName.setText("");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnUpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseEntered
        // TODO add your handling code here:
        
               this.btnUpdate.setBackground(Color.YELLOW); 

    }//GEN-LAST:event_btnUpdateMouseEntered

    private void btnUpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseExited
        // TODO add your handling code here:
        
               this.btnUpdate.setBackground(Color.lightGray); 

    }//GEN-LAST:event_btnUpdateMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField vacName;
    // End of variables declaration//GEN-END:variables
}
