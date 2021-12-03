package com.ej.studentManagment.repository;

import com.ej.studentManagment.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRep extends JpaRepository<Estudiante, Long>{
}
