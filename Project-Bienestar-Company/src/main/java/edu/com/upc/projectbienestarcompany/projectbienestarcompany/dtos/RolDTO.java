package com.upc.trabajotf.projectbienestarcompany.dtos;

import com.upc.trabajotf.projectbienestarcompany.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RolDTO {
    private int id;

    private String tipo;

    private String descripcion;

    private Usuario usuario;
}
