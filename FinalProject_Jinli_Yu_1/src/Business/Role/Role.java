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
import javax.swing.JPanel;

/**
 *
 * @author jinliyu
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        Citizens("Citizens"),
        LocalEPA("Local EPA"),
        Mayor("Mayor"),
        Professional("Professional stuff"),
        StateOfficial("State Health Official");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(
            JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise city, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
