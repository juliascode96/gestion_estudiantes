package com.ej.studentManagment.service.service.impl;

import com.ej.studentManagment.entity.Estudiante;
import com.ej.studentManagment.repository.EstudianteRep;
import com.ej.studentManagment.service.EstudianteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteSv implements EstudianteService {
     private EstudianteRep estudianteRep;

    public EstudianteSv(EstudianteRep estudianteRep) {
        this.estudianteRep = estudianteRep;
    }

    @Override
    public List<Estudiante> mostrarEstudiantes() {
        return estudianteRep.findAll();
    }

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRep.save(estudiante);
    }

    @Override
    public Estudiante getEstudianteById(Long id) {
        return estudianteRep.findById(id).get();
    }

    @Override
    public Estudiante actualizarEstudiante(Estudiante estudiante) {
        return estudianteRep.save(estudiante);
    }

    @Override
    public void BorrarEstudiantePorId(Long id) {
        estudianteRep.deleteById(id);
    }
}
