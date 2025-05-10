package com.upb.modelo.repositorios;


import com.upb.modelo.entidades.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProyectoRepositorio extends JpaRepository<Proyecto,Long> {

    //comentario : esto se traduce como select * from proyectos;
    @Query(value = "select * from proyectos",nativeQuery = true)
    List<Proyecto> traerTodosLosProyectos();

    //comentario : esto se traduce como select * from proyectos where id=?;
    @Query(value = "select * from proyectos where id=:id",nativeQuery = true)
    Proyecto traerUnProyectoPorId(@Param("id") Long id);

}
