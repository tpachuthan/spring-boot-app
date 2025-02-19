package com.example.SpringJDBCDemo1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SpringJDBCDemo1.Entity.Student;
import com.example.SpringJDBCDemo1.Repository.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;

	public Student saveDetails(Student student) {
		
//		Student studentModel = new Student();
//		
//		studentModel.setName(student.getName());
//		studentModel.setMark(student.getMark());
//		
//		studentRepo.save(studentModel);
		
		return studentRepo.save(student);
	}
	
	   public List<Student> getAllDetails()
	   
	   {
		  
		    
		   return studentRepo.findAll();
	    }
	   public Student getStudentDetailsById(int id)
	   {
		   return studentRepo.findById(id).orElse(null);
	   }
	   

}
