package edu.com.upc.mindfulu.mindfulu.serviceimplements;

import edu.com.upc.mindfulu.mindfulu.entities.Rol;
import edu.com.upc.mindfulu.mindfulu.interfaceservice.RolInterface;
import edu.com.upc.mindfulu.mindfulu.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class RolService implements RolInterface {
    @Autowired
    private RolRepository lR;

    //Registrar Rol
    @Override
    public void insert(Rol rol) {
        lR.save(rol);
    }

    //Listar Rol
    @Override
    public List<Rol> list() {
        return lR.findAll();
    }

    //Eliminar Rol
    @Override
    public void delete(Long idRol) { lR.deleteById(idRol);}

    //Listar por Id Rol
    @Override
    public Rol listarId(Long idRol) {
        return lR.findById(idRol).orElse(new Rol());
    }

    //Actualizar Rol
    @Override
    public void modificar(Rol rol) {
        lR.save(rol);
    }
}
