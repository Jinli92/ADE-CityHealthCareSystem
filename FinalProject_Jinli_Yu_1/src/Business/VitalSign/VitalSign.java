/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.VitalSign;

import java.util.Date;

/**
 *
 * @author jinliyu
 */
public class VitalSign {
   
    private int heartRate;
    private String isHeartRateNormal;
    private int sysBloodPressure;
     private String isBloodPressureNormal;
    private float weight;
    private String isWeightNormal;
    private double bmi;
    private String isDiabete;
    private String result;
    private String timestamp;

    public String getIsDiabete() {
        return isDiabete;
    }

    public void setIsDiabete(String isDiabete) {
        this.isDiabete = isDiabete;
    }

    
    
    
    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }


    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }


    public int getSysBloodPressure() {
        return sysBloodPressure;
    }

    public void setSysBloodPressure(int sysBloodPressure) {
        this.sysBloodPressure = sysBloodPressure;
    }

 

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getIsHeartRateNormal() {
        return isHeartRateNormal;
    }

    public void setIsHeartRateNormal(String isHeartRateNormal) {
        this.isHeartRateNormal = isHeartRateNormal;
    }

    public String getIsBloodPressureNormal() {
        return isBloodPressureNormal;
    }

    public void setIsBloodPressureNormal(String isBloodPressureNormal) {
        this.isBloodPressureNormal = isBloodPressureNormal;
    }

    public String getIsWeightNormal() {
        return isWeightNormal;
    }

    public void setIsWeightNormal(String isWeightNormal) {
        this.isWeightNormal = isWeightNormal;
    }
    
   
    
    @Override
    public String toString(){
    return timestamp;
    }
    
    
}
