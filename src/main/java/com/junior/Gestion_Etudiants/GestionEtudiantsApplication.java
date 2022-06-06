package com.junior.Gestion_Etudiants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.junior.Gestion_Etudiants.entity.Student;
import com.junior.Gestion_Etudiants.repository.StudentRepository;

@SpringBootApplication
public class GestionEtudiantsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionEtudiantsApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {


}
}
