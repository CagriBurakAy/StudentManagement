package studentmanagementapp;

import java.util.Scanner;

public class StudentManagmentApp {
public static void main(String[] args) {
	
	System.out.print("Enter number of new students to enroll: ");
	Scanner scan=new Scanner(System.in);
	int studentNumber=scan.nextInt();
	Student[] students=new Student[studentNumber];
	for (int i = 0; i < studentNumber; i++) {
		students[i]=new Student();
		students[i].enroll();
		students[i].payTution();
		
	}
	for (int i = 0; i < studentNumber; i++) {
		System.out.println(students[0].toString());
	}

}
}
