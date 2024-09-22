package edu.com.upc.projectbienestarcompany.projectbienestarcompany.dtos;

import edu.com.upc.projectbienestarcompany.projectbienestarcompany.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class Boton_SosDTO {

    private int id;

    private String descripcion;

    private LocalDate fechaInicio;

    private LocalDate fechaFin;

    private LocalTime hora;

    private String motivo;

    private Usuario universitario;

    private Usuario especialista;
}