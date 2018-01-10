/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Citizen;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AirMonitorRole;
import Business.Role.CitizensRole;
import Business.Role.DoctorRole;
import Business.Role.LocalEPARole;
import Business.Role.MayorRole;
import Business.Role.ProfessionalRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.VitalSign.VitalSign;

/**
 *
 * @author jinliyu
 */
public class ConfigureAsystem {

    public static EcoSystem configure() {
        EcoSystem system = EcoSystem.getInstance();

        Employee employee = system.getEmployeeDirectory().createEmployee("emp");

        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());

        Network network1 = system.createAndAddNetwork("Boston");
        Enterprise.EnterpriseType type = Enterprise.EnterpriseType.Citizen;
        Enterprise enterprise = network1.getEnterpriseDirectory().createAndAddEnterprise("citizengroup", type);
        Organization o = enterprise.getOrganizationDirectory().createOrganization(Organization.Type.Citizens);

        Enterprise.EnterpriseType type1 = Enterprise.EnterpriseType.Government;
        Enterprise enterprise1 = network1.getEnterpriseDirectory().createAndAddEnterprise("BostonGovernment", type1);
        Organization o1 = enterprise1.getOrganizationDirectory().createOrganization(Organization.Type.LocalEPA);

        Enterprise enterprise2 = network1.getEnterpriseDirectory().createAndAddEnterprise("Boston No.1Hospital", Enterprise.EnterpriseType.Hospital);
          Enterprise enterprise3 = network1.getEnterpriseDirectory().createAndAddEnterprise("Boston MonitoringStation", Enterprise.EnterpriseType.Monitoring);
      
        Organization org = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);

        Organization o2 = enterprise1.getOrganizationDirectory().createOrganization(Organization.Type.Mayor);

        Organization o3 = enterprise2.getOrganizationDirectory().createOrganization(Organization.Type.Professional);

        Organization o4 = enterprise3.getOrganizationDirectory().createOrganization(Organization.Type.Monitoring);

//                
//        for(Network network:system.getNetworkList()){
//        if(network.getName().equals("Worcester"))
//        {
//        Enterprise hosenterprise = network.getEnterpriseDirectory().createAndAddEnterprise("No.1 Hospital", Enterprise.EnterpriseType.Hospital);
//       
//        Organization o4 = hosenterprise.getOrganizationDirectory().createOrganization(Organization.Type.Doctor);
//        
//        Employee emp = o4.getEmployeeDirectory().createEmployee("waner");
//        UserAccount doctor2 = o4.getUserAccountDirectory().createUserAccount("waner", "waner", emp, new DoctorRole());
//       
//       }
//        
//        
//        }
        Employee doctor = org.getEmployeeDirectory().createEmployee("yue");
        UserAccount doctorua = org.getUserAccountDirectory().createUserAccount("yue", "yue", doctor, new DoctorRole());

        Employee local = o1.getEmployeeDirectory().createEmployee("local");
        UserAccount lua = org.getUserAccountDirectory().createUserAccount("local", "1", local, new LocalEPARole());

        Employee mayor = o2.getEmployeeDirectory().createEmployee("mayor");
        UserAccount mua = o2.getUserAccountDirectory().createUserAccount("mayor", "1", mayor, new MayorRole());

        Employee pro = o3.getEmployeeDirectory().createEmployee("professional1");
        UserAccount pua = o3.getUserAccountDirectory().createUserAccount("pro", "pro", pro, new ProfessionalRole());

        Employee moni = o4.getEmployeeDirectory().createEmployee("monitor1");
        UserAccount uam = o4.getUserAccountDirectory().createUserAccount("moni", "1", moni, new AirMonitorRole());

        return system;
    }
}
