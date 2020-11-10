package LabSheet10.exercise1;

//TestInterface.java
/*A driver program that tests the functionality of the Student, UnderGraduate and
PostGraduate classes as well as the Person interface*/

import java.util.*;

public class TestInterface {
     public static void main(String args[]) {
     	//Students

		 	//Under Graduates
			UnderGraduate u1 = new UnderGraduate();
			UnderGraduate u2 = new UnderGraduate("Tommy Tiernan", "Galway", new GregorianCalendar(1970,5,22),"t123456","Comedy",3.12);

			//Post Graduates
			PostGraduate p1 = new PostGraduate();
			PostGraduate p2 = new PostGraduate("Eddie Murphy", "USA", new GregorianCalendar(1961,7,10), "t234567", "Comedy", "Frank Carson");

			//Permanent lecturer
		 	PermanentLecturer pl1 = new PermanentLecturer("Thomas Aquinas","Dublin",new GregorianCalendar(1984,11,31),"52673", new String[]{"Economics 101","Media Presentation","Political Debate"},new GregorianCalendar(2003, 5,23), "Lots and lots of Pension Entitlements :-)","Full-time Professorship");
		 	PermanentLecturer pl2 = new PermanentLecturer("Uncle Bob Martin","Philadelpia, USA",new GregorianCalendar(1952,3,19),"t0044356", new String[]{"Agile Methods","OO Analysis & Design","Design Patterns"},new GregorianCalendar(1986,2,18), "Oodles of Pension Entitlements :-)","Part-time Senior Research Fellow");

		 	//Temporary Lecturer
		 	TemporaryLecturer tl1 = new TemporaryLecturer("Richard O' Neill","Tallaght, Dublin",new GregorianCalendar(1985,2,4),"3536278b", new String[]{"Applied Biology","Microbiology"},new GregorianCalendar(2018,3,15),762);
		 	TemporaryLecturer tl2 = new TemporaryLecturer("Mary McKenzie","Bundoran, Donegal",new GregorianCalendar(1971,5,13),"647382", new String[]{"Fractal Geometry","Tensors"},new GregorianCalendar(2016,2,8),1342);

		 	//Person Array
		 	Person[] people = new Person[]{u1,u2,p1,p2,pl1,pl2,tl1,tl2};
		 	//Person people[] = {u1,u2,p1,p2,pl1,pl2,tl1,tl2}; same thing

		  for(int i=0;i< people.length;i++)
		  {
		  	System.out.println(people[i] + "\n\n");
		  }



	 }
}