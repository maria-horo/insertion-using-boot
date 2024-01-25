package com.insertionUsingBoot.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insertionUsingBoot.bean.Student;
import com.insertionUsingBoot.repository.StudentRepository;
import com.insertionUsingBoot.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository repository;
	public Student create(Student student)
	{
		return repository.save(student);
	}
	@Override
	public List<Student> getAllStudent() {
			return repository.findAll();
	}
	@Override
	public Student getById(Integer id) {
		
		return repository.findById(id).get();
	}
	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return repository.save(student);
	}
	
	
}
