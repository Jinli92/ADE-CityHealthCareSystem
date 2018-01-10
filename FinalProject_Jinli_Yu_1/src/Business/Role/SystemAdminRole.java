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
import Userinterface.SystemAdmin.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author jinliyu
 */
public class SystemAdminRole extends Role{
       @Override
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise city, EcoSystem system) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system);
    }
}
