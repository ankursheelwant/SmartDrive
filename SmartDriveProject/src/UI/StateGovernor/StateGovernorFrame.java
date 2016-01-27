/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.StateGovernor;

import BLL.EcoSystem;
import BLL.Enterprise.Enterprise;
import BLL.Network.Network;
import BLL.Organization.Organization;
import BLL.UserAccount.UserAccount;
import static UI.SmartDriveMain.brightness;
import static UI.SmartDriveMain.dB4OUtil;
import static UI.SmartDriveMain.hue;
import static UI.SmartDriveMain.saturation;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Ankur
 */
public class StateGovernorFrame extends javax.swing.JFrame {

    /**
     * Creates new form StateGovernorFrame
     */
    ManageNetworkPanel manageNetworkPanel;
    ManageEnterprisePanel manageEnterprisePanel;
    EcoSystem system;
    

    public StateGovernorFrame(UserAccount account, EcoSystem system) {
        initComponents();
        welcomeRoleLabel.setText(account.getPerson().getName());
        this.system=system;
        
        
        populateTree();
        manageNetworkBtnClicked();
    }

    public void populateTree() {
        
        DefaultTreeModel model = (DefaultTreeModel) State.getModel();

        
        
        ArrayList<Network> networkList = system.getNetworkList();
        ArrayList<Enterprise> enterpriseList;
        ArrayList<Organization> organizationList;
        Network network;
        Enterprise enterprise;
        Organization organization;

        DefaultMutableTreeNode networks = new DefaultMutableTreeNode("City Networks");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
        root.insert(networks, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode enterpriseNode;
        DefaultMutableTreeNode organizationNode;
        for (int i = 0; i < networkList.size(); i++) {
            network = networkList.get(i);
            networkNode = new DefaultMutableTreeNode(network.getName());
            networks.insert(networkNode, i);

            enterpriseList = network.getEnterpriseDirectory().getEnterpriseList();

            for (int j = 0; j < enterpriseList.size(); j++) {
                enterprise = enterpriseList.get(j);
                enterpriseNode = new DefaultMutableTreeNode(enterprise.getName());
                networkNode.insert(enterpriseNode, j);

                organizationList = enterprise.getOrganizationDirectory().getOrganizationList();
                for (int k = 0; k < organizationList.size(); k++) {
                    organization = organizationList.get(k);
                    organizationNode = new DefaultMutableTreeNode(organization.getName());
                    enterpriseNode.insert(organizationNode, k);
                }
            }
        }
        
        model.reload();
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
        tabbedPane = new javax.swing.JTabbedPane();
        manageSystemPanel = new javax.swing.JPanel();
        verticalSplitPane = new javax.swing.JSplitPane();
        treePanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        State = new javax.swing.JTree();
        stateGWorkAreaPanel = new javax.swing.JPanel();
        manageProcessContainer = new javax.swing.JPanel();
        manageNetworkBtn = new javax.swing.JButton();
        manageEnterpriseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("State Governor");

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

        manageSystemPanel.setBackground(new java.awt.Color(255, 255, 255));

        verticalSplitPane.setDividerLocation(200);
        verticalSplitPane.setDividerSize(2);

        treePanel.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(State);

        javax.swing.GroupLayout treePanelLayout = new javax.swing.GroupLayout(treePanel);
        treePanel.setLayout(treePanelLayout);
        treePanelLayout.setHorizontalGroup(
            treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );
        treePanelLayout.setVerticalGroup(
            treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 463, Short.MAX_VALUE)
        );

        verticalSplitPane.setLeftComponent(treePanel);

        stateGWorkAreaPanel.setBackground(new java.awt.Color(255, 255, 255));

        manageProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        manageProcessContainer.setLayout(new java.awt.CardLayout());

        manageNetworkBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageNetworkBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        manageNetworkBtn.setForeground(new java.awt.Color(0, 102, 153));
        manageNetworkBtn.setText("Manage Network");
        manageNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageNetworkBtnActionPerformed(evt);
            }
        });

        manageEnterpriseBtn.setBackground(new java.awt.Color(255, 255, 255));
        manageEnterpriseBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        manageEnterpriseBtn.setForeground(new java.awt.Color(0, 102, 153));
        manageEnterpriseBtn.setText("Manage Enterprise");
        manageEnterpriseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEnterpriseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout stateGWorkAreaPanelLayout = new javax.swing.GroupLayout(stateGWorkAreaPanel);
        stateGWorkAreaPanel.setLayout(stateGWorkAreaPanelLayout);
        stateGWorkAreaPanelLayout.setHorizontalGroup(
            stateGWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(manageProcessContainer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(stateGWorkAreaPanelLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(manageNetworkBtn)
                .addGap(80, 80, 80)
                .addComponent(manageEnterpriseBtn)
                .addContainerGap(113, Short.MAX_VALUE))
        );
        stateGWorkAreaPanelLayout.setVerticalGroup(
            stateGWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, stateGWorkAreaPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(stateGWorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageNetworkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageEnterpriseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(manageProcessContainer, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE))
        );

        verticalSplitPane.setRightComponent(stateGWorkAreaPanel);

        javax.swing.GroupLayout manageSystemPanelLayout = new javax.swing.GroupLayout(manageSystemPanel);
        manageSystemPanel.setLayout(manageSystemPanelLayout);
        manageSystemPanelLayout.setHorizontalGroup(
            manageSystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verticalSplitPane)
        );
        manageSystemPanelLayout.setVerticalGroup(
            manageSystemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(verticalSplitPane)
        );

        tabbedPane.addTab("Manage System", manageSystemPanel);

        horizontalSpiltPane.setRightComponent(tabbedPane);

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

    private void manageNetworkBtnClicked()
    {
        if(manageEnterprisePanel!=null)
        {
            manageEnterprisePanel.setVisible(false);
            manageProcessContainer.remove(manageEnterprisePanel);
            manageEnterprisePanel=null;
        }
        
        manageNetworkPanel=new ManageNetworkPanel(system);
        manageProcessContainer.add(manageNetworkPanel);
        manageNetworkBtn.setBackground(Color.getHSBColor(hue, saturation, brightness));        
        manageNetworkBtn.setForeground(Color.white);
        manageNetworkBtn.setEnabled(false);
        manageEnterpriseBtn.setEnabled(true);
        manageEnterpriseBtn.setBackground(Color.white);
        manageEnterpriseBtn.setForeground(Color.getHSBColor(hue, saturation, brightness));
    }
    private void manageNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageNetworkBtnActionPerformed
        // TODO add your handling code here:
        manageNetworkBtnClicked();
    }//GEN-LAST:event_manageNetworkBtnActionPerformed

    private void manageEnterpriseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEnterpriseBtnActionPerformed
        // TODO add your handling code here:

        if(manageNetworkPanel!=null)
        {
            manageNetworkPanel.setVisible(false);
            manageProcessContainer.remove(manageNetworkPanel);
            manageNetworkPanel=null;
        }
        manageEnterprisePanel=new ManageEnterprisePanel(system);
        manageProcessContainer.add(manageEnterprisePanel);
        manageEnterpriseBtn.setBackground(Color.getHSBColor(hue, saturation, brightness));        
        manageEnterpriseBtn.setForeground(Color.white);
        manageEnterpriseBtn.setEnabled(false);
        manageNetworkBtn.setEnabled(true);
        manageNetworkBtn.setBackground(Color.white);
        manageNetworkBtn.setForeground(Color.getHSBColor(hue, saturation, brightness));
    }//GEN-LAST:event_manageEnterpriseBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        dB4OUtil.storeSystem(system);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree State;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JSplitPane horizontalSpiltPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton manageEnterpriseBtn;
    private javax.swing.JButton manageNetworkBtn;
    private javax.swing.JPanel manageProcessContainer;
    private javax.swing.JPanel manageSystemPanel;
    private javax.swing.JPanel stateGWorkAreaPanel;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JPanel treePanel;
    private javax.swing.JSplitPane verticalSplitPane;
    private javax.swing.JLabel welcomeLabel;
    private javax.swing.JLabel welcomeRoleLabel;
    // End of variables declaration//GEN-END:variables
}
