package com.upb.modelo.repositorios;


import com.upb.modelo.entidades.Asignacion;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface AsignacionRepositorio extends Repository<Asignacion, Long> {

    List<Asignacion> findAll();

    @Query(value = "select  * from asignaciones",nativeQuery = true)
    List<Asignacion> traerTodo();

}

