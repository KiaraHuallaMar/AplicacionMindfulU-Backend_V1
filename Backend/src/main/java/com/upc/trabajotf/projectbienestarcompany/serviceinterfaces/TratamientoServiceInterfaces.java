package com.upc.trabajotf.projectbienestarcompany.serviceinterfaces;

import com.upc.trabajotf.projectbienestarcompany.entities.Tratamiento;

import java.util.List;

public interface TratamientoServiceInterfaces {

    //Listar Tratamiento
    public List<Tratamiento> listar();

    //Registrar Tratamiento
    public Tratamiento registrar (Tratamiento tratamiento);

    //Listar por Id Tratamiento
    public Tratamiento listarId(int id);

    //Actualizar Tratamiento
    public void actualizar(Tratamiento tratamiento);

    //Eliminar Tratamiento
    public void  eliminar(int id);
}
