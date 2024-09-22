package com.upc.trabajotf.projectbienestarcompany.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "fecha",nullable = false)
    private LocalDate fecha;

    @Column(name = "hora", nullable = false)
    @JsonFormat(pattern = "HH:mm:ss")
    private LocalTime hora;

    @Column(name = "tipo_cita",length = 50, nullable = false)
    private String tipo_cita;

    @Column(name = "estado",length = 50, nullable = false)
    private String estado;

    @Column(name = "pago", nullable = false)
    private int pago;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "universitario_id")
    private Usuario universitario;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "especialista_id")
    private Usuario especialista;
}
