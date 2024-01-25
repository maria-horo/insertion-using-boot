package com.insertionUsingBoot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.insertionUsingBoot.bean.Student;
@Service
public interface StudentService {

	public Student create(Student student); 
	public List<Student> getAllStudent();
	public Student getById(Integer id);
	public Student update(Student student);
}
