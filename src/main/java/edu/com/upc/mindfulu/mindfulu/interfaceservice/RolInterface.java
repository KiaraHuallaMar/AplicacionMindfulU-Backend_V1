package edu.com.upc.mindfulu.mindfulu.interfaceservice;

import edu.com.upc.mindfulu.mindfulu.entities.Rol;

import java.util.List;

public interface RolInterface {

    //insertar un rol
    public void insert(Rol rol);

    //listar todos los roles
    public List<Rol> list();

    //eliminar un rol
    public void delete(Long idRol);

    //listar un rol por id
    public Rol listarId(Long idRol);

    //modificar
    public void modificar(Rol rol);
}
