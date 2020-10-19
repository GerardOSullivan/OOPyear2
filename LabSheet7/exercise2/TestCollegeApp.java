package LabSheet7.exercise2;

public class TestCollegeApp {
    public static void main(String[] args) {

        //Students list
        students computingStudents[]= new students[10];
        students creativeMediaStudents[]= new students[10];

        //Create student objects
        students student1 = new students(154345,"Jake","Computing");
        students student2 = new students(234532,"Mary","Creative Media");
        students student3 = new students(453726,"Tommy","Computing");
        students student4 = new students(623456,"Peter","Creative Media");

        //adding computing students to an array
        computingStudents[0]=student1;
        computingStudents[1]=student3;

        //adding Creative Media students to an array
        creativeMediaStudents[0]=student2;
        creativeMediaStudents[1]=student4;

        //Computing students department
        department computingDepartment = new department("Computing",computingStudents);
        department creativeMediaDepartment = new department("Creative Media",creativeMediaStudents);

        //Creating a list of all departments
        department departments[] = new department[5];

        //adding the departments into the departments array
        departments[0]=computingDepartment;
        departments[1]=creativeMediaDepartment;

        //Creating a college object giving it the departments
        Institute college = new Institute("Institute of Technology",departments);

        System.out.println(college);

        System.out.println("\nThe number of students in all departments is " + college.getTotalStudents() +"\n");


        for(int i=0;i <departments.length;i++)
        {
            if(departments[i] != null)
            {
                System.out.println(departments[i].getName() + " " + i);
            }
        }

        computingStudents = departments[0].getStudent();

        for(int i=0;i <computingStudents.length;i++)
        {
            if(computingStudents[i] != null)
            {
                if(computingStudents[i].getId() == 154345)
                {
                    System.out.println("\nFound Jake!\n");
                    creativeMediaStudents[2] = computingStudents[i];
                    computingStudents[i].setDepartment("Creative Media");
                    computingStudents[i] = null;
                    break;
                }
                else
                {
                    System.out.println("\nCouldn't find Jake\n");
                }
            }

        }

        System.out.println(college);
    }
}
