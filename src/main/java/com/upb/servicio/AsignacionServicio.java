package com.upb.servicio;

import com.upb.modelo.entidades.Asignacion;

import java.util.List;

public interface AsignacionServicio {

    List<Asignacion> getTodasAsignaciones();

    List<Asignacion> getTodasAsignacionesManual();

}
