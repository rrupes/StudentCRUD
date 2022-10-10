package com.studententity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")  // created student table in database emp
public class Student implements Serializable {
	
	private static final long serialVersionUID = 42L;
	@Id  //  @Id means primary key in Hibernate
	private int studentId;
	private String name;
	
	public Student(int studentId, String name) {
		
		this.studentId = studentId;
		this.name = name;
	}

	/**
	 * @return the studentId
	 */
	
	
	
	public int getStudentId() {
		return studentId;
	}

	public Student() {
		super();
	}

	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + "]";
	}
	
	

}
