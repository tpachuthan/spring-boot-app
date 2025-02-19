package com.example.SpringJDBCDemo1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringJDBCDemo1.Entity.Student;
import com.example.SpringJDBCDemo1.Service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	@PostMapping("/addStudent")
	public Student postDetails(@RequestBody Student student)
	{
		return studentService.saveDetails(student);
		
	}
	@GetMapping("/getData")
	public List<Student> getDetails()
	{
		return studentService.getAllDetails();
	}
	
	@GetMapping("getStudentById/{id}")
	public Student fetchDetailsById(@PathVariable int id)
	{
		return studentService.getStudentDetailsById(id);
	}
}
		
