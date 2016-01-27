/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadLoop;

import UI.Citizen.CitizenFrame;
import UI.CityMayor.CityMayorFrame;
import static UI.SmartDriveMain.cityMayor;
import java.awt.Frame;

/**
 *
 * @author Ankur
 */
public class RealTimeMonitoringThread extends Thread{
    
    CitizenFrame citizen;
    public RealTimeMonitoringThread(Frame citizen)
    {
        this.citizen=(CitizenFrame)citizen;
    }
    public void run()
    {
        try
        {
            for(;;)
            {
                citizen.startDrive();
                Thread.sleep(2000);
                if(cityMayor!=null)
                {
                    cityMayor.calculateOverallScenario();
                    cityMayor.getFatalPair();
                    cityMayor.getAccidentCauseDistribution();
                    cityMayor.getCauseWiseStatistics();
                }
            }
            
        }
        catch(Exception e)
        {
            System.out.println(""+e.getMessage());
        }
    }
}
