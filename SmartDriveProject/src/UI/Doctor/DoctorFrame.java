/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Doctor;

import BLL.EcoSystem;
import BLL.Enterprise.Enterprise;
import BLL.Network.Network;
import BLL.Organization.Organization;
import BLL.UserAccount.UserAccount;
import BLL.WorkQueue.RequestDoctorAppointment;
import BLL.WorkQueue.WorkRequest;
import static UI.SmartDriveMain.dB4OUtil;
import java.awt.CardLayout;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankur
 */
public class DoctorFrame extends javax.swing.JFrame {

    /**
     * Creates new form ResidentAdminFrame
     */
    EcoSystem system;
    Enterprise enterprise;
    UserAccount account;
    Organization organization;
    public DoctorFrame(UserAccount account,Organization organization, Enterprise enterprise,Network network, EcoSystem system) {
        initComponents();
        welcomeRoleLabel.setText(account.getPerson().getName());
        this.system=system;
        this.enterprise=enterprise;
        this.account=account;
        this.organization=organization;
       populateTable();
    }

    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        
        for(WorkRequest request : organization.getWorkQueue().getWorkRequestList()){
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getPerson().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getPerson().getName();
            row[3] = request.getStatus();
            row[4] = (RequestDoctorAppointment)request;
            
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

        horizontalSpiltPane = new javax.swing.JSplitPane();
        headerPanel = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        welcomeLabel = new javax.swing.JLabel();
        welcomeRoleLabel = new javax.swing.JLabel();
        mainPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        manageNetworkBtn = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Doctor");

        horizontalSpiltPane.setDividerLocation(100);
        horizontalSpiltPane.setDividerSize(1);
        horizontalSpiltPane.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        headerPanel.setBackground(new java.awt.Color(255, 255, 255));

        headerLabel.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(0, 102, 153));
        headerLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car.jpg"))); // NOI18N
        headerLabel.setText("Smart Drive");

        logoutBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.jpg"))); // NOI18N
        logoutBtn.setToolTipText("Logout and Close");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        welcomeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        welcomeLabel.setText("Welcome to Portal:");

        welcomeRoleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(headerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 491, Short.MAX_VALUE)
                        .addComponent(logoutBtn))
                    .addGroup(headerPanelLayout.createSequentialGroup()
                        .addComponent(welcomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(welcomeRoleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(headerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(welcomeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(welcomeRoleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        horizontalSpiltPane.setTopComponent(headerPanel);

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        manageNetworkBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageNetworkBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        manageNetworkBtn.setForeground(new java.awt.Color(0, 102, 153));
        manageNetworkBtn.setText("Approve Appointment");
        manageNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkBtnActionPerformed(evt);
            }
        });

        warningLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(manageNetworkBtn))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(manageNetworkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        horizontalSpiltPane.setRightComponent(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(horizontalSpiltPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(horizontalSpiltPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void manageNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkBtnActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            warningLabel.setText("Select a row first!!");
            return;
        }
        
        RequestDoctorAppointment request = (RequestDoctorAppointment)workRequestJTable.getValueAt(selectedRow, 0);
        request.setStatus("Approved");
        request.setReceiver(account);
        populateTable();
        
    }//GEN-LAST:event_manageNetworkBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JSplitPane horizontalSpiltPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton manageNetworkBtn;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel welcomeRoleLabel;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
