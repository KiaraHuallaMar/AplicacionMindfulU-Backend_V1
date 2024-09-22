package com.upc.trabajotf.projectbienestarcompany.serviceimplements;

import com.upc.trabajotf.projectbienestarcompany.entities.Cita;
import com.upc.trabajotf.projectbienestarcompany.repositories.CitaRepository;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.CitaServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImplements implements CitaServiceInterfaces {
    @Autowired
    private CitaRepository citaRepository;

    //Listar Cita
    @Override
    public List<Cita> listar() {return citaRepository.findAll();}

    //Registrar Cita
    @Override
    public Cita registrar(Cita cita) {return citaRepository.save(cita);}

    //Listar por Id Cita
    @Override
    public Cita listarId(int id) {
        return citaRepository.findById(id).orElse(new Cita());
    }

    //Actualizar Cita
    @Override
    public void actualizar(Cita v) {citaRepository.save(v); }

    //Eliminar Cita
    @Override
    public void eliminar(int id) {
        citaRepository.deleteById(id);
    }
}
