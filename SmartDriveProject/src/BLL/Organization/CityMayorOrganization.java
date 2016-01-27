/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.Organization;

import BLL.Role.CityMayor;
import BLL.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class CityMayorOrganization extends Organization {

    public CityMayorOrganization() {
        super(Organization.Type.CityMayor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new CityMayor());
        return roles;
    }
    
}
