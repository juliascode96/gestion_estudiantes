package com.ej.studentManagment;

import com.ej.studentManagment.entity.Estudiante;
import com.ej.studentManagment.repository.EstudianteRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagmentApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentApplication.class, args);
	}

	@Autowired
	EstudianteRep estudianteRep;

	@Override
	public void run(String... args) throws Exception {

	}
}
