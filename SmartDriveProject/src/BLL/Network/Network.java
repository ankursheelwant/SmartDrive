/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.Network;

import BLL.DrivingData.DriveDirectory;
import BLL.Enterprise.EnterpriseDirectory;
import BLL.Organization.Organization;
import BLL.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author Ankur
 */
public class Network extends Organization{
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private DriveDirectory driveDirectory;

    public Network(String name) {
        super(name);
        enterpriseDirectory = new EnterpriseDirectory();
        driveDirectory=new DriveDirectory();
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        //Need to verify
        
        
        
        return null;
    }

    public synchronized DriveDirectory getDriveDirectory() {
        return driveDirectory;
    }

    public void setDriveDirectory(DriveDirectory driveDirectory) {
        this.driveDirectory = driveDirectory;
    }
}
