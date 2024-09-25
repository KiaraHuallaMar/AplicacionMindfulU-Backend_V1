package edu.com.upc.mindfulu.mindfulu.serviceimplements;

import edu.com.upc.mindfulu.mindfulu.entities.Usuario;
import edu.com.upc.mindfulu.mindfulu.interfaceservice.UsuarioInterface;
import edu.com.upc.mindfulu.mindfulu.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UsuarioService implements UsuarioInterface {

    @Autowired
    private UsuarioRepository uR;

    //Registrar Usuario
    @Override
    public void insert(Usuario usuario) {
        uR.save(usuario);
    }

    //Listar Usuario
    @Override
    public List<Usuario> list() {
        return uR.findAll();
    }

    //Eliminar Usuario
    @Override
    public void delete(int idUsuario) { uR.deleteById(idUsuario); }

    //Listar por Id Usuario
    @Override
    public Usuario listarId(int idUsuario) {
        return uR.findById(idUsuario).orElse(new Usuario());
    }

    //Actualizar Usuario
    @Override
    public void modificar(Usuario usuario) {
        uR.save(usuario);
    }
}
