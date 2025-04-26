package com.upb.controlador;

import com.upb.modelo.entidades.Asignacion;
import com.upb.servicio.AsignacionServicio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AsignacionControlador {

    private  final AsignacionServicio asignacionServicio;

    public AsignacionControlador(AsignacionServicio asignacionServicio) {
        this.asignacionServicio = asignacionServicio;
    }


    @GetMapping("/asignaciones")
    public List<Asignacion> getAsignaciones(){

        return asignacionServicio.getTodasAsignaciones();
    }

    @GetMapping("/asignacionesManual")
    public List<Asignacion> getAsignacionesManual(){

        return  asignacionServicio.getTodasAsignacionesManual();
    }
}
