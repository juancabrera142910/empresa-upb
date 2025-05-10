package com.upb.servicio.implementaciones;


import com.upb.modelo.entidades.Proyecto;
import com.upb.modelo.repositorios.ProyectoRepositorio;
import com.upb.servicio.ProyectoServicio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProyectoImplementacionServicio implements ProyectoServicio {

    private  final ProyectoRepositorio proyectoRepositorio;

    public ProyectoImplementacionServicio(ProyectoRepositorio proyectoRepositorio) {
        this.proyectoRepositorio = proyectoRepositorio;
    }


    @Override
    public List<Proyecto> traerTodosLosProyectos() {
        return proyectoRepositorio.traerTodosLosProyectos();
    }

    @Override
    public Proyecto traerUnProyectoPorId(Long id) {
        return proyectoRepositorio.traerUnProyectoPorId(id);
    }
}
