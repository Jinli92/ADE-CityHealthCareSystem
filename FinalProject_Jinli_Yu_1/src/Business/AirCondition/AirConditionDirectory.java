/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AirCondition;

import java.util.ArrayList;

/**
 *
 * @author jinliyu
 */
public class AirConditionDirectory {
    private ArrayList<AirCondition> AirConditonList;
    
    public AirConditionDirectory(){
    
    AirConditonList = new ArrayList<>();
    }

    public ArrayList<AirCondition> getAirConditonList() {
        return AirConditonList;
    }
    
    
    
}
