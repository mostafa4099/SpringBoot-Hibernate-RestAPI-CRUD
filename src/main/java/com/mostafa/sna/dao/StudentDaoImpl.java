package com.mostafa.sna.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mostafa.sna.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<Student> getAllStudents() {
		
		Session session = entityManager.unwrap(Session.class);
		
		Query<Student> query = session.createQuery("from Student", Student.class);
		
		List<Student> list = query.getResultList();
		
		return list;
	}

	@Override
	public Student getStudent(int id) {
		
		Session session = entityManager.unwrap(Session.class);
		
		Student student = session.get(Student.class, id);
		
		return student;
	}

	@Override
	public void saveOrUpdateStudent(Student student) {

		Session session = entityManager.unwrap(Session.class);
		
		session.saveOrUpdate(student);
		
	}

	@Override
	public String deleteStudent(int id) {
		
		Session session = entityManager.unwrap(Session.class);
		
		Student student = session.get(Student.class, id);
		
		if (student == null) {
			return "Student id "+id+" not found!";
		} else {
			session.delete(student);
			return "Student Removed Successful!";
		}
	}

}
