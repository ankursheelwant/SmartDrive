/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.Enterprise;

import BLL.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class HealthcareEnterprise extends Enterprise {

    public HealthcareEnterprise(String name) {
        super(name, EnterpriseType.Healthcare);
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
}
