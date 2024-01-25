package com.insertionUsingBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insertionUsingBoot.bean.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
