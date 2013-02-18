package com.ashok.dao;

import java.util.List;

import oracle.net.aso.s;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.ashok.entity.Student;
import com.ashok.exception.StudentIdNotFoundException;
import com.ashok.util.HibernateSessionFactoryTemplate;

public class StudentDAOImpl implements StudentDAO {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(StudentDAOImpl.class);
	private static final SessionFactory template = HibernateSessionFactoryTemplate
			.getSessionFactoryInstance();
	private static final StudentDAOImpl DAO_IMPL = new StudentDAOImpl();

	public StudentDAOImpl() {

	}

	public static StudentDAO getStudentDaoInstance() {
		return DAO_IMPL;
	}

	@Override
	public void saveStudent(Student student) {
		Session session = template.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		tx.commit();
		session.close();

	}

	@Override
	public Student getStudent(int id) {
		Session session = template.openSession();
		return (Student) session.get(Student.class, id);
	}

	@Override
	public void deleteStudent(int id) {
		Session session = template.openSession();
		Transaction tx = session.beginTransaction();
		Student student = (Student) session.get(Student.class, id);
		if (student == null) {
			LOGGER.error("Cant find the student how can I delete fool");
		} else {
			session.delete(student);
		}
		tx.commit();
		session.close();

	}

	@Override
	public void updateStudent(Student student) {
		LOGGER.info("updateStudent() .. called");
		Session session = template.openSession();
		Transaction tx = session.beginTransaction();
		Student oldStudent = (Student) session.get(Student.class,
				student.getId());
		if (oldStudent == null) {
			LOGGER.error("Can't find the student how can I delete fool");
		} else {
			String name = student.getName();
			String course = student.getCourse();
			String address = student.getAddress();
			oldStudent.setName(name);
			oldStudent.setCourse(course);
			oldStudent.setAddress(address);

		}
		tx.commit();
		session.close();

	}

	@Override
	public List<Student> getStudents() {
		Session session = template.openSession();
		List<Student> students = (List<Student>) session.createQuery(
				"from Student s order by s.id").list();
		session.close();
		return students;
	}

}
