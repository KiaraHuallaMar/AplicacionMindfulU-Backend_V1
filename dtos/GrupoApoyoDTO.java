package edu.com.upc.mindfulu.mindfulu.dtos;

import edu.com.upc.mindfulu.mindfulu.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GrupoApoyoDTO {

    private int idGrupoApoyo;

    private String tipoGrupoApoyo;

    private String descripcionGrupoApoyo;

    private LocalDate fecha_creacion;

    private Usuario usuario;
}
