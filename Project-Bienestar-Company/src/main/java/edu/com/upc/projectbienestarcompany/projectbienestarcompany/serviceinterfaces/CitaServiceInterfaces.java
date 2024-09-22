package com.upc.trabajotf.projectbienestarcompany.serviceinterfaces;

import com.upc.trabajotf.projectbienestarcompany.entities.Cita;

import java.util.List;

public interface CitaServiceInterfaces {
    //Listar Cita
    public List<Cita> listar();

    //Registrar Cita
    public Cita registrar (Cita cita);

    //Listar por Id Cita
    public Cita listarId(int id);

    //Actualizar Cita
    public void actualizar(Cita cita);

    //Eliminar Cita
    public void  eliminar(int id);

}
