/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import BLL.Person.Person;
import BLL.Person.VitalSign;
import BLL.Role.StateGovernor;
import BLL.UserAccount.UserAccount;

/**
 *
 * @author Ankur
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Person person = system.getPersonDirectory().createPerson("Jack Kennedy");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("s", "s", person, new StateGovernor());
        
        return system;
    }
}
