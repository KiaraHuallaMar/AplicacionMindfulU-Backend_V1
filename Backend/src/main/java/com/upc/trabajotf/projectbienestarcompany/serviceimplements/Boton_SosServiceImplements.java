package com.upc.trabajotf.projectbienestarcompany.serviceimplements;

import com.upc.trabajotf.projectbienestarcompany.entities.Boton_Sos;
import com.upc.trabajotf.projectbienestarcompany.repositories.Boton_SosRepository;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.Boton_SosServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Boton_SosServiceImplements implements Boton_SosServiceInterfaces {
    @Autowired
    Boton_SosRepository botonSosRepository;

    //Listar Boton Sos
    @Override
    public List<Boton_Sos> listar() {return botonSosRepository.findAll();}

    //Registrar Boton Sos
    @Override
    public Boton_Sos registrar(Boton_Sos botonSos) {return botonSosRepository.save(botonSos);}

    //Listar por Id Boton Sos
    @Override
    public Boton_Sos listarId(int id) {
        return botonSosRepository.findById(id).orElse(new Boton_Sos());
    }

    //Actualizar Boton Sos
    @Override
    public void actualizar(Boton_Sos botonSos) {botonSosRepository.save(botonSos); }

    //Eliminar Boton Sos
    @Override
    public void eliminar(int id) {
        botonSosRepository.deleteById(id);
    }
}
