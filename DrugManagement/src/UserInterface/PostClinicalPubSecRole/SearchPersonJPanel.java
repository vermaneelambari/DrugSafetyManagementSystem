/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.PostClinicalPubSecRole;

import Business.Person.Person;
import Business.PostClinicalPerson.PostClinicalPerson;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class SearchPersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SearchPersonJPanel
     */
    JPanel userProcessContainer;
    Person person;
    PostClinicalPerson p;

    SearchPersonJPanel(JPanel userProcessContainer, PostClinicalPerson p) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.p = p;
        this.person = person;
        populateSearchDetails();
    }

    private void populateSearchDetails() {

        jTextField1.setText(p.getSideEffects());
        txtSearchName.setText(p.getName());
        txtSearchAge.setText(String.valueOf(p.getAge()));
        txtSearchDisease.setText(p.getDisease());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSearchName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSearchAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSearchDisease = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText(" Person's Effects of Disease");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 509, 44));

        jLabel2.setText("Name: ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 134, -1, -1));

        txtSearchName.setEnabled(false);
        txtSearchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNameActionPerformed(evt);
            }
        });
        add(txtSearchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 131, 177, -1));

        jLabel3.setText("Age:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 172, -1, -1));

        txtSearchAge.setEnabled(false);
        add(txtSearchAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 169, 177, -1));

        jLabel4.setText("Disease:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 207, -1, -1));

        txtSearchDisease.setEnabled(false);
        add(txtSearchDisease, new org.netbeans.lib.awtextra.AbsoluteConstraints(219, 207, 177, 30));

        jLabel5.setText("Effect's of Disease:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 249, -1, -1));

        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 311, -1, -1));

        jTextField1.setEnabled(false);
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 180, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UserInterface/PostClinicalPubSecRole/UMH_L_DRWARD@1x-2.jpg"))); // NOI18N
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 890, 590));
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        PostClinicalPubSecJPanel pcpsj = (PostClinicalPubSecJPanel) component;

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtSearchAge;
    private javax.swing.JTextField txtSearchDisease;
    private javax.swing.JTextField txtSearchName;
    // End of variables declaration//GEN-END:variables
}
