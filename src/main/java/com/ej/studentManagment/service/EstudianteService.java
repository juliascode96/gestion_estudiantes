package com.ej.studentManagment.service;

import com.ej.studentManagment.entity.Estudiante;

import java.util.List;

public interface EstudianteService {
    List<Estudiante> mostrarEstudiantes();

    Estudiante guardarEstudiante(Estudiante estudiante);

    Estudiante getEstudianteById(Long id);

    Estudiante actualizarEstudiante(Estudiante estudiante);

    void BorrarEstudiantePorId(Long id);


}
