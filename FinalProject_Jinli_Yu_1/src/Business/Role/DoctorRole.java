/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.EcoSystem;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Userinterface.Doctor.DoctorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author jinliyu
 */
public class DoctorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        Network n = null;
        for (Network network : business.getNetworkList()) {
            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                if (e == enterprise) {
                    n = network;
                    break;
                }
            }
        }

        return new DoctorWorkAreaJPanel(userProcessContainer,enterprise, n);
    }
}
