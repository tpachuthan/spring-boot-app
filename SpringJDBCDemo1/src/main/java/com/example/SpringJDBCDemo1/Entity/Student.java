package com.example.SpringJDBCDemo1.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Builder
@Table(name = "student")
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue
	private int id;
	
	private int sid;

	private int mark;
	private String name;
	
	 

//	    public Student(int id, String name, int age) {
//	        this.id = id;
//	        this.name = name;
//	        
//	    }
//
//	    // ✅ Add Getters (IMPORTANT for JSON serialization)
//	    public int getId() { return id; }
//	    public String getName() { return name; }
//	  
//
//	    // ✅ Add Setters (Optional, but useful)
//	    public void setId(int id) { this.id = id; }
//	    public void setName(String name) { this.name = name; }
	    
}
