package edu.com.upc.mindfulu.mindfulu.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "especialista")
public class Especialista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEspecialista;

    @Column(name = "nombreEspecialista", length = 50, nullable = false)
    private String nombreEspecialista;

    @Column(name = "edadEspecialista", nullable = false)
    private int edadEspecialista;

    @Column(name = "especialidadEspecialista", length = 50, nullable = false)
    private String especialidadEspecialista;

    @Column(name = "telefonoEspecialista", nullable = false)
    private String telefonoEspecialista;
}
