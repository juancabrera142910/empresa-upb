package com.upb.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;


@Entity
@Table(name = "proyectos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Proyecto {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_proyecto")
    private String nombre_proyecto;

    @Column(name = "fecha_inicio_proyecto")
    private LocalDate fecha_inicio_proyecto;

    @Column(name = "fecha_final_proyecto")
    private LocalDate fecha_final_proyecto;




}
