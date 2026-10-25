package com.example.security.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	List<Student> students = new ArrayList<>(
			Arrays.asList(
					 new Student(1,"chandana","java and spring boot"),
					 new Student(2, "poojitha","nursing")
					));
	
    @GetMapping("/students")
    public List<Student> getStudents(){
    	return students;
    }
		
	@PostMapping("/students")
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}
	
	@GetMapping("/csrf-token")
	public CsrfToken getCsrfToken(HttpServletRequest requset) {
		return (CsrfToken) requset.getAttribute("_csrf");
		
	}
	
	
}
