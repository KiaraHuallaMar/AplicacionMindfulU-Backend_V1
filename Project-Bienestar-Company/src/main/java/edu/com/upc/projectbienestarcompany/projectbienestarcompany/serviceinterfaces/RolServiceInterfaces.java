package com.upc.trabajotf.projectbienestarcompany.serviceinterfaces;

import com.upc.trabajotf.projectbienestarcompany.entities.Rol;

import java.util.List;

public interface RolServiceInterfaces {

    //Listar Rol
    public List<Rol> listar();

    //Registrar Rol
    public Rol registrar (Rol rol);

    //Listar por Id Rol
    public Rol listarId(int id);

    //Actualizar Rol
    public void actualizar(Rol rol);

    //Eliminar Rol
    public void  eliminar(int id);

    //Buscar Rol
    public List<Rol> buscar (String rol);
}
