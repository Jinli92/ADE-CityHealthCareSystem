/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author jinliyu
 */
public class OrganizationDirectory {
     
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Citizens.getValue())){
            organization = new CitizensOrganization();
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.LocalEPA.getValue())){
            organization = new LocalEPAOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Organization.Type.Mayor.getValue())){
            organization = new MayorOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Organization.Type.Professional.getValue())){
            organization = new ProfessionalOrganization();
            organizationList.add(organization);
        }
          else if (type.getValue().equals(Organization.Type.Monitoring.getValue())){
            organization = new MonitoringOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
