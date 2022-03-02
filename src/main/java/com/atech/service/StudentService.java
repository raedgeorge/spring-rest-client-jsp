package com.atech.service;

import java.util.List;

import com.atech.model.Student;

public interface StudentService {

	List<Student> getStudents();
	
	void addStudent(Student student);
	
	Student getStudent(int studentId);
	
	void deleteStudent(int studentId);
	
}
