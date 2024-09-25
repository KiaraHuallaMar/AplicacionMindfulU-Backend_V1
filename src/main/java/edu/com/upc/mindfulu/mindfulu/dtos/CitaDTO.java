package edu.com.upc.mindfulu.mindfulu.dtos;

import edu.com.upc.mindfulu.mindfulu.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CitaDTO {

    private int idCita;

    private LocalDate fechaCita;

    private LocalTime horaCita;

    private String tipoCita;

    private String estadoCita;

    private double precioCita;

    private Usuario usuario;
}
