package com.upc.trabajotf.projectbienestarcompany.serviceinterfaces;

import com.upc.trabajotf.projectbienestarcompany.entities.Boton_Sos;

import java.util.List;

public interface Boton_SosServiceInterfaces {
    //Listar Boton Sos
    public List<Boton_Sos> listar();

    //Registrar Boton Sos
    public Boton_Sos registrar (Boton_Sos botonSos);

    //Listar por Id Boton Sos
    public Boton_Sos listarId(int id);

    //Actualizar Boton Sos
    public void actualizar(Boton_Sos botonSos);

    //Eliminar Boton Sos
    public void  eliminar(int id);
}
