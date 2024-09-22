package com.upc.trabajotf.projectbienestarcompany.dtos;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Grupo_ApoyoDTO {
    private int id;

    private String tipo;

    private String descripcion;

    private LocalDate fecha_creacion;
}
