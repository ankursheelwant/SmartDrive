/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.Person;

/**
 *
 * @author Ankur
 */
public class VitalSign {
    private int bloodPresssure;
    private int heartRate;
    private int respiratoryRate;
    private boolean healthNormal;

    public int getBloodPresssure() {
        return bloodPresssure;
    }

    public void setBloodPresssure(int bloodPresssure) {
        this.bloodPresssure = bloodPresssure;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public boolean isHealthNormal() {
        return healthNormal;
    }

    public void setHealthNormal(boolean healthNormal) {
        this.healthNormal = healthNormal;
    }
    
}
