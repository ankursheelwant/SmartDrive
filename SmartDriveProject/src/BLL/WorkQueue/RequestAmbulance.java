/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.WorkQueue;

/**
 *
 * @author Ankur
 */
public class RequestAmbulance extends WorkRequest{
    private String location;
    private boolean isEnroute=false;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isIsEnroute() {
        return isEnroute;
    }

    public void setIsEnroute(boolean isEnroute) {
        this.isEnroute = isEnroute;
    }
    
}
