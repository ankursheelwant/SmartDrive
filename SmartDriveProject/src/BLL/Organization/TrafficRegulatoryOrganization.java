/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.Organization;

import BLL.Role.Role;
import BLL.Role.TrafficAdmin;
import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class TrafficRegulatoryOrganization extends Organization{

    public TrafficRegulatoryOrganization() {
        super(Organization.Type.TrafficAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new TrafficAdmin());
        return roles;
    }
    
}
