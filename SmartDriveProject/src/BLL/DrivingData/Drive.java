/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.DrivingData;

import BLL.UserAccount.UserAccount;

/**
 *
 * @author Ankur
 */
public class Drive {
    private UserAccount account;
    private boolean normalWeather;
    private boolean isAccident;

    
    public UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }

    public boolean isNormalWeather() {
        return normalWeather;
    }

    public void setNormalWeather(boolean normalWeather) {
        this.normalWeather = normalWeather;
    }

    public boolean isIsAccident() {
        return isAccident;
    }

    public void setIsAccident(boolean isAccident) {
        this.isAccident = isAccident;
    }
}
