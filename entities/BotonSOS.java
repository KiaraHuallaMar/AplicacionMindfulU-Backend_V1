package edu.com.upc.mindfulu.mindfulu.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "botonsos")
public class BotonSOS {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBotonSOS;

    @Column(name = "descripcionBotonSOS", length = 50, nullable = false)
    private String descripcionBotonSOS;

    @Column(name = "fechaBotonSOS",nullable = false)
    private LocalDate fechaBotonSOS;

    @Column(name = "horaInicioBotonSOS",nullable = false)
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime horaInicioBotonSOS;

    @Column(name = "horaFinBotonSOS", nullable = false)
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime horaFinBotonSOS;

    @Column(name = "motivoBotonSOS", length = 100, nullable = false)
    private String motivoBotonSOS;

    @ManyToOne
    @JoinColumn(name = "id_Usuario")
    private Usuario usuario;

}
