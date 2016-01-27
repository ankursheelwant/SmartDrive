/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.Organization;

import BLL.Role.Doctor;
import BLL.Role.HealthcareAdmin;
import BLL.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class HealthcareAdminOrganization extends Organization{

    public HealthcareAdminOrganization() {
        super(Organization.Type.HealthcareAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HealthcareAdmin());
        return roles;
    }
    
}
