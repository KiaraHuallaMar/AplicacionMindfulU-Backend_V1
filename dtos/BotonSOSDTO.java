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
public class BotonSOSDTO {

    private int idBotonSOS;

    private String descripcionBotonSOS;

    private LocalDate fechaBotonSOS;

    private LocalTime horaFinBotonSOS;

    private LocalTime horaInicioBotonSOS;

    private String motivoBotonSOS;

    private Usuario usuario;
}
