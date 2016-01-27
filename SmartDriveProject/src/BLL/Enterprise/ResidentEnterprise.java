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
public class ResidentEnterprise extends Enterprise{
    
    public ResidentEnterprise(String name) {
        super(name, EnterpriseType.Resident);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
