/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.AirCondition;

/**
 *
 * @author jinliyu
 */
public class AirCondition {
    private int id;
    private static int count = 1;
    private int aqi;

    public AirCondition(){
     id = count;
        count++;
    }
    
    
    public int getAqi() {
        return aqi;
    }

    public int getId() {
        return id;
    }

    public void setAqi(int aqi) {
        this.aqi = aqi;
    }
    
    
}
