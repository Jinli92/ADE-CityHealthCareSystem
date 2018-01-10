/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.EcoSystem;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Userinterface.Citizens.CitizenWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author jinliyu
 */
public class CitizensRole extends Role{
       @Override
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise city, EcoSystem business) {
        return new CitizenWorkAreaJPanel(userProcessContainer, account,organization,city,business);
    }
}
