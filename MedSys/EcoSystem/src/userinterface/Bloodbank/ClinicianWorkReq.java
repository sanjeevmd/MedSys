/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Bloodbank;

import Business.Blood.BloodGroup;
import Business.Blood.BloodGroupList;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ClinicianOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BloodReqToNewBB;
import Business.WorkQueue.WorkRequest;
import static Logger.Logger.logger;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author harshi
 */
public class ClinicianWorkReq extends javax.swing.JPanel {

    /**
     * Creates new form ClinicianWorkReq
     */
    private JPanel userProcessContainer;
    private ClinicianOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private BloodGroup bloodgroup;
    private BloodGroupList bloodgrouplist;
    private EcoSystem ecosystem;
    private Network network;
    private Enterprise.EnterpriseType enterprisetype;
    private OrganizationDirectory organizationdirectory;

    public ClinicianWorkReq(JPanel userProcessContainer, BloodGroup bloodgroup, BloodGroupList bloodgrouplist, Enterprise enterprise, UserAccount userAccount, EcoSystem ecosystem) {
        logger.log(Level.INFO, "ClinicianWorkReq");

        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.bloodgroup = bloodgroup;
        this.bloodgrouplist = bloodgrouplist;
        this.network = network;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.enterprisetype = enterprisetype;
        this.organization = organization;
        this.organizationdirectory = organizationdirectory;

        populateBloodReqTable();
        populatereqItemsTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        refreshJButton = new javax.swing.JButton();
        manageEnt1 = new javax.swing.JLabel();
        manageEnt = new javax.swing.JLabel();
        assignJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        bloodReqTable = new javax.swing.JTable();
        btnAccept = new javax.swing.JButton();
        btnDecline = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        reqItemsTable = new javax.swing.JTable();
        manageEnt2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        manageEnt1.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        manageEnt1.setText("CLINICIAN REQUEST AREA");
        add(manageEnt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 250, -1));

        manageEnt.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        manageEnt.setText("Blood Requests");
        add(manageEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 140, -1));

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        bloodReqTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Group", "Requestor", "No of Units", "Request Status", "Assigned To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(bloodReqTable);
        if (bloodReqTable.getColumnModel().getColumnCount() > 0) {
            bloodReqTable.getColumnModel().getColumn(0).setResizable(false);
            bloodReqTable.getColumnModel().getColumn(1).setResizable(false);
            bloodReqTable.getColumnModel().getColumn(2).setResizable(false);
            bloodReqTable.getColumnModel().getColumn(3).setResizable(false);
            bloodReqTable.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 659, 143));

        btnAccept.setText("Accept");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, -1, -1));

        btnDecline.setText("Decline");
        btnDecline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeclineActionPerformed(evt);
            }
        });
        add(btnDecline, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, -1));

        reqItemsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Blood Group", "Requestor", "No of Units", "Request Status", "Assigned To"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(reqItemsTable);
        if (reqItemsTable.getColumnModel().getColumnCount() > 0) {
            reqItemsTable.getColumnModel().getColumn(0).setResizable(false);
            reqItemsTable.getColumnModel().getColumn(1).setResizable(false);
            reqItemsTable.getColumnModel().getColumn(2).setResizable(false);
            reqItemsTable.getColumnModel().getColumn(3).setResizable(false);
        }

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 659, 143));

        manageEnt2.setFont(new java.awt.Font("Tamil MN", 1, 18)); // NOI18N
        manageEnt2.setText("Requested Items");

        add(manageEnt2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 196, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void populateBloodReqTable() {
        logger.log(Level.INFO, "populateBloodReqTable --ClinicianWorkReq");

        DefaultTableModel model = (DefaultTableModel) bloodReqTable.getModel();

        model.setRowCount(0);

        for (Network network : ecosystem.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (enterprise.getEnterpriseType() == Enterprise.EnterpriseType.BloodBank && enterprise.getName().equals(this.enterprise.getName())) {
                    for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        for (WorkRequest workreq : organization.getWorkQueue().getWorkRequestList()) {
                           if(workreq.getClass().getName().contains("BloodReqToNewBB")){
                            Object[] row = new Object[5];
                            row[0] = ((BloodReqToNewBB) workreq);
                            row[1] = workreq.getSender().getEmployee().getName();
                            row[2] = ((BloodReqToNewBB) workreq).getReqUnits();
                            row[3] = workreq.getStatus();
                            try {
                                row[4] = workreq.getReceiver().getEmployee().getName();
                            } catch (NullPointerException e) {

                                row[4] = "No Assignee yet";
                            }
                            model.addRow(row);
                        }
                        }
                    }
                }
            }
        }
    }

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        logger.log(Level.INFO, "refreshJButtonActionPerformed --ClinicianWorkReq");

        populateBloodReqTable();
        populatereqItemsTable();


    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void populatereqItemsTable() {
        logger.log(Level.INFO, "populatereqItemsTable --ClinicianWorkReq");

        DefaultTableModel model = (DefaultTableModel) reqItemsTable.getModel();

        model.setRowCount(0);

        for (WorkRequest ua : this.userAccount.getWorkQueue().getWorkRequestList()) {
            if(ua.getClass().getName().contains("BloodReqToNewBB")){
            Object[] row = new Object[5];
            row[0] = ((BloodReqToNewBB) ua);
            row[1] = ua.getSender().getEmployee().getName();
            row[2] = ((BloodReqToNewBB) ua).getReqUnits();
            row[3] = ua.getStatus();
            try {
                row[4] = ua.getReceiver().getEmployee().getName();
            } catch (NullPointerException e) {
                row[4] = "No Assignee Yet";
            }
            model.addRow(row);
        }
        }

        populateBloodReqTable();

    }

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        logger.log(Level.INFO, "assignJButtonActionPerformed --ClinicianWorkReq");

        int selectedRow = bloodReqTable.getSelectedRow();
        int rowCount = bloodReqTable.getSelectedRowCount();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (rowCount > 1) {
            JOptionPane.showMessageDialog(null, "Please select only one row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest wq = (WorkRequest) bloodReqTable.getValueAt(selectedRow, 0);
//        if(wq.getReceiver()!=null){
//        JOptionPane.showMessageDialog(null, "Request has been processed earlier","warning",JOptionPane.WARNING_MESSAGE);
//        return;
//        }

        if (wq.getStatus().equals("In Progress")) {
            JOptionPane.showMessageDialog(null, "The request is already in process", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (wq.getStatus().equals("Accepted and Completed") || wq.getStatus().equals("Declined")) {
            JOptionPane.showMessageDialog(null, "Request has been completed earlier", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if ((wq).getStatus().equals("Pending")) {
            (wq).setReceiver(userAccount);
            (wq).setStatus(BloodReqToNewBB.REQUEST_PROGRESS);

            populateBloodReqTable();
            JOptionPane.showMessageDialog(null, "The request is now assigned to you! Kindly process it");
        }

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        logger.log(Level.INFO, "backJButtonActionPerformed --ClinicianWorkReq");

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ClinicianWorkAreaJPanel dwjp = (ClinicianWorkAreaJPanel) component;
        dwjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnDeclineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeclineActionPerformed
        // TODO add your handling code here:

        logger.log(Level.INFO, "btnDeclineActionPerformed --ClinicianWorkReq");

        int selectedRow = bloodReqTable.getSelectedRow();
        int rowCount = bloodReqTable.getSelectedRowCount();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (rowCount > 1) {
            JOptionPane.showMessageDialog(null, "Please select only one row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        WorkRequest wq = (WorkRequest) bloodReqTable.getValueAt(selectedRow, 0);
        if (wq.getReceiver().equals(userAccount)) {
            if (wq.getStatus().equals("Pending")) {
                JOptionPane.showMessageDialog(null, "The request has to be assigned first");
            } else if (wq.getStatus().equals("Accepted and Completed") || wq.getStatus().equals("Declined")) {
                JOptionPane.showMessageDialog(null, "The request has been processed earlier");
            } else {
                (wq).setReceiver(userAccount);
                (wq).setStatus(BloodReqToNewBB.REQUEST_REJECT);
                populateBloodReqTable();
                JOptionPane.showMessageDialog(null, "The request has been declined due to shortage of blood");

            }
        } else {
            JOptionPane.showMessageDialog(null, "The Request has to be processed by " + wq.getReceiver().getEmployee().getName());
        }
    }//GEN-LAST:event_btnDeclineActionPerformed

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
        logger.log(Level.INFO, "btnAcceptActionPerformed --ClinicianWorkReq");

        int selectedRow = bloodReqTable.getSelectedRow();
        int rowCount = bloodReqTable.getSelectedRowCount();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (rowCount > 1) {
            JOptionPane.showMessageDialog(null, "Please select only one row", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (rowCount == 1) {
            WorkRequest wq = (WorkRequest) bloodReqTable.getValueAt(selectedRow, 0);

            if (wq.getStatus().equals("Pending")) {
                JOptionPane.showMessageDialog(null, "The request has to be assigned first");
            } else if (wq.getStatus().equals("Accepted and Completed") || wq.getStatus().equals("Declined")) {
                JOptionPane.showMessageDialog(null, "The request has been processed earlier");
            } else {
                String reqbloodgroup = ((BloodReqToNewBB) wq).getBloodGroup().getBloodgroup();
                int AvailableUnits = Integer.parseInt(((BloodReqToNewBB) wq).getBloodGroup().getAvailableUnits());
                int BorrowedUnits = Integer.parseInt(((BloodReqToNewBB) wq).getReqUnits());
                for (BloodGroup bg : this.bloodgrouplist.getBloodGroupList()) {
                    if (bg.getBloodgroup().equals(reqbloodgroup)) {
                        if (Integer.parseInt(bg.getAvailableUnits()) > BorrowedUnits) {
                            String TotalUnits = String.valueOf(AvailableUnits + BorrowedUnits);
                            ((BloodReqToNewBB) wq).getBloodGroup().setAvailableUnits(TotalUnits);
                            bg.setAvailableUnits(String.valueOf((Integer.parseInt(bg.getAvailableUnits()) - BorrowedUnits)));
                            JOptionPane.showMessageDialog(null, "Request has been accepted");
                            wq.setStatus(BloodReqToNewBB.REQUEST_ACCEPT);
                            populateBloodReqTable();
                            break;
                        } else {
                            JOptionPane.showMessageDialog(null, "Available Blood Units are lesser than the requested units, Please Decline the Request");
                        }
                    }
                }
            }
        }

    }//GEN-LAST:event_btnAcceptActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable bloodReqTable;
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton btnDecline;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JLabel manageEnt2;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable reqItemsTable;
    // End of variables declaration//GEN-END:variables

}
