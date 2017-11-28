/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SystemAdminWorkArea.Enterprise;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import UserInterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sumanth
 */
public class ManageEnterpriseJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;

        populateTable();
        populateComboBox();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterPriseList()) {
                Object[] row = new Object[3];
                row[0] = enterprise;
                row[1] = network.getName();
                row[2] = enterprise.getEnterpriseType().getValue();

                model.addRow(row);
            }
        }
    }

    public void populateComboBox() {
        networkJComboBox.removeAllItems();
        enterpriseTypeJComboBox.removeAllItems();

        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
        }

        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            enterpriseTypeJComboBox.addItem(type);
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Enterprise Name", "Network", "Type"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 58, 523, 95));

        jLabel1.setText("Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, -1, -1));

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 136, -1));

        jLabel2.setText("Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));
        add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 136, -1));

        jLabel3.setText("Enterprise Type");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(enterpriseTypeJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 136, -1));

        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 360, -1, -1));

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));

        delBtn.setText("Delete");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();

        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = nameJTextField.getText();
        if(name.trim().length()==0){
            JOptionPane.showMessageDialog(null, "Please enter Name");
            return;
        }
        
        for(Enterprise e:network.getEnterpriseDirectory().getEnterPriseList()){
            if(e.getName().equals(name)){
                JOptionPane.showMessageDialog(null, "Enterprise name already present");
                return;
            }
        }

        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterPrise(name, type);
        JOptionPane.showMessageDialog(null, "Enterprise name added successfully");
        nameJTextField.setText("");
        populateTable();

    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
            return;
        }
        Enterprise e = (Enterprise) enterpriseJTable.getValueAt(selectedRow, 0);
        UpdateEnterpriseJpanel manageVaccineCatalogJPanel = new UpdateEnterpriseJpanel(userProcessContainer, e);
        userProcessContainer.add("UpdateNetworkJPanel", manageVaccineCatalogJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updateBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        int selectedRow = enterpriseJTable.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please Select Any Row");
            return;
        }
        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise e = (Enterprise) enterpriseJTable.getValueAt(selectedRow, 0);
        network.getEnterpriseDirectory().deleteEnterprise(e);
        JOptionPane.showMessageDialog(null, "Enterprise deleted successfully");
        populateTable();
        populateComboBox();
    }//GEN-LAST:event_delBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton delBtn;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitJButton;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
