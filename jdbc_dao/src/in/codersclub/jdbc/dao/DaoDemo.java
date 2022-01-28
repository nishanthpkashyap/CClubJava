package in.codersclub.jdbc.dao;

import java.sql.SQLException;
import java.util.Scanner;

public class DaoDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner sc = new Scanner(System.in);
		int rollno;
		System.out.println("Enter the rollno of the student :");
		rollno=sc.nextInt();
		sc.close();
		StudentDao dao=new StudentDao();
		Student s = dao.getStudent(rollno);
		System.out.println("Roll Number : "+s.getrollno());
		System.out.println("Student name : "+s.getsname());
	}

}
