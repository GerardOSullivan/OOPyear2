package LabSheet10.exercise1;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person{
    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String[] coursesTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer(String name,String address,GregorianCalendar dateOfBirth,String staffID,String[] coursesTaught,GregorianCalendar dateOfAppointment)
    {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(staffID);
        setCoursesTaught(coursesTaught);
        setDateOfAppointment(dateOfAppointment);
    }

    //assigning mutators
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public void setCoursesTaught(String[] coursesTaught) {
        this.coursesTaught = coursesTaught;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    //assigning accessors

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStaffID() {
        return staffID;
    }

    public String[] getCoursesTaught() {
        return coursesTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public abstract String getStatus();

    public abstract int getPointOnScale();

    @Override
    public String toString() {
        String str= "Lecturer name is " + getName() +
                "\nLecturer address is " + getAddress() +
                "\nLecturer date of birth is ";

        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        if(getDateOfBirth()!=null)
        {
            //Need to get the date of birth as a Date for display purposes.
            //The toString() method from the GregorianCalendar class inherits
            //that from its superclass Calendar but this only displays the
            //calendar data in a non-friendly format like the default
            //toString() from the Object class

            Date dob = getDateOfBirth().getTime();

            String strDob = formatDate.format(dob);
            str+=strDob;

        }
        else
            str+="Undefined";

        str+="\nLecturer Staff ID is " + getStaffID() +
                "\nLecturer Courses Taught are " + Arrays.toString(getCoursesTaught()) +
                "\nLecturer Date of Appointment is " + formatDate.format(getDateOfAppointment().getTime()) +
                "\nLecturer Status is " + getStatus() +
                "\nLecturer Point on Scale is " + getPointOnScale();

        return str;
    }
}
