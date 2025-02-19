package com.example.SpringJDBCDemo1.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.SpringJDBCDemo1.Entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {
	Optional<Student> findById(Long id);
	
	

}
