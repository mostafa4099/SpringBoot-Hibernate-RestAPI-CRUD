package com.mostafa.sna.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mostafa.sna.dao.StudentDao;
import com.mostafa.sna.entity.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	@Transactional
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}

	@Override
	@Transactional
	public Student getStudent(int id) {
		return studentDao.getStudent(id);
	}

	@Override
	@Transactional
	public void saveOrUpdateStudent(Student student) {
		
		studentDao.saveOrUpdateStudent(student);
		
	}

	@Override
	@Transactional
	public String deleteStudent(int id) {
		return studentDao.deleteStudent(id);
	}
	
	

}
