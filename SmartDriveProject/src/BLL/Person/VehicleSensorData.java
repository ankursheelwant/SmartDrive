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
public class VehicleSensorData {
    private int tyrePressure;
    private int speed;
    private boolean engineCheck;
    private boolean brakeCondition;
    private boolean isVehicleGood;
    private boolean isOverSpeeding;
    private boolean isAbnormalTyrePressure;

    public int getTyrePressure() {
        return tyrePressure;
    }

    public void setTyrePressure(int tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isEngineCheck() {
        return engineCheck;
    }

    public void setEngineCheck(boolean engineCheck) {
        this.engineCheck = engineCheck;
    }

    public boolean isBrakeCondition() {
        return brakeCondition;
    }

    public void setBrakeCondition(boolean brakeCondition) {
        this.brakeCondition = brakeCondition;
    }

    public boolean isIsVehicleGood() {
        return isVehicleGood;
    }

    public void setIsVehicleGood(boolean isVehicleGood) {
        this.isVehicleGood = isVehicleGood;
    }

    public boolean isIsOverSpeeding() {
        return isOverSpeeding;
    }

    public void setIsOverSpeeding(boolean isOverSpeeding) {
        this.isOverSpeeding = isOverSpeeding;
    }

    public boolean isIsAbnormalTyrePressure() {
        return isAbnormalTyrePressure;
    }

    public void setIsAbnormalTyrePressure(boolean isAbnormalTyrePressure) {
        this.isAbnormalTyrePressure = isAbnormalTyrePressure;
    }
}
