package LabSheet10.exercise1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TemporaryLecturer extends Lecturer {
    private int hoursWorked;

    //constructor
    public TemporaryLecturer(String name, String address, GregorianCalendar dateOfBirth, String staffID, String[] coursesTaught, GregorianCalendar dateOfAppointment,int hoursWorked)
    {
        super(name,address,dateOfBirth,staffID,coursesTaught,dateOfAppointment);
        setHoursWorked(hoursWorked);
    }

    //mutator
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //accessor
    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public int getPointOnScale() {
        Calendar today = Calendar.getInstance();
        int yearStarted = today.get(Calendar.YEAR);
        int currentYear = getDateOfAppointment().get(Calendar.YEAR);
        int yearsWorked = currentYear-yearStarted;

        if(yearsWorked>=3 && getHoursWorked()>1500)
        {
            return 4;
        }
        else{
            if(yearsWorked>=3 && getHoursWorked()>1000)
            {

                return (int)(((getHoursWorked()*1.33)%700)+1);
            }
            else
            {
                return yearsWorked;
            }
        }
    }

    public String getStatus(){
        return "Contracted temporary lecturer on part-time hours";
    }

    @Override
    public String toString() {
        return super.toString() + "\nLecturer Hours Worked: " + getHoursWorked();
    }
}
