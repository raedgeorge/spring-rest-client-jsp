package com.atech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.atech.model.Student;
import com.atech.template.RestTemplateInterface;

@Service
public class StudentServiceImpl implements StudentService {

	private RestTemplateInterface restTemplateInterface;
	
	@Autowired
	@Value("${url}")
	private String url;

	
	@Autowired
	public StudentServiceImpl(RestTemplateInterface restTemplateInterface) {
		this.restTemplateInterface = restTemplateInterface;
	}

	@Override
	public List<Student> getStudents() {
		
		RestTemplate restTemplate = restTemplateInterface.getRestTemplate();
		
		ResponseEntity<List<Student>> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null,
                                       new ParameterizedTypeReference <List<Student>>() {});

		
		List<Student> students = responseEntity.getBody();
		
		return students;
	}

	@Override
	public void addStudent(Student student) {
	
		
	}

	@Override
	public Student getStudent(int studentId) {
		
		return null;
	}

	@Override
	public void deleteStudent(int studentId) {
	
		
	}
		
}
