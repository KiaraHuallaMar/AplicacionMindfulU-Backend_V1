package edu.com.upc.mindfulu.mindfulu.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

    public int id;

    public String username;

    public String password;

    private int edad;

    private String correo;

    private Boolean enabled;
}
