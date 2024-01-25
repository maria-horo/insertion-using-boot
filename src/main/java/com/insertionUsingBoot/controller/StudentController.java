package com.insertionUsingBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insertionUsingBoot.bean.Student;
import com.insertionUsingBoot.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	@Autowired
	StudentService service;
	
	
	@GetMapping("/student")
public List<Student> getAll()
{
		System.out.println("kk");
	return service.getAllStudent();
}

	
	@GetMapping("/{id}")
	public Student getById(@PathVariable Integer id)
	{
		return service.getById(id);
	}
	
	@PostMapping("/store")
	public Student saveStudent(@RequestBody Student student)
	{
		return service.create(student);
	}
	
	@PutMapping("/update")
	public Student update(@RequestBody Student student)
	{
		return service.update(student);
		
	}
}
