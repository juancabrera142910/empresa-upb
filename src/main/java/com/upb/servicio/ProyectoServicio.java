package com.upb.servicio;

import com.upb.modelo.entidades.Proyecto;

import java.util.List;

public interface ProyectoServicio {

    //comentario : esto se traduce como select * from proyectos;
    List<Proyecto> traerTodosLosProyectos();

    //comentario : esto se traduce como select * from proyectos where id=?;
    Proyecto traerUnProyectoPorId(Long id);

}
