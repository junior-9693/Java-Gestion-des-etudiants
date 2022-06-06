package com.junior.Gestion_Etudiants.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junior.Gestion_Etudiants.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
