/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea.Network;

import Business.Network.Network;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Sumanth
 */
public class UpdateNetworkJPanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdateNetworkJPanel
     */
    JPanel userProcessContainer;
    Network network;
    public UpdateNetworkJPanel(JPanel userProcessContainer, Network network) {
        this.userProcessContainer = userProcessContainer;
        this.network = network;
        initComponents();
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
        addBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(vacName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 73, 130, 30));

        jLabel1.setText("Network Name");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 73, 90, 30));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 203, -1, -1));

        addBtn.setText("Update");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 133, 90, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Update Network");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, 220, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageNetworkJPanel sysAdminwjp = (ManageNetworkJPanel) component;
        sysAdminwjp.populateNetworkTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String name = vacName.getText();
        if(name.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter Network Name");
            return;
        }
        network.setName(name);
        JOptionPane.showMessageDialog(null, "Network Updated Successfully");
    }//GEN-LAST:event_addBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField vacName;
    // End of variables declaration//GEN-END:variables
}
