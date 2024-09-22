package edu.com.upc.projectbienestarcompany.projectbienestarcompany.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Boton_Sos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descripcion", length = 50, nullable = false)
    private String descripcion;

    @Column(name = "fechaInicio",nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fechaFin",nullable = false)
    private LocalDate fechaFin;

    @Column(name = "hora", nullable = false)
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime hora;

    @Column(name = "motivo", length = 100, nullable = false)
    private String motivo;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "universitario_id")
    private Usuario universitario;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "especialista_id")
    private Usuario especialista;
}
