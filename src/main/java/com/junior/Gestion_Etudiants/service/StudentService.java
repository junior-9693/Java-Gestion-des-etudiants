package com.junior.Gestion_Etudiants.service;


import java.util.List;
import com.junior.Gestion_Etudiants.entity.Student;
public interface StudentService {
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
}