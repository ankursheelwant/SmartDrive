/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.DrivingData;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Ankur
 */
public class DriveDirectory {
    private ArrayList<Drive> driveList;
    private HashMap<String,Integer> pairHashMap;
    public DriveDirectory()
    {
        driveList=new ArrayList<>();
        pairHashMap=new HashMap<>();
        pairHashMap.put("Overspeeding & Abnormal Tyre Pressure",0);
        pairHashMap.put("Overspeeding & Abnormal Health Condition",0);
        pairHashMap.put("Overspeeding & Harsh Weather",0);
        pairHashMap.put("Abnormal Tyre Pressure & Abnormal Health",0);
        pairHashMap.put("Abnormal Tyre Pressure & Harsh Weather",0);
        pairHashMap.put("Abnormal Health Condition & Harsh Weather",0);
    }

    public ArrayList<Drive> getDriveList() {
        return driveList;
    }

    public void setDriveList(ArrayList<Drive> driveList) {
        this.driveList = driveList;
    }

    public HashMap<String,Integer> getPairHashMap() {
        return pairHashMap;
    }

    public void setPairHashMap(HashMap<String,Integer> pairHashMap) {
        this.pairHashMap = pairHashMap;
    }
}
