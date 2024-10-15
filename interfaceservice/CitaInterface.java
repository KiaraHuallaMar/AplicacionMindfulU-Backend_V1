package edu.com.upc.mindfulu.mindfulu.interfaceservice;

import edu.com.upc.mindfulu.mindfulu.entities.Cita;

import java.util.List;

public interface CitaInterface {

    public void insert(Cita cita);

    public List<Cita> list();

    public void delete(int idCita);

    public Cita listarId(int idCita);

    //modificar
    public void modificar(Cita cita);

    public List<String[]> totalRecaudado();
}
