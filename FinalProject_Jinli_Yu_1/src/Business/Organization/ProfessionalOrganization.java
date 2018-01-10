/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ProfessionalRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author jinliyu
 */
public class ProfessionalOrganization extends Organization{
        public ProfessionalOrganization() {
        super(Organization.Type.Professional.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ProfessionalRole());
        return roles;
    }
}
