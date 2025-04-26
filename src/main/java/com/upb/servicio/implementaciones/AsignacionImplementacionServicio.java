package com.upb.servicio.implementaciones;

import com.upb.modelo.entidades.Asignacion;
import com.upb.modelo.repositorios.AsignacionRepositorio;
import com.upb.servicio.AsignacionServicio;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AsignacionImplementacionServicio implements AsignacionServicio {

    private final AsignacionRepositorio asignacionRepositorio;

    public AsignacionImplementacionServicio(AsignacionRepositorio asignacionRepositorio) {
        this.asignacionRepositorio = asignacionRepositorio;
    }

    @Override
    public List<Asignacion> getTodasAsignaciones() {
        return asignacionRepositorio.findAll();
    }

    @Override
    public List<Asignacion> getTodasAsignacionesManual() {
        return asignacionRepositorio.traerTodo();
    }




}
