package edu.com.upc.mindfulu.mindfulu.dtos;

import edu.com.upc.mindfulu.mindfulu.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RolDTO {
    private Long id;

    private String nombreRol;

    private Usuario usuario;
}
