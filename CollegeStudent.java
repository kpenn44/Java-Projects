/*
Kelvin Penn
Intermediate Java Programming
Bellevue University

Program: This program allows a user to enter in first name, last name
and enerollment date and returns the same inforamtion with a 
graduation date of for years added to enrollment date
*/

import java.util.GregorianCalendar;
import java.util.*;

//initiate variables for names and dates
public Scanner scanner = new Scanner(System.in);
String stuFirstName;
String stuLastName;
GregorianCalendar enrollDate;
GregorianCalendar projGrad;

//create the non void methods to retrieve names and dates
public String getFirstName() {
	return stuFirstName;
}

public void setFirstName(String firstName) {
	this.stuFirstName = stufirstName;
}

public String getLastName(){
	return stuLastName;
}
public void setLastName(String lastName){
	this.stuLastName = stulastName;
}

public GregorianCalendar getEnrollDate(){
	return enrollDate;
}

public void setEnrollDAte(GregorianCalendar enrollDate) {
	this.enrollDate = enrollDate;
}

public CollegeStudent(){

}

//create the instance variables needed to pass the information
public CollegeStudent (String firstName, String lastName, GregorianCalendar enrollmentDate){
this.stuFirstName = stuFirstName;
this.stuLastName = stuLastName;
this.enrollDate = enrollDate;
this.projGrad = projGrad;
}

public GregorianCalendar getprojGrad() {
	return projGrad;
}

public void setprojGrad(GregorianCalendar projGrad, int year) {
	this.projGrad = projGrad;
	projGrad.set(GregorianCAlendar.YEAR, year + 4);
}

//Ask the user for the input
public CollegeStudent test() {

	String fName, lName;
	GregorianCalendar enroldate;
	GregorianCalendar projGrad;

	System.out.println ("Please enter First Name: ");
	fName = scanner.next();

	System.out.println ("Please enter Last Name: ");
	lName = scanner.next();

	System.out.println ("Please enter date ");
	int date = scanner.nextInt();

	System.out.println ("Please enter month ");
	int month = scanner.nextInt();

	System.out.println ("Please enter year ");
	int year = scanner.nextInt();

	enrollmentdate = new GregorianCalendar(year, month, date);
	projGrad = new GregorianCalendar(year + 4, month, date);

	CollegeStudent cs = new CollegeStudent(fName, lName, enrollmentdate, projGrad);

	return cs;
}

//display the college students information back to them
 public void display(CollegeStudent cs){
        System.out.println("First Name: " + cs.getFirstName());
        
        System.out.println("Last Name: " + cs.getLastName());
        
        System.out.println("Enroll Date: " + cs.getEnrollDate().get(GregorianCalendar.MONTH) 
                + cs.getEnrollDate().get(GregorianCalendar.DATE) +  (cs.getEnrollDate().get(GregorianCalendar.YEAR)));
        
        System.out.println("Projected Graduation Date: " + cs.getProjectedGraduationDate().get(GregorianCalendar.MONTH) + 
                + cs.getProjectedGraduationDate().get(GregorianCalendar.DATE) + cs.getProjectedGraduationDate().
                get(GregorianCalendar.YEAR));
        
    }

}
