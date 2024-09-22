package com.upc.trabajotf.projectbienestarcompany.serviceimplements;

import com.upc.trabajotf.projectbienestarcompany.entities.Grupo_Apoyo;
import com.upc.trabajotf.projectbienestarcompany.repositories.Grupo_ApoyoRepository;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.Grupo_ApoyoServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Grupo_ApoyoServiceImplements implements Grupo_ApoyoServiceInterfaces {
    @Autowired
    Grupo_ApoyoRepository grupoApoyoRepository;

    //Listar Grupo Apoyo
    @Override
    public List<Grupo_Apoyo> listar() {return grupoApoyoRepository.findAll();}

    //Registrar Grupo Apoyo
    @Override
    public Grupo_Apoyo registrar(Grupo_Apoyo grupoApoyo) {return grupoApoyoRepository.save(grupoApoyo);}

    //Listar por Id Grupo Apoyo
    @Override
    public Grupo_Apoyo listarId(int id) {
        return grupoApoyoRepository.findById(id).orElse(new Grupo_Apoyo());
    }

    //Actualizar Grupo Apoyo
    @Override
    public void actualizar(Grupo_Apoyo grupoApoyo) {grupoApoyoRepository.save(grupoApoyo); }

    //Eliminar Grupo Apoyo
    @Override
    public void eliminar(int id) {
        grupoApoyoRepository.deleteById(id);
    }

}
