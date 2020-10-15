package LabSheeWeek7.exercise2;

import java.util.Arrays;

public class Institute {
    private String name;
    private department Department[];

    public Institute(String name, department department[]) {
        this.name = name;
        this.Department = department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(department[] department) {
        this.Department = department;
    }

    public String getName() {
        return name;
    }

    public department[] getDepartment() {
        return Department;
    }

    public int getTotalStudents(){
        int noOfStudents=0;
        students[] students;

        for (int i = 0; i < getDepartment().length; i++)
        {
            if (Department[i] != null)
            {
                students = Department[i].getStudent();

                for(int j=0; j <students.length;j++)
                {
                    if(students[j] != null)
                    {
                        noOfStudents++;
                    }
                }
            }
        }
        return noOfStudents;
    }

    public String toString() {
        String str = "Name: " + getName() + "\n\nDepartments: ";

        for (int i = 0; i < getDepartment().length; i++)
        {
            if (Department[i] != null)
            {
                str += Department[i];
            }
        }

        return str;
    }
}
