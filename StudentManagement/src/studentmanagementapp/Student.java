package studentmanagementapp;

import java.util.Scanner;

public class Student {
private String SfirstName;
private String slastName;
private int gradeYear;
private String studentID;
private String courses="";
private int tutionBalance=0;
private static int costofCourse=600;
private static int id=1000;
Scanner scan=new Scanner(System.in);
public Student() {

	System.out.print("Enter Student First Name:");
	this.SfirstName=scan.nextLine();
	System.out.print("Enter Student Last Name:");
	this.slastName=scan.nextLine();	
	System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level:");
	this.gradeYear=scan.nextInt();
	SetStudentID();
		
}
private void SetStudentID() {
	id++;
	this.studentID= gradeYear+""+id;
	}
public void enroll() {
	do {
	System.out.println("Enter course to enroll(Q to quit)");

	String course=scan.nextLine();
	if (!course.equals("Q")) {
		courses=courses+"\n "+course;
		tutionBalance=tutionBalance+costofCourse;
			}else {
				break;
			}
	} while(true);
	
}
public void viewBalance() {
	System.out.println("Your balance is:$"+tutionBalance);
}
public void payTution() {
	System.out.print("Enter your payment: $");
	int payment=scan.nextInt();
	tutionBalance-=payment;
	System.out.println("Thank you for your payment of $"+payment);
	viewBalance();
}
public String toString() {
	return "Name: "+SfirstName+" "+slastName+
			"\nGrade Year:"+gradeYear+
			"\nStudentID"+studentID+
			"\nCourses Enrolled"+courses+
			"\nBalance: $"+tutionBalance;
}
}
