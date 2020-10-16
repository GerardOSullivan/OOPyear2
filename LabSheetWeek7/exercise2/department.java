package LabSheetWeek7.exercise2;

public class department {
    private String name;
    private students student[];

    public department(String name, students[] student) {
        this.name = name;
        this.student = student;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent(students[] student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public students[] getStudent() {
        return student;
    }

    public String toString(){
        String str = "\n\nName: " + getName() + "\nList of Students: \n";

        for(int i=0;i<getStudent().length;i++)
            if(student[i]!=null)
                str+=student[i];

        return str;
    }
}
