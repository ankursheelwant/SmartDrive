/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.Organization;

import BLL.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Ankur
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.WeatherReporter.getValue())){
            organization = new WeatherServicesOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Citizen.getValue())){
            organization = new CitizenOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HealthcareAdmin.getValue())){
            organization = new HealthcareAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.TrafficAdmin.getValue())){
            organization = new TrafficRegulatoryOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
