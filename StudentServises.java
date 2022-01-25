package servises;

import Moden.Student;

public interface StudentServises {
	public abstract class StudentService {
		abstract void creatStudent(Student stud);
		abstract void viewStudent();
		abstract void updateStudent(int id);
		abstract void deleteStudent(int id);


	}
}
