package com.studentdao;

import com.studententity.Student;

public interface StudentDao {
	public abstract Student getStudentById(int Id);
	public abstract void addStudent(Student student);
	public abstract void removeStudent(Student student);
	public abstract void updateStudent(Student student);
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
