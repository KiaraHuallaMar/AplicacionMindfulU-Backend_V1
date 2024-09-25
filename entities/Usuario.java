package edu.com.upc.mindfulu.mindfulu.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idUsuario;

    @Column(length = 30, unique = true)
    public String username;

    @Column(length = 200)
    public String password;

    @Column(name = "edad", nullable = false)
    private int edad;

    @Column(name = "correo", length = 50, nullable = false )
    private String correo;

    private Boolean enabled;

    @JsonIgnore
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<Rol> roles;
}
