package com.atech.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.atech.model.Student;
import com.atech.service.StudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	private final StudentService studentService;
		
	@Autowired
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping({"/list", ""})
	public String getStudentList() {
				
		List<Student> students = studentService.getStudents();
		
		students.forEach(std -> System.out.println(std));
		
		return "home-page";
	}
	
}
