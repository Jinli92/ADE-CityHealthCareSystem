/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Employee.Employee;
import Business.VitalSign.VitalSignHistory;

/**
 *
 * @author jinliyu
 */
public class Citizen extends Employee{
    private int age;
    private String sex;
    private int height;
   private VitalSignHistory vitalSignHistory;
    
   
    public Citizen(){
    vitalSignHistory = new VitalSignHistory();
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

  
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

  
    
    
    
}
