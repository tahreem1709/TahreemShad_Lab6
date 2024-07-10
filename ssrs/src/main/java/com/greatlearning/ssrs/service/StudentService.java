package com.greatlearning.ssrs.service;

import java.util.List;

import com.greatlearning.ssrs.entity.Student;

public interface StudentService {

	public List<Student> findAll();

	  public void save(Student student);
	  public Student findById(int id);

	  public void deleteById(int id);	  
}