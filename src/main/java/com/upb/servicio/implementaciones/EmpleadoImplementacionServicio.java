package com.upb.servicio.implementaciones;

import com.upb.modelo.entidades.Asignacion;
import com.upb.modelo.entidades.Empleado;
import com.upb.modelo.repositorios.AsignacionRepositorio;
import com.upb.modelo.repositorios.EmpleadoRepositorio;
import com.upb.servicio.AsignacionServicio;
import com.upb.servicio.EmpleadoServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmpleadoImplementacionServicio implements EmpleadoServicio {

    private final EmpleadoRepositorio empleadoRepositorio;

    public EmpleadoImplementacionServicio(EmpleadoRepositorio empleadoRepositorio) {
        this.empleadoRepositorio = empleadoRepositorio;
    }

    @Override
    public List<Empleado> getTodosEmpleados() {
        return empleadoRepositorio.findAll();
    }

    @Override
    public List<Empleado> getTodosEmpleadosManual() {
        return empleadoRepositorio.traerTodo();
    }
}


