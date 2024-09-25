package com.upc.trabajotf.projectbienestarcompany.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Tratamiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre",length = 50, nullable = false)
    private String nombre;

    @Column(name = "tipo_categoria",length = 50, nullable = false)
    private String tipo_categoria;

    @Column(name = "descripcion",length = 150, nullable = false)
    private String descripcion;

    @Column(name = "pago", nullable = false)
    private int pago;

    @ManyToOne(targetEntity = Usuario.class)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}
