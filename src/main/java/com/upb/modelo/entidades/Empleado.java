package com.upb.modelo.entidades;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "empleados")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String primer_nombre;
    String segundo_nombre;
    String email;
    Long fk_id_departamento;
    Long fk_id_posicion;

}

