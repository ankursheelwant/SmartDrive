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
public class WeatherWarningAlert extends WorkRequest{
    private static WeatherWarningAlert weatherWarningAlert;
    private boolean isWeatherGood;
    public static WeatherWarningAlert getInstance()
    {
        if(weatherWarningAlert==null)
        {
            weatherWarningAlert=new WeatherWarningAlert();
        }
        return weatherWarningAlert;
    }

    private WeatherWarningAlert()
    {
        
    }
    public boolean isIsWeatherGood() {
        return isWeatherGood;
    }

    public void setIsWeatherGood(boolean isWeatherGood) {
        this.isWeatherGood = isWeatherGood;
    }
}
