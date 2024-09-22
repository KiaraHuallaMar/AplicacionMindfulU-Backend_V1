package edu.com.upc.projectbienestarcompany.projectbienestarcompany.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "username", length = 50, nullable = false, unique = true )
    private String username;

    @Column(name = "password", length = 200, nullable = false )
    private String password;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "correo", length = 50, nullable = false )
    private String correo;

    private Boolean enabled;

}
