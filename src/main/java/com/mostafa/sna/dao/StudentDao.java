package com.mostafa.sna.dao;

import java.util.List;

import com.mostafa.sna.entity.Student;

public interface StudentDao {

	public List<Student> getAllStudents();

	public Student getStudent(int id);

	public void saveOrUpdateStudent(Student student);

	public String deleteStudent(int id);

}
