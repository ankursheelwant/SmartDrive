/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.StateGovernor;

import BLL.EcoSystem;
import BLL.Network.Network;
import BLL.Person.Person;
import BLL.Person.VitalSign;
import BLL.Role.CityMayor;
import BLL.UserAccount.UserAccount;
import static UI.SmartDriveMain.validator;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ankur
 */
public class ManageNetworkPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageNetworkPanel
     */
    private EcoSystem system;
    public ManageNetworkPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        
        populateNetworkTable();
        populateComboBox();
    }

    private void populateNetworkTable() {
        DefaultTableModel model = (DefaultTableModel) networkJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            int flag=0;
            for(UserAccount userAccount:network.getUserAccountDirectory().getUserAccountList())
            {
                Object[] row = new Object[2];
                row[0] = network.getName();
                row[1] = userAccount.getPerson();
                model.addRow(row);
                flag=1;
            }
            if(flag==0)
            {
                Object[] row = new Object[2];
                row[0] = network.getName();
                model.addRow(row);
            }
        }
    }
    private void populateComboBox() {
        networkJComboBox.removeAllItems();
        
        for (Network network : system.getNetworkList()) {
            networkJComboBox.addItem(network);
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
        networkJTable = new javax.swing.JTable();
        jSplitPane1 = new javax.swing.JSplitPane();
        newEnterprisePanel = new javax.swing.JPanel();
        newNetworkLabel = new javax.swing.JLabel();
        networkNameLbl = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        addNetworkBtn = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        addEnterpriseAdminPanel = new javax.swing.JPanel();
        newEnterpriseLabel1 = new javax.swing.JLabel();
        selectNetworkLbl1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        networkAdminNameLbl = new javax.swing.JLabel();
        adminNameTextfield = new javax.swing.JTextField();
        addNetworkAdminBtn = new javax.swing.JButton();
        usernameLbl = new javax.swing.JLabel();
        usernameTextfield = new javax.swing.JTextField();
        passwordNameLbl = new javax.swing.JLabel();
        passwordTextfield = new javax.swing.JPasswordField();
        warningLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        networkJTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        networkJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Network Name", "Network Admin"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(networkJTable);

        jSplitPane1.setDividerLocation(260);
        jSplitPane1.setDividerSize(4);
        jSplitPane1.setResizeWeight(0.5);

        newEnterprisePanel.setBackground(new java.awt.Color(255, 255, 255));

        newNetworkLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newNetworkLabel.setText("Add new Network");

        networkNameLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        networkNameLbl.setText("Network Name:");

        nameJTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nameJTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedToNameTextField(evt);
            }
        });

        addNetworkBtn.setBackground(new java.awt.Color(255, 255, 255));
        addNetworkBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addNetworkBtn.setForeground(new java.awt.Color(0, 102, 153));
        addNetworkBtn.setText("Add Network");
        addNetworkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkBtnActionPerformed(evt);
            }
        });

        warningLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout newEnterprisePanelLayout = new javax.swing.GroupLayout(newEnterprisePanel);
        newEnterprisePanel.setLayout(newEnterprisePanelLayout);
        newEnterprisePanelLayout.setHorizontalGroup(
            newEnterprisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newEnterprisePanelLayout.createSequentialGroup()
                .addGroup(newEnterprisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newEnterprisePanelLayout.createSequentialGroup()
                        .addGroup(newEnterprisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newEnterprisePanelLayout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addComponent(addNetworkBtn))
                            .addGroup(newEnterprisePanelLayout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(newNetworkLabel))
                            .addGroup(newEnterprisePanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(networkNameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newEnterprisePanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        newEnterprisePanelLayout.setVerticalGroup(
            newEnterprisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newEnterprisePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newNetworkLabel)
                .addGap(41, 41, 41)
                .addGroup(newEnterprisePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkNameLbl)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(addNetworkBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setLeftComponent(newEnterprisePanel);

        addEnterpriseAdminPanel.setBackground(new java.awt.Color(255, 255, 255));

        newEnterpriseLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newEnterpriseLabel1.setText("Add Admin to Network");

        selectNetworkLbl1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        selectNetworkLbl1.setText("Select Network:");

        networkJComboBox.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        networkAdminNameLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        networkAdminNameLbl.setText("Admin Name:");

        adminNameTextfield.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        adminNameTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedToAddAdminTextfields(evt);
            }
        });

        addNetworkAdminBtn.setBackground(new java.awt.Color(255, 255, 255));
        addNetworkAdminBtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addNetworkAdminBtn.setForeground(new java.awt.Color(0, 102, 153));
        addNetworkAdminBtn.setText("Submit");
        addNetworkAdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNetworkAdminBtnActionPerformed(evt);
            }
        });

        usernameLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernameLbl.setText("Username:");

        usernameTextfield.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        usernameTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedToAddAdminTextfields(evt);
            }
        });

        passwordNameLbl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordNameLbl.setText("Password:");

        passwordTextfield.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                focusGainedToAddAdminTextfields(evt);
            }
        });

        warningLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        warningLabel1.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout addEnterpriseAdminPanelLayout = new javax.swing.GroupLayout(addEnterpriseAdminPanel);
        addEnterpriseAdminPanel.setLayout(addEnterpriseAdminPanelLayout);
        addEnterpriseAdminPanelLayout.setHorizontalGroup(
            addEnterpriseAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEnterpriseAdminPanelLayout.createSequentialGroup()
                .addGroup(addEnterpriseAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addEnterpriseAdminPanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(newEnterpriseLabel1))
                    .addGroup(addEnterpriseAdminPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(addEnterpriseAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addEnterpriseAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addEnterpriseAdminPanelLayout.createSequentialGroup()
                                    .addComponent(passwordNameLbl)
                                    .addGap(48, 48, 48)
                                    .addComponent(passwordTextfield))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addEnterpriseAdminPanelLayout.createSequentialGroup()
                                    .addComponent(usernameLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(addEnterpriseAdminPanelLayout.createSequentialGroup()
                                    .addComponent(networkAdminNameLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                    .addComponent(adminNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(addEnterpriseAdminPanelLayout.createSequentialGroup()
                                .addComponent(selectNetworkLbl1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(addEnterpriseAdminPanelLayout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(addNetworkAdminBtn))
                    .addGroup(addEnterpriseAdminPanelLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(warningLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        addEnterpriseAdminPanelLayout.setVerticalGroup(
            addEnterpriseAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addEnterpriseAdminPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newEnterpriseLabel1)
                .addGap(18, 18, 18)
                .addGroup(addEnterpriseAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectNetworkLbl1)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addEnterpriseAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(networkAdminNameLbl)
                    .addComponent(adminNameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addEnterpriseAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl)
                    .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addEnterpriseAdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordNameLbl)
                    .addComponent(passwordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(warningLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(addNetworkAdminBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jSplitPane1.setRightComponent(addEnterpriseAdminPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSplitPane1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addNetworkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkBtnActionPerformed
        // TODO add your handling code here:
        String name="";
        if(!nameJTextField.getText().trim().isEmpty() && validator.isValidString(nameJTextField.getText().trim()))
        {
            for(Network network:system.getNetworkList())
            {
                if(network.getName().equals(nameJTextField.getText()))
                {
                    warningLabel.setText("Network name is not available!");
                    return; 
                }
            }
            name= nameJTextField.getText();
            Network network = system.createAndAddNetwork(name);
            network.setName(name);
            populateNetworkTable();
            populateComboBox();
            nameJTextField.setText("");;
            JOptionPane.showMessageDialog(this,"Network has been created successfully!!","Done",JOptionPane.INFORMATION_MESSAGE);
            
        }
        else
        {
            warningLabel.setText("*Invalid Network name");
            nameJTextField.setBackground(Color.pink);
        }
    }//GEN-LAST:event_addNetworkBtnActionPerformed

    private void addNetworkAdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNetworkAdminBtnActionPerformed
        // TODO add your handling code here:
        Network network= (Network) networkJComboBox.getSelectedItem();
        int count=0;
        if(!usernameTextfield.getText().trim().isEmpty() && validator.isValidAlphaNumeric(usernameTextfield.getText().trim()))
        {
            count++;
        }
        else
        {
            usernameTextfield.setBackground(Color.pink);
            warningLabel1.setText("*Invalid input");
        }
        if(!String.valueOf(passwordTextfield.getPassword()).trim().isEmpty())
        {
            count++;
        }
        else
        {
            passwordTextfield.setBackground(Color.pink);
            warningLabel1.setText("*Invalid input");
        }
        if(!adminNameTextfield.getText().trim().isEmpty() && validator.isValidString(adminNameTextfield.getText().trim()))
        {
            count++;
        }
        else
        {
            adminNameTextfield.setBackground(Color.pink);
            warningLabel1.setText("*Invalid input");
        }
        if(count==3)
        {
            //check if username is used before, if exists following if will execute
            if(!network.getUserAccountDirectory().checkIfUsernameIsUnique(usernameTextfield.getText()))
            {
                warningLabel1.setText("Username is not available!");
                return;                
            }
            String username = usernameTextfield.getText();
            String password = String.valueOf(passwordTextfield.getPassword());
            String name = adminNameTextfield.getText();

            Person person = network.getPersonDirectory().createPerson(name);

            UserAccount account = network.getUserAccountDirectory().createUserAccount(username, password, person, new CityMayor());
            populateNetworkTable();
            usernameTextfield.setText("");
            passwordTextfield.setText("");
            adminNameTextfield.setText("");
            JOptionPane.showMessageDialog(this,"Admin has been created for "+network+" network!!","Done",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_addNetworkAdminBtnActionPerformed

    private void focusGainedToNameTextField(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGainedToNameTextField
        // TODO add your handling code here:
        warningLabel.setText("");
        validator.clearValidationMarkOnFocus(evt);
    }//GEN-LAST:event_focusGainedToNameTextField

    private void focusGainedToAddAdminTextfields(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_focusGainedToAddAdminTextfields
        // TODO add your handling code here:
        warningLabel1.setText("");
        validator.clearValidationMarkOnFocus(evt);
    }//GEN-LAST:event_focusGainedToAddAdminTextfields


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addEnterpriseAdminPanel;
    private javax.swing.JButton addNetworkAdminBtn;
    private javax.swing.JButton addNetworkBtn;
    private javax.swing.JTextField adminNameTextfield;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JLabel networkAdminNameLbl;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JTable networkJTable;
    private javax.swing.JLabel networkNameLbl;
    private javax.swing.JLabel newEnterpriseLabel1;
    private javax.swing.JPanel newEnterprisePanel;
    private javax.swing.JLabel newNetworkLabel;
    private javax.swing.JLabel passwordNameLbl;
    private javax.swing.JPasswordField passwordTextfield;
    private javax.swing.JLabel selectNetworkLbl1;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTextfield;
    private javax.swing.JLabel warningLabel;
    private javax.swing.JLabel warningLabel1;
    // End of variables declaration//GEN-END:variables
}