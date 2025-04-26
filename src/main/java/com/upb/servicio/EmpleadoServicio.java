package com.upb.servicio;

import com.upb.modelo.entidades.Empleado;

import java.util.List;

public interface EmpleadoServicio {
    List<Empleado> getTodosEmpleados();

    List<Empleado> getTodosEmpleadosManual();

}

