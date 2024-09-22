package edu.com.upc.projectbienestarcompany.projectbienestarcompany.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class UsuarioDTO {
    private int id;

    private String username;

    private String password;

    private String nombre;

    private String apellido;

    private int edad;

    private String correo;

    private Boolean enabled;
}
