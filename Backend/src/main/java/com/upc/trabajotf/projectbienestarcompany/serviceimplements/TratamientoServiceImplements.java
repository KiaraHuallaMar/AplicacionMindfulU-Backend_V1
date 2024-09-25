package com.upc.trabajotf.projectbienestarcompany.serviceimplements;

import com.upc.trabajotf.projectbienestarcompany.entities.Tratamiento;
import com.upc.trabajotf.projectbienestarcompany.repositories.TratamientoRepository;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.TratamientoServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TratamientoServiceImplements implements TratamientoServiceInterfaces {
    @Autowired
    private TratamientoRepository tratamientoRepository;

    //Listar Tratamiento
    @Override
    public List<Tratamiento> listar() {return tratamientoRepository.findAll();}

    //Registrar Tratamiento
    @Override
    public Tratamiento registrar(Tratamiento tratamiento) {return tratamientoRepository.save(tratamiento);}

    //Listar por Id Tratamiento
    @Override
    public Tratamiento listarId(int id) {
        return tratamientoRepository.findById(id).orElse(new Tratamiento());
    }

    //Actualizar Tratamiento
    @Override
    public void actualizar(Tratamiento tratamiento) {tratamientoRepository.save(tratamiento); }

    //Eliminar Tratamiento
    @Override
    public void eliminar(int id) {
        tratamientoRepository.deleteById(id);
    }
}
