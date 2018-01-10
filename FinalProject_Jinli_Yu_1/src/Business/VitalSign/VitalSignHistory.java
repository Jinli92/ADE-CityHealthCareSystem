/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSign;

import java.util.ArrayList;

/**
 *
 * @author jinliyu
 */
public class VitalSignHistory {
    private ArrayList<VitalSign> vitalSignHistory;
    
    public VitalSignHistory(){
    vitalSignHistory = new ArrayList<>();
    }

    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void AddVitalSign(VitalSign vs){
    vitalSignHistory.add(vs);
    }
    
    
}
