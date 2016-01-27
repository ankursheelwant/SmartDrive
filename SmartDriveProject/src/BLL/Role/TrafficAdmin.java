/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.Role;

import BLL.EcoSystem;
import BLL.Enterprise.Enterprise;
import BLL.Network.Network;
import BLL.Organization.Organization;
import BLL.UserAccount.UserAccount;
import UI.TrafficAdmin.TrafficAdminFrame;
import javax.swing.JFrame;

/**
 *
 * @author Ankur
 */
public class TrafficAdmin extends Role{
    
    @Override
    public JFrame createWorkArea(UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        JFrame jf=new TrafficAdminFrame(account, organization, enterprise, network, system);
        jf.setSize(820, 670);
        jf.setResizable(false);
       return jf;
    }
}
