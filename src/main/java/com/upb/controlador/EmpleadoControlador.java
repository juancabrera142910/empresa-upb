package com.upb.controlador;

import com.upb.modelo.entidades.Empleado;
import com.upb.servicio.EmpleadoServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadoControlador {

    private final EmpleadoServicio empleadoServicio;

    public EmpleadoControlador(EmpleadoServicio empleadoServicio) {
        this.empleadoServicio = empleadoServicio;
    }

    @GetMapping("/empleados")
    public List<Empleado> getEmpleados(){
        return empleadoServicio.getTodosEmpleados();
    }

    @GetMapping("/empleadosManual")
    public List<Empleado> getEmpleadosManual(){
        return empleadoServicio.getTodosEmpleadosManual();
    }
}
