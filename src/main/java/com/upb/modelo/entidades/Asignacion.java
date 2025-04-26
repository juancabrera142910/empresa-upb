package com.upb.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Table(name = "asignaciones")
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Asignacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long Id;
    @Column(name = "fk_id_empleado")
    Long fk_id_empleado;
    @Column(name = "fk_id_proyecto")
    Long fk_id_proyecto;
    @Column(name = "asigando_en")
    LocalDate asigando_en;

}
