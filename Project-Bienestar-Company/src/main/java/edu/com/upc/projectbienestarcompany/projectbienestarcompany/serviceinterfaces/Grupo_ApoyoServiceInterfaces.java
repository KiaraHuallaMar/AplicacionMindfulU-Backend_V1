package com.upc.trabajotf.projectbienestarcompany.serviceinterfaces;

import com.upc.trabajotf.projectbienestarcompany.entities.Grupo_Apoyo;

import java.util.List;

public interface Grupo_ApoyoServiceInterfaces {

    //Listar Grupo Apoyo
    public List<Grupo_Apoyo> listar();

    //Registrar Grupo Apoyo
    public Grupo_Apoyo registrar (Grupo_Apoyo grupoApoyo);

    //Listar por Id Grupo Apoyo
    public Grupo_Apoyo listarId(int id);

    //Actualizar Grupo Apoyo
    public void actualizar(Grupo_Apoyo grupoApoyo);

    //Eliminar Grupo Apoyo
    public void  eliminar(int id);
}
