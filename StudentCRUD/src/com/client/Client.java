package com.client;

import com.services.StudentServiceImpl;
import com.services.StudentServices;
import com.studententity.Student;

public class Client {

	public static void main(String[] args) {
		
		StudentServices service = new StudentServiceImpl();
		Student student = new Student(0, null);
		
		
		// adding opeartion
	/*	student.setStudentId(6);
		student.setName("Raj");
		service.addStudent(student);
	*/
		
	//at this breakpoint, we have added one record to table
	//retrieve operation
	/*	student=service.findStudentById(6);
		System.out.println("Id " +student.getStudentId());
		System.out.println("Name " +student.getName());
	*/	
	
		//at this breakpoint, record is removed from table
		// Delete Operation
	/*	student = service.findStudentById(6);
		service.removeStudent(student);
		*/
		
		student=service.findStudentById(5);
		student.setName("nilu");
		service.updateStudent(student);
		
		System.out.println("NO erorr");
	}

}
