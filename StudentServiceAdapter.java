
package Adapter;
import java.util.Scanner;

import Moden.Student;
import UtilityPkg.ConnectionUtil;
import servises.StudentServises;

import java.sql.*;
public class StudentServiceAdapter implements StudentServises {
	public Student[] studentArray= new Student[100];
	int Studentcount=0;

	public void creatStudent(Student s) {
		try {
			Connection con=ConnectionUtil.getDBconnection();
			PreparedStatement ps=con.prepareStatement("insert into student value(?,?,?)");
			ps.setInt(1, Studentcount);
			ps.setString(2, s.getName());
			ps.setString(3, s.getStream());
			int r=ps.executeUpdate();
			if(r>0) {
				System.out.println("data inserted....!");
			}
			else {
				System.out.println("somthing errro...!");
			}
			Studentcount++;
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void viewStudent() {

		System.out.println("below are the Student details");
		try {
			Connection con=ConnectionUtil.getDBconnection();
			Scanner sc=new  Scanner (System.in);
			System.out.println("enter the id of student");
			int id=sc.nextInt();

			PreparedStatement ps=con.prepareStatement("select * from student where id=? ");
			ps.setInt(1, id);
			ResultSet r=ps.executeQuery();
			while(r.next()) {
				System.out.println(r.getInt("id"));
				System.out.println(r.getString("name"));
				System.out.println(r.getString("stream"));
			}
			con.close();
		}
		catch(Exception e) {
			e.printStackTrace();

		}
	}


	public void updateStudent(int id) {

		try {
			Connection con=ConnectionUtil.getDBconnection();
			Scanner sc=new Scanner (System.in);
			System.out.println("enter the name which you want to insert");
			String name=sc.next();
			PreparedStatement ps=con.prepareStatement("update student set name=? where id=?");

			ps.setString(1, name);
			ps.setInt(2, id);

			int r=ps.executeUpdate();
			if(r>0) {
				System.out.println("data inserted....!");
			}
			else {
				System.out.println("somthing erro...!");
			}
			con.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void deleteStudent(int id) {

		try {
			Connection con=ConnectionUtil.getDBconnection();
			PreparedStatement ps=con.prepareStatement("delete from student where id=?");

			ps.setInt(1, id);


			int r=ps.executeUpdate();
			if(r>0) {
				System.out.println("data inserted....!");
			}
			else {
				System.out.println("somthing error...!");
			}
			con.close();

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}





