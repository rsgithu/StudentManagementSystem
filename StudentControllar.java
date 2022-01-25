package Controller;

import java.util.Scanner;

import Adapter.StudentServiceAdapter;
import Moden.Student;

public class StudentControllar {
	static StudentServiceAdapter service = new StudentServiceAdapter();

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		boolean systemExit =false;
		while(!systemExit) {
			System.out.println("select opetion for which opration you want to perform");
			System.out.println("1. CREATE STUDENT");
			System.out.println("2. VIEW STUDENT");
			System.out.println("3. UPDATE STUDENT DETAILS");
			System.out.println("4. DETETE STUDENT DETAILS");
			System.out.println("5. EXIT");
			System.out.println("enter the option which you want to perform");
			int action=sc.nextInt();
			switch(action) {
			case 1:
				System.out.println("Create student data");
				System.out.println("enter the student name");
				String name=sc.next();
				System.out.println("enter the student Stream");
				String stream=sc.next();

				Student s=new Student(0,name,stream);
				service.creatStudent(s );
				break;

			case 2:
				service.viewStudent();
				break;

			case 3:
				System.out.println("enter the student id to perform update");
				int id=sc.nextInt();
				service.updateStudent(id);
				break;

			case 4:
				System.out.println("enter the student id to perform delete");
				int deleteAcrionId=sc.nextInt();
				service.deleteStudent(deleteAcrionId);
				break;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("wrong input");
				break;
			}
		}

	}
}


			