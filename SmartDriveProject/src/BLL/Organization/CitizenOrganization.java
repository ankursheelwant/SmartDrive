/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.Organization;

import BLL.Role.Citizen;
import BLL.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class CitizenOrganization extends Organization{

    public CitizenOrganization() {
        super(Organization.Type.Citizen.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new Citizen());
        return roles;
    }
    
}
