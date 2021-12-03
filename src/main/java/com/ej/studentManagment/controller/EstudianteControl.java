package com.ej.studentManagment.controller;

import com.ej.studentManagment.entity.Estudiante;
import com.ej.studentManagment.service.service.impl.EstudianteSv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EstudianteControl {
    @Autowired
    EstudianteSv estudianteSv;

    @GetMapping("/estudiantes")
    public String mostrarLista(Model model) {
        model.addAttribute("estudiantes", estudianteSv.mostrarEstudiantes());
        return "estudiantes";
    }

    @GetMapping("/estudiantes/new")
    public String createForm(Model model) {
        Estudiante estudiante = new Estudiante();
        model.addAttribute("estudiante", estudiante);
        return "crear_estudiante";
    }

    @PostMapping("/estudiantes")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante){
        estudianteSv.guardarEstudiante(estudiante);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/edit/{id}")
    public String editarFormulario(@PathVariable Long id, Model model) {
        model.addAttribute("estudiante", estudianteSv.getEstudianteById(id));
        return "editar_estudiante";
    }

    @PostMapping("/estudiantes/{id}")
    public String actualizarEstudiante(@PathVariable Long id, @ModelAttribute("estudiante") Estudiante estudiante, Model model) {
        Estudiante e1 = estudianteSv.getEstudianteById(id);
        e1.setId(id);
        e1.setNombre(estudiante.getNombre());
        e1.setApellido(estudiante.getApellido());
        e1.setEmail(estudiante.getEmail());

        estudianteSv.actualizarEstudiante(e1);
        return "redirect:/estudiantes";
    }

    @GetMapping("/estudiantes/{id}")
    public String borrarEstudiante(@PathVariable Long id) {
        estudianteSv.BorrarEstudiantePorId(id);
        return "redirect:/estudiantes";
    }
}
