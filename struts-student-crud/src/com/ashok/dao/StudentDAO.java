package com.ashok.dao;

import java.util.List;

import com.ashok.entity.Student;
import com.ashok.exception.StudentIdNotFoundException;

public interface StudentDAO {
	public void saveStudent(Student student);
	public Student getStudent(int id);
	public void deleteStudent(int id);
	public void updateStudent(Student student);
	public List<Student> getStudents();
}
