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
@Table(name = "cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCita;

    @Column(name = "fechaCita",nullable = false)
    private LocalDate fechaCita;

    @JsonFormat(pattern = "HH:mm:ss")
    @Column(name = "horaCita", nullable = false)
    private LocalTime horaCita;

    @Column(name = "tipoCita",length = 50, nullable = false)
    private String tipoCita;

    @Column(name = "estadoCita",length = 50, nullable = false)
    private String estadoCita;

    @Column(name = "precioCita", nullable = false)
    private double precioCita;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
