/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;


import Business.Enterprise.Enterprise.EnterpriseType;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jinliyu
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
    enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

 
    
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type==Enterprise.EnterpriseType.Government){
        enterprise = new GovEnterprise(name);
         enterpriseList.add(enterprise);
        }
         if(type==Enterprise.EnterpriseType.Hospital){
             //System.out.println("t");
        enterprise = new HospitalEnterprise(name);
         enterpriseList.add(enterprise);
        }
         
           if(type==Enterprise.EnterpriseType.Citizen){
        enterprise = new CitizenEnterprise(name);
         enterpriseList.add(enterprise);
        }
           
               if(type==Enterprise.EnterpriseType.Monitoring){
        enterprise = new MonitoringStationEnterprise(name);
         enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
/*
 public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }

*/