package edu.com.upc.projectbienestarcompany.projectbienestarcompany.dtos;

import edu.com.upc.projectbienestarcompany.projectbienestarcompany.entities.Usuario;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TratamientoDTO {
    private int id;

    private String nombre;

    private String tipo_categoria;

    private String descripcion;

    private int pago;

    private Usuario usuario;
}
