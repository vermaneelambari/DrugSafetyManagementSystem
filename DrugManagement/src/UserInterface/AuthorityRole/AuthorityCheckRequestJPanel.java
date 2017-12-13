/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AuthorityRole;

import Business.ClinicalReport.ClinicalReport;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.InsuranceOrganization;
import Business.Organization.Organization;
import Business.Organization.PostClinicalTrialOrganization;
import Business.Person.Person;
import Business.Request.Request;
import Business.Request.WorkRequest;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author user
 */
public class AuthorityCheckRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AuthorityCheckRequestJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Enterprise enterprise;
    EcoSystem system;
    Request request;
    Network network;

    AuthorityCheckRequestJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, WorkRequest request, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.request = request;
        this.network = network;
        valueSlider.setValue((int) request.getInterpretationScore());
        populateCombo();
        assignValues();
    }

    void populateCombo() {
        personCombo.removeAllItems();
        for (ClinicalReport c : request.getClinicalReportDirectory().clinicalReportDirectory) {
            personCombo.addItem(c.getPerson());
        }
    }

    void assignValues() {
        JTextField[] values = {scoreTxt1, scoreTxt2, scoreTxt3, scoreTxt4, scoreTxt5, scoreTxt6, scoreTxt7, scoreTxt8, scoreTxt9, scoreTxt10, scoreTxt11, scoreTxt12, scoreTxt13};
        Person p = (Person) personCombo.getSelectedItem();
        if (p != null) {
            for (ClinicalReport c : request.getClinicalReportDirectory().clinicalReportDirectory) {
                if (p.getName().equals(c.getPerson().getName())) {
                    for (int i = 0; i < c.getReportValue().size(); i++) {
                        values[i].setText(c.getReportValue().get(i));
                        if (i == 5) {
                            txt6.setText(c.getQuestion().get(i));
                        } else if (i == 6) {
                            txt7.setText(c.getQuestion().get(i));
                        } else if (i == 12) {
                            txt13.setText(c.getQuestion().get(i));
                        }
                    }
                    totalScoreTxt.setText(String.valueOf(c.getFinalReportValue()));
                }
            }
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

        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt4 = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt5 = new javax.swing.JTextArea();
        txt6 = new javax.swing.JLabel();
        txt7 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        txt8 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        txt9 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        txt10 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        txt11 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txt12 = new javax.swing.JTextArea();
        txt13 = new javax.swing.JLabel();
        scoreTxt1 = new javax.swing.JTextField();
        scoreTxt2 = new javax.swing.JTextField();
        scoreTxt3 = new javax.swing.JTextField();
        scoreTxt4 = new javax.swing.JTextField();
        scoreTxt5 = new javax.swing.JTextField();
        scoreTxt6 = new javax.swing.JTextField();
        scoreTxt7 = new javax.swing.JTextField();
        scoreTxt8 = new javax.swing.JTextField();
        scoreTxt9 = new javax.swing.JTextField();
        scoreTxt10 = new javax.swing.JTextField();
        scoreTxt11 = new javax.swing.JTextField();
        scoreTxt12 = new javax.swing.JTextField();
        scoreTxt13 = new javax.swing.JTextField();
        approveBtn = new javax.swing.JButton();
        denyBtn = new javax.swing.JButton();
        personCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        totalScoreTxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        valueSlider = new javax.swing.JSlider();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Final Score for request");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 340, 47));

        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 649, 70, 30));

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane6.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt1.setEditable(false);
        txt1.setBackground(new java.awt.Color(204, 255, 204));
        txt1.setColumns(20);
        txt1.setRows(5);
        txt1.setText("1. Are there previous conclusive reports on this reaction?\n");
        txt1.setAutoscrolls(false);
        txt1.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane6.setViewportView(txt1);

        add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 400, 70));

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt2.setEditable(false);
        txt2.setBackground(new java.awt.Color(204, 255, 204));
        txt2.setColumns(20);
        txt2.setRows(5);
        txt2.setText("2. Did the adverse event appear after the suspected drug \nwas administered?\n");
        txt2.setAutoscrolls(false);
        txt2.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane3.setViewportView(txt2);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 400, 70));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt3.setEditable(false);
        txt3.setBackground(new java.awt.Color(204, 255, 204));
        txt3.setColumns(20);
        txt3.setRows(5);
        txt3.setText("3. Did the adverse reaction improve when the \ndrug was discontinued or a specific \nantagonist was administered? ");
        txt3.setAutoscrolls(false);
        txt3.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane2.setViewportView(txt3);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 400, 70));

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane5.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt4.setEditable(false);
        txt4.setBackground(new java.awt.Color(204, 255, 204));
        txt4.setColumns(20);
        txt4.setRows(5);
        txt4.setText("4. Did the adverse reaction reappear when the drug \nwas readministered?\n");
        txt4.setAutoscrolls(false);
        txt4.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane5.setViewportView(txt4);

        add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 400, 70));

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt5.setEditable(false);
        txt5.setBackground(new java.awt.Color(204, 255, 204));
        txt5.setColumns(20);
        txt5.setRows(5);
        txt5.setText("5. Are there alternative causes (other than the drug) \nthat could on their own have caused the reaction?\n");
        txt5.setAutoscrolls(false);
        txt5.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(txt5);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 400, 70));
        add(txt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 250, 40));
        add(txt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 260, 40));

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt8.setEditable(false);
        txt8.setBackground(new java.awt.Color(204, 255, 204));
        txt8.setColumns(20);
        txt8.setRows(5);
        txt8.setText("8. Did the reaction reappear \nwhen a placebo was given?\n");
        txt8.setAutoscrolls(false);
        txt8.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane7.setViewportView(txt8);

        add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, 360, 70));

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt9.setEditable(false);
        txt9.setBackground(new java.awt.Color(204, 255, 204));
        txt9.setColumns(20);
        txt9.setRows(5);
        txt9.setText("9. Was the drug detected \nin the blood (or other fluids) \nin concentrations known to be toxic?\n");
        txt9.setAutoscrolls(false);
        txt9.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane8.setViewportView(txt9);

        add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 360, 70));

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt10.setEditable(false);
        txt10.setBackground(new java.awt.Color(204, 255, 204));
        txt10.setColumns(20);
        txt10.setRows(5);
        txt10.setText("10. Was the reaction more severe \nwhen the dose was increased, \nor less severe when the dose was decreased?\n");
        txt10.setAutoscrolls(false);
        txt10.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane9.setViewportView(txt10);

        add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 360, 70));

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt11.setEditable(false);
        txt11.setBackground(new java.awt.Color(204, 255, 204));
        txt11.setColumns(20);
        txt11.setRows(5);
        txt11.setText("11. Did the patient have a similar \nreaction to the same or similar drugs \nin any previous exposure?\n");
        txt11.setAutoscrolls(false);
        txt11.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane10.setViewportView(txt11);

        add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 400, 360, 70));

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        txt12.setEditable(false);
        txt12.setBackground(new java.awt.Color(204, 255, 204));
        txt12.setColumns(20);
        txt12.setRows(5);
        txt12.setText("12. Was the adverse event \nconfirmed by any objective evidence?\n");
        txt12.setAutoscrolls(false);
        txt12.setSelectedTextColor(new java.awt.Color(204, 204, 255));
        jScrollPane4.setViewportView(txt12);

        add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 470, 360, 70));
        add(txt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 560, 240, 40));

        scoreTxt1.setEditable(false);
        add(scoreTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, 100, 40));

        scoreTxt2.setEditable(false);
        add(scoreTxt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 100, 40));

        scoreTxt3.setEditable(false);
        add(scoreTxt3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 100, 40));

        scoreTxt4.setEditable(false);
        add(scoreTxt4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 100, 40));

        scoreTxt5.setEditable(false);
        scoreTxt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreTxt5ActionPerformed(evt);
            }
        });
        add(scoreTxt5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 480, 100, 40));

        scoreTxt6.setEditable(false);
        scoreTxt6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        add(scoreTxt6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, 100, 40));

        scoreTxt7.setEditable(false);
        scoreTxt7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        add(scoreTxt7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 100, 40));

        scoreTxt8.setEditable(false);
        add(scoreTxt8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 210, 100, 40));

        scoreTxt9.setEditable(false);
        add(scoreTxt9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 280, 100, 40));

        scoreTxt10.setEditable(false);
        add(scoreTxt10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 340, 100, 40));

        scoreTxt11.setEditable(false);
        add(scoreTxt11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 410, 100, 40));

        scoreTxt12.setEditable(false);
        add(scoreTxt12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 480, 100, 40));

        scoreTxt13.setEditable(false);
        add(scoreTxt13, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 560, 100, 40));

        approveBtn.setText("Approve Drug for Post Clinical Trial");
        approveBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });
        add(approveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 220, 40));

        denyBtn.setText("Deny Drug");
        denyBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        denyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyBtnActionPerformed(evt);
            }
        });
        add(denyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 650, 170, 40));

        personCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        personCombo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        personCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                personComboActionPerformed(evt);
            }
        });
        add(personCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 110, 30));

        jLabel2.setText("Select Person");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 90, 30));

        jLabel3.setText("Total Score");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 604, 100, 30));

        totalScoreTxt.setEditable(false);
        totalScoreTxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 153, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 0)));
        add(totalScoreTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 600, 100, 40));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        valueSlider.setBackground(new java.awt.Color(255, 255, 255));
        valueSlider.setFont(new java.awt.Font("Myanmar MN", 1, 14)); // NOI18N
        valueSlider.setForeground(new java.awt.Color(255, 255, 255));
        valueSlider.setMajorTickSpacing(1);
        valueSlider.setMaximum(15);
        valueSlider.setMinimum(-15);
        valueSlider.setPaintLabels(true);
        valueSlider.setPaintTicks(true);
        valueSlider.setSnapToTicks(true);
        valueSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        valueSlider.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(valueSlider, javax.swing.GroupLayout.DEFAULT_SIZE, 886, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(valueSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 920, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void scoreTxt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreTxt5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scoreTxt5ActionPerformed

    private void personComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_personComboActionPerformed
        assignValues();
    }//GEN-LAST:event_personComboActionPerformed

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult;
        if (request.getInterpretationScore() >= 9) {
            dialogResult = JOptionPane.showConfirmDialog(null, "Interpretation Score is > 9 .Do you still want to Approve and pass request to Post Clinical trial? ", "Warning", dialogButton);
        } else {
            dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to Approve and pass request to Post Clinical trial? ", "Warning", dialogButton);
        }
        if (dialogResult == JOptionPane.YES_OPTION) {
            request.setStatus("Approved for Post Clinical Trail");
            request.setReceiver(request.getSender());
            request.setSender(account);
            Organization org = null;
            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterPriseList()) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof PostClinicalTrialOrganization) {
                            if (network.getName().equals(n.getName())) {
                                org = o;
                                break;
                            }
                        }
                    }
                }
            }
            if (org != null) {
                org.getRequestList().getRequestList().add(request);
            }
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            AuthorityWorkAreaJPanel sysAdminwjp = (AuthorityWorkAreaJPanel) component;
            sysAdminwjp.populateTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_approveBtnActionPerformed

    private void denyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyBtnActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult;
        if (request.getInterpretationScore() < 9) {
            dialogResult = JOptionPane.showConfirmDialog(null, "Interpretation Score is < 9 .Do you still want to Deny the request? ", "Warning", dialogButton);
        } else {
            dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to Deny the drug? ", "Warning", dialogButton);
        }
        if (dialogResult == JOptionPane.YES_OPTION) {
            request.setStatus("Pre Clinical Trial Denied");
            request.setReceiver(request.getSender());
            request.setSender(account);
            request.setDrugValid(false);
            Organization org = null;
            for (Network n : system.getNetworkList()) {
                for (Enterprise e : n.getEnterpriseDirectory().getEnterPriseList()) {
                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        if (o instanceof InsuranceOrganization) {
                            if (network.getName().equals(n.getName())) {
                                org = o;
                                break;
                            }
                        }
                    }
                }
            }
            if (org != null) {
                org.getRequestList().getRequestList().add(request);
            }
            userProcessContainer.remove(this);
            Component[] componentArray = userProcessContainer.getComponents();
            Component component = componentArray[componentArray.length - 1];
            AuthorityWorkAreaJPanel sysAdminwjp = (AuthorityWorkAreaJPanel) component;
            sysAdminwjp.populateTable();
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_denyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton approveBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton denyBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JComboBox personCombo;
    private javax.swing.JTextField scoreTxt1;
    private javax.swing.JTextField scoreTxt10;
    private javax.swing.JTextField scoreTxt11;
    private javax.swing.JTextField scoreTxt12;
    private javax.swing.JTextField scoreTxt13;
    private javax.swing.JTextField scoreTxt2;
    private javax.swing.JTextField scoreTxt3;
    private javax.swing.JTextField scoreTxt4;
    private javax.swing.JTextField scoreTxt5;
    private javax.swing.JTextField scoreTxt6;
    private javax.swing.JTextField scoreTxt7;
    private javax.swing.JTextField scoreTxt8;
    private javax.swing.JTextField scoreTxt9;
    private javax.swing.JTextField totalScoreTxt;
    private javax.swing.JTextArea txt1;
    private javax.swing.JTextArea txt10;
    private javax.swing.JTextArea txt11;
    private javax.swing.JTextArea txt12;
    private javax.swing.JLabel txt13;
    private javax.swing.JTextArea txt2;
    private javax.swing.JTextArea txt3;
    private javax.swing.JTextArea txt4;
    private javax.swing.JTextArea txt5;
    private javax.swing.JLabel txt6;
    private javax.swing.JLabel txt7;
    private javax.swing.JTextArea txt8;
    private javax.swing.JTextArea txt9;
    private javax.swing.JSlider valueSlider;
    // End of variables declaration//GEN-END:variables
}
