package com.upc.trabajotf.projectbienestarcompany.dtos;


import com.upc.trabajotf.projectbienestarcompany.entities.Usuario;
import lombok.Getter;
import lombok.Setter;


import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
public class CitaDTO {
    private int id;

    private LocalDate fecha;

    private LocalTime hora;

    private String tipo_cita;

    private String estado;

    private int pago;

    private Usuario universitario;

    private Usuario especialista;
}
