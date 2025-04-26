package com.upb.modelo.repositorios;

import com.upb.modelo.entidades.Asignacion;
import com.upb.modelo.entidades.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface EmpleadoRepositorio extends Repository<Empleado, Long>{
    List<Empleado> findAll();

    @Query(value = "select  * from empleados where id = 10",nativeQuery = true)
    List<Empleado> traerTodo();

}


