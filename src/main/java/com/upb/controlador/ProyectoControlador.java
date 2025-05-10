package com.upb.controlador;

import com.upb.modelo.entidades.Proyecto;
import com.upb.servicio.ProyectoServicio;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProyectoControlador {

    private final ProyectoServicio proyectoServicio;

    public ProyectoControlador(ProyectoServicio proyectoServicio) {
        this.proyectoServicio = proyectoServicio;
    }

    @GetMapping("/traer-todos-los-proyecto")
    public ResponseEntity<List<Proyecto>> traerTodosLosProyecto(){
        List<Proyecto> listaProyecto = proyectoServicio.traerTodosLosProyectos();
        return ResponseEntity.ok(listaProyecto);
    }

    @GetMapping("/traer-proyecto/{id}")
    public ResponseEntity<Proyecto> traerProyecto(@PathVariable("id") Long id){
        Proyecto proyecto = proyectoServicio.traerUnProyectoPorId(id);
        return ResponseEntity.ok(proyecto);
    }

    @GetMapping("/traer-proyecto-parmetro")
    public ResponseEntity<Proyecto> traerProyectoParametro(@RequestParam Long proyectoId){
        Proyecto proyecto = proyectoServicio.traerUnProyectoPorId(proyectoId);
        return ResponseEntity.ok(proyecto);
    }

}
