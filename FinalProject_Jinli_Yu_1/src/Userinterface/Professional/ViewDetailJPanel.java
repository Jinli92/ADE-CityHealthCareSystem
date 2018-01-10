/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Userinterface.Professional;

import Userinterface.StateOfficial.*;
import Business.EcoSystem;
import Business.Employee.Citizen;
import Business.Employee.Employee;
import Business.Enterprise.CitizenEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.VitalSign.VitalSign;
import Business.VitalSign.VitalSignHistory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jinliyu
 */
public class ViewDetailJPanel extends javax.swing.JPanel {

    private JPanel upc;
    private Network network;

    /**
     * Creates new form ViewDetailJPanel
     */
    public ViewDetailJPanel(JPanel upc, Network network) {
        initComponents();
        this.upc = upc;
        this.network = network;

        populateCombo();
    }

    public void populateCombo() {
        combobox.removeAllItems();
        combobox.addItem("most recent");
        combobox.addItem("previous one");
    }

    public double calculateBp() {
        double totalbp = 0;
        int num = 0;
        double avebp = 0;
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof CitizenEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
                        Citizen c = (Citizen) employee;
                        VitalSignHistory vsh = c.getVitalSignHistory();
                        VitalSign vs = vsh.getVitalSignHistory().get(vsh.getVitalSignHistory().size() - 1);

                        totalbp = totalbp + vs.getSysBloodPressure();
                        num = num + 1;

                    }
                }
            }
        }

        avebp = totalbp / num;
        return avebp;

    }

    public double calculateBp1() {
        double totalbp = 0;
        int num = 0;
        double avebp = 0;
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof CitizenEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
                        Citizen c = (Citizen) employee;
                        VitalSignHistory vsh = c.getVitalSignHistory();
                        VitalSign vs = vsh.getVitalSignHistory().get(vsh.getVitalSignHistory().size() - 2);

                        totalbp = totalbp + vs.getSysBloodPressure();
                        num = num + 1;

                    }
                }
            }
        }

        avebp = totalbp / num;
        return avebp;

    }

    public double calculateBMI() {
        double totalbmi = 0;
        int num = 0;
        double avebmi = 0;
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof CitizenEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
                        Citizen c = (Citizen) employee;
                        VitalSignHistory vsh = c.getVitalSignHistory();
                        VitalSign vs = vsh.getVitalSignHistory().get(vsh.getVitalSignHistory().size() - 1);
                        if (c.getAge() > 18 && c.getAge() < 70) {
                            totalbmi = totalbmi + vs.getBmi();
                            num = num + 1;
                        }
                    }
                }
            }
        }
        avebmi = totalbmi / num;
        return avebmi;
    }

    public double calculateBMI1() {
        double totalbmi = 0;
        int num = 0;
        double avebmi = 0;
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof CitizenEnterprise) {
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()) {
                        Citizen c = (Citizen) employee;
                        VitalSignHistory vsh = c.getVitalSignHistory();
                        VitalSign vs = vsh.getVitalSignHistory().get(vsh.getVitalSignHistory().size() - 2);
                        if (c.getAge() > 18 && c.getAge() < 70) {
                            totalbmi = totalbmi + vs.getBmi();
                            num = num + 1;
                        }
                    }
                }
            }
        }
        avebmi = totalbmi / num;
        return avebmi;
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof CitizenEnterprise) {
                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (Employee employee : o.getEmployeeDirectory().getEmployeeList()) {
                        Citizen c = (Citizen) employee;
                        VitalSignHistory vsh = c.getVitalSignHistory();
                        VitalSign vs = vsh.getVitalSignHistory().get(vsh.getVitalSignHistory().size() - 1);
                        Object[] row = new Object[6];
                        row[0] = c.getName();
                        row[1] = vs.getHeartRate();
                        row[2] = vs.getSysBloodPressure();
                        row[3] = vs.getWeight();
                        row[4] = vs.getIsDiabete();
                        row[5] = vs.getTimestamp();

                        model.addRow(row);

                    }
                }
            }
        }
    }

    public void populateTable1() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise instanceof CitizenEnterprise) {
                for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    for (Employee employee : o.getEmployeeDirectory().getEmployeeList()) {
                        Citizen c = (Citizen) employee;
                        VitalSignHistory vsh = c.getVitalSignHistory();
                        VitalSign vs = vsh.getVitalSignHistory().get(vsh.getVitalSignHistory().size() - 2);
                        Object[] row = new Object[6];
                        row[0] = c.getName();
                        row[1] = vs.getHeartRate();
                        row[2] = vs.getSysBloodPressure();
                        row[3] = vs.getWeight();
                        row[4] = vs.getIsDiabete();
                        row[5] = vs.getTimestamp();

                        model.addRow(row);

                    }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtBp = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtbmi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        combobox = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "HeartRate", "SysBloodPressure", "Weight", "Is Diabete", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("Average:");

        jLabel4.setText("Sys Blood Pressure:");

        jLabel1.setText("BMI:");

        jLabel2.setFont(new java.awt.Font("Malayalam MN", 0, 18)); // NOI18N
        jLabel2.setText("Health Conditions collection Result:");

        jLabel5.setText("(Age between 18 and 70)");

        jButton1.setText("<<back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        combobox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton2.setText("OK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Choose which result you want to view");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(46, 46, 46)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBp, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                            .addComponent(txtbmi))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(txtbmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        upc.remove(this);
        CardLayout layout = (CardLayout) upc.getLayout();
        layout.previous(upc);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String time = (String) combobox.getSelectedItem();
        if (time.equals("most recent")) {

            populateTable();
            double AveBp = calculateBp();
            double AveBmi = calculateBMI();
            txtBp.setText(String.valueOf(AveBp));
            txtbmi.setText(String.valueOf(AveBmi));
        } else if (time.equals("previous one")) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise instanceof CitizenEnterprise) {
                    for (Organization o : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        for (Employee employee : o.getEmployeeDirectory().getEmployeeList()) {
                            Citizen c = (Citizen) employee;
                            Citizen ci = (Citizen) employee;
                            VitalSignHistory vsh = ci.getVitalSignHistory();
                            if (vsh.getVitalSignHistory().size() < 2) {
                                JOptionPane.showMessageDialog(null, "No record!", "Information", JOptionPane.INFORMATION_MESSAGE);
                                break;
                            } else {
                                populateTable1();
                                double AveBp = calculateBp1();
                                double AveBmi = calculateBMI1();
                                txtBp.setText(String.valueOf(AveBp));
                                txtbmi.setText(String.valueOf(AveBmi));
                            }
                        }
                    }
                }
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combobox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBp;
    private javax.swing.JTextField txtbmi;
    // End of variables declaration//GEN-END:variables
}
