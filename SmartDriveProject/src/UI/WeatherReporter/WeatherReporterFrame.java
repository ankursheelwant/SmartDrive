/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.WeatherReporter;

import UI.Doctor.*;
import BLL.EcoSystem;
import BLL.Enterprise.Enterprise;
import BLL.Network.Network;
import BLL.Organization.CitizenOrganization;
import BLL.Organization.Organization;
import BLL.UserAccount.UserAccount;
import BLL.WorkQueue.RequestDoctorAppointment;
import BLL.WorkQueue.WeatherWarningAlert;
import BLL.WorkQueue.WorkRequest;
import static UI.SmartDriveMain.dB4OUtil;
import java.awt.CardLayout;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankur
 */
public class WeatherReporterFrame extends javax.swing.JFrame {

    /**
     * Creates new form ResidentAdminFrame
     */
    EcoSystem system;
    Enterprise enterprise;
    UserAccount account;
    Organization organization;
    Network network;
    public WeatherReporterFrame(UserAccount account,Organization organization, Enterprise enterprise,Network network, EcoSystem system) {
        initComponents();
        welcomeRoleLabel.setText(account.getPerson().getName());
        this.system=system;
        this.enterprise=enterprise;
        this.account=account;
        this.organization=organization;
        this.network=network;
       
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
        weatherReportBtn = new javax.swing.JButton();
        weatherConditionComboBox = new javax.swing.JComboBox();
        selectWeatherLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Weather Reporter");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
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

        weatherReportBtn.setBackground(new java.awt.Color(255, 255, 255));
        weatherReportBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        weatherReportBtn.setForeground(new java.awt.Color(0, 102, 153));
        weatherReportBtn.setText("Report Weather");
        weatherReportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weatherReportBtnActionPerformed(evt);
            }
        });

        weatherConditionComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        weatherConditionComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Normal", "Abnormal" }));

        selectWeatherLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        selectWeatherLbl.setText("Select Weather Condition:");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(selectWeatherLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(weatherConditionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(weatherReportBtn)
                        .addGap(131, 131, 131))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectWeatherLbl)
                    .addComponent(weatherConditionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(weatherReportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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

    private void weatherReportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weatherReportBtnActionPerformed
        // TODO add your handling code here:
        Object o=weatherConditionComboBox.getSelectedItem();
        WeatherWarningAlert weatherWarningAlert=WeatherWarningAlert.getInstance();
        weatherWarningAlert.setMessage("Weather forecast");
        Date d=new Date();
        weatherWarningAlert.setRequestDate(d);
        weatherWarningAlert.setSender(account);
        if(String.valueOf(o).equals("Normal"))
        {
            weatherWarningAlert.setIsWeatherGood(true);
            weatherWarningAlert.setStatus("Normal weather");
        }
        else
        {
            weatherWarningAlert.setIsWeatherGood(false);
            weatherWarningAlert.setStatus("Harsh weather");
        }
        for(Enterprise ent:network.getEnterpriseDirectory().getEnterpriseList())
        {
            for(Organization org:ent.getOrganizationDirectory().getOrganizationList())
            {
                if(org instanceof CitizenOrganization)
                {
                    org.getWorkQueue().getWorkRequestList().add(weatherWarningAlert);
                    for(UserAccount ua:org.getUserAccountDirectory().getUserAccountList())
                    {
                        ua.getWorkQueue().getWorkRequestList().add(weatherWarningAlert);
                    }
                }
            }
        }
    }//GEN-LAST:event_weatherReportBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JSplitPane horizontalSpiltPane;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel selectWeatherLbl;
    private javax.swing.JComboBox weatherConditionComboBox;
    private javax.swing.JButton weatherReportBtn;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel welcomeRoleLabel;
    // End of variables declaration//GEN-END:variables
}
