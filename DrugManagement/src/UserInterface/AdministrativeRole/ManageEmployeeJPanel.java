/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdministrativeRole;

import Business.Disease.Disease;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Vaccine.Vaccine;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class ManageEmployeeJPanel extends javax.swing.JPanel {

    private OrganizationDirectory organizationDir;
    private JPanel userProcessContainer;
    Enterprise enterprise;
    EcoSystem system;

    /**
     * Creates new form ManageOrganizationJPanel
     */
    public ManageEmployeeJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDir, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDir = organizationDir;
        this.enterprise = enterprise;
        this.system = system;
        populateOrganizationComboBox();
        populateOrganizationEmpComboBox();
    }

    public void populateVaccineCombo() {
        diseaseCatalogBox.removeAllItems();
        for (Disease v : system.getDiseaseCatalog().getDiseaseCatalog()) {
            diseaseCatalogBox.addItem(v);
        }
    }

    public void populateOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.DrugManufacturing)) {
            pharmaPanel.setVisible(true);
            populateVaccineCombo();
        } else {
            pharmaPanel.setVisible(false);
        }

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationJComboBox.addItem(organization);
        }
    }

    public void populateOrganizationEmpComboBox() {
        organizationEmpJComboBox.removeAllItems();

        for (Organization organization : organizationDir.getOrganizationList()) {
            organizationEmpJComboBox.addItem(organization);
        }
    }

    public void populateTable(Organization organization) {
        DefaultTableModel model = (DefaultTableModel) organizationJTable.getModel();

        model.setRowCount(0);

        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[1];
            row[0] = employee;
            model.addRow(row);
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
        organizationJTable = new javax.swing.JTable();
        addJButton = new javax.swing.JButton();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        organizationEmpJComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        remobeBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        pharmaPanel = new javax.swing.JPanel();
        vaccineLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        diseaseCatalogBox = new javax.swing.JComboBox();
        vaccinetxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        organizationJTable.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 204), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 51)));
        organizationJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(organizationJTable);
        if (organizationJTable.getColumnModel().getColumnCount() > 0) {
            organizationJTable.getColumnModel().getColumn(0).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 82, 610, 90));

        addJButton.setText("Create Employee");
        addJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 255, 204), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 51)));
        addJButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addJButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addJButtonMouseExited(evt);
            }
        });
        addJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addJButtonActionPerformed(evt);
            }
        });
        add(addJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 100, 30));

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 51)));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });
        add(organizationJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 216, -1));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Organization");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 204), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 51)));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 70, 30));

        nameJTextField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 153), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 190, -1));

        organizationEmpJComboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        organizationEmpJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationEmpJComboBoxActionPerformed(evt);
            }
        });
        add(organizationEmpJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 190, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Organization");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 50, -1));

        remobeBtn.setText("Delete Employee");
        remobeBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 204), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 51)));
        remobeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remobeBtnActionPerformed(evt);
            }
        });
        add(remobeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 180, 30));

        updateBtn.setText("Update");
        updateBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 153), new java.awt.Color(255, 255, 102), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, 50, 30));

        vaccineLabel.setText("Disease Catalog");

        jLabel2.setText("Vaccine Name:");

        diseaseCatalogBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 153), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 0)));
        diseaseCatalogBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diseaseCatalogBoxActionPerformed(evt);
            }
        });

        vaccinetxt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 204, 153), new java.awt.Color(255, 255, 0), new java.awt.Color(255, 255, 51), new java.awt.Color(255, 255, 0)));

        javax.swing.GroupLayout pharmaPanelLayout = new javax.swing.GroupLayout(pharmaPanel);
        pharmaPanel.setLayout(pharmaPanelLayout);
        pharmaPanelLayout.setHorizontalGroup(
            pharmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pharmaPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pharmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(vaccineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pharmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(diseaseCatalogBox, 0, 190, Short.MAX_VALUE)
                    .addComponent(vaccinetxt))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pharmaPanelLayout.setVerticalGroup(
            pharmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pharmaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pharmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vaccineLabel)
                    .addComponent(diseaseCatalogBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pharmaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vaccinetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        add(pharmaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 340, 110));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("Manage Employee ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 130, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void addJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addJButtonActionPerformed
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        boolean check = false;
        if (organization == null) {
            JOptionPane.showMessageDialog(null, "Please create Organization");
            return;
        }
        String name = nameJTextField.getText();
        Disease d = null;
        if (name.trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Please enter name");
            return;
        }
        if ( !(name.matches("[a-zA-Z]+"))) {
                  JOptionPane.showMessageDialog(null,"Please insert only characters for Name.");
                  return;
            }
        if (enterprise.getEnterpriseType().equals(Enterprise.EnterpriseType.DrugManufacturing)) {
            check = true;
        }
        if (check) {
            d = (Disease) diseaseCatalogBox.getSelectedItem();
            if (d == null) {
                JOptionPane.showMessageDialog(null, "Please create Disease");
                return;
            }
            String vname = vaccinetxt.getText();
            if (vname.trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Please enter Vaccine name");
                return;
            }
            if ( !(vname.matches("^[a-zA-Z0-9]+$"))) {
                  JOptionPane.showMessageDialog(null,"No Special characters for Vaccine Name");
                  return;
            }
        }
        Employee e = organization.getEmployeeDirectory().createEmployee(name);
        if (check) {
            e.setDisease(d);
            Vaccine v = new Vaccine();
            v.setvName(vaccinetxt.getText());
            e.setVaccine(v);
            vaccinetxt.setText("");
            nameJTextField.setText("");
        }
        populateTable(organization);
        JOptionPane.showMessageDialog(null, "Employee created successfully");
    }//GEN-LAST:event_addJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null) {
            populateTable(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void organizationEmpJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationEmpJComboBoxActionPerformed
        /*Organization org = (Organization) organizationEmpJComboBox.getSelectedItem();
        if (org != null) {
            if (!org.toString().equals(Organization.Type.InventoryDistributor.getValue()) && !org.toString().equals(Organization.Type.Clinic.getValue()) && !org.toString().equals(Organization.Type.InventorySupplier.getValue())) {
                vaccineLabel.setVisible(true);
                diseaseCatalogBox.setVisible(true);
                populateVaccineCombo();
            } else {
                vaccineLabel.setVisible(false);
                diseaseCatalogBox.setVisible(false);
            }
        }*/
    }//GEN-LAST:event_organizationEmpJComboBoxActionPerformed

    private void diseaseCatalogBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diseaseCatalogBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diseaseCatalogBoxActionPerformed

    private void remobeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remobeBtnActionPerformed
        int selectedRow = organizationJTable.getSelectedRow();
        Organization o = (Organization) organizationJComboBox.getSelectedItem();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the Employee ", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Employee e = (Employee) organizationJTable.getValueAt(selectedRow, 0);
                o.getEmployeeDirectory().removeEmployee(e);
                populateTable(o);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select Any Row", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_remobeBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRow = organizationJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
            return;
        }
        Organization organization = (Organization) organizationEmpJComboBox.getSelectedItem();
        Employee e = (Employee) organizationJTable.getValueAt(selectedRow, 0);
        UpdateEmployeeJpanel manageVaccineCatalogJPanel = new UpdateEmployeeJpanel(userProcessContainer, e, organization);
        userProcessContainer.add("UpdateNetworkJPanel", manageVaccineCatalogJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void addJButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJButtonMouseEntered
        // TODO add your handling code here:
        
      this.addJButton.setBackground(Color.cyan); 

    }//GEN-LAST:event_addJButtonMouseEntered

    private void addJButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addJButtonMouseExited
        // TODO add your handling code here:
            
     this.addJButton.setBackground(Color.lightGray); 

    }//GEN-LAST:event_addJButtonMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox diseaseCatalogBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationEmpJComboBox;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTable organizationJTable;
    private javax.swing.JPanel pharmaPanel;
    private javax.swing.JButton remobeBtn;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel vaccineLabel;
    private javax.swing.JTextField vaccinetxt;
    // End of variables declaration//GEN-END:variables
}
