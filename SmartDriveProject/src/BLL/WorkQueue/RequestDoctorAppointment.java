/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL.WorkQueue;

import java.util.Date;

/**
 *
 * @author Ankur
 */
public class RequestDoctorAppointment extends WorkRequest{
    
    private Date appointmentDate;

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    @Override
    public String toString() {
        return String.valueOf(appointmentDate);
    }
    
}
