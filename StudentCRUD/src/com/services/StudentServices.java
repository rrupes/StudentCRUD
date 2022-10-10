 package com.services;

import com.studententity.Student;

public interface StudentServices {
	public abstract void addStudent(Student student);
	public abstract void updateStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract Student findStudentById(int id);

}
