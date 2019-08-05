package com.mostafa.sna.service;

import java.util.List;

import com.mostafa.sna.entity.Student;

public interface StudentService {

	public List<Student> getAllStudents();

	public Student getStudent(int id);

	public void saveOrUpdateStudent(Student student);

	public String deleteStudent(int id);

}
