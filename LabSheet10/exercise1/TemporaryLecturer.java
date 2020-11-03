package LabSheet10.exercise1;

import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer {
    private int hoursWorked;

    //constructor
    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment,int hoursWorked)
    {
        super(name,address,dateOfBirth,staffID,coursesTaught,dateOfAppointment);

    }

    //mutator
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //accessor
    public int getHoursWorked() {
        return hoursWorked;
    }
}
