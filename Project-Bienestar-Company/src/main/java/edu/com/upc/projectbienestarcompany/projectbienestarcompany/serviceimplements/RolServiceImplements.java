package com.upc.trabajotf.projectbienestarcompany.serviceimplements;

import com.upc.trabajotf.projectbienestarcompany.entities.Rol;
import com.upc.trabajotf.projectbienestarcompany.repositories.RolRepository;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.RolServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImplements implements RolServiceInterfaces {
    @Autowired
    private RolRepository rolRepository;

    //Listar Cita
    @Override
    public List<Rol> listar() {return rolRepository.findAll();}

    //Registrar Cita
    @Override
    public Rol registrar(Rol rol) {return rolRepository.save(rol);}

    //Listar por Id Cita
    @Override
    public Rol listarId(int id) {
        return rolRepository.findById(id).orElse(new Rol());
    }

    //Actualizar Cita
    @Override
    public void actualizar(Rol rol) {rolRepository.save(rol); }

    //Eliminar Cita
    @Override
    public void eliminar(int id) {
        rolRepository.deleteById(id);
    }

    //Buscar Rol
    @Override
    public List<Rol> buscar(String rol) {return rolRepository.buscar(rol);}

}
