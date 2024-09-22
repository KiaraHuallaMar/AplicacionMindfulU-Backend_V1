package edu.com.upc.projectbienestarcompany.projectbienestarcompany.serviceimplements;

import edu.com.upc.projectbienestarcompany.projectbienestarcompany.entities.Usuario;
import edu.com.upc.projectbienestarcompany.projectbienestarcompany.repositories.UsuarioRepository;
import edu.com.upc.projectbienestarcompany.projectbienestarcompany.serviceinterfaces.UsuarioServiceInterfaces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class
{
    @Autowired
    private UsuarioRepository usuarioRepository;

    //Listar Usuario
    @Override
    public List<Usuario> listar() {return usuarioRepository.findAll();}

    //Registrar Usuario
    @Override
    public Usuario registrar(Usuario usuario) {return usuarioRepository.save(usuario);}

    //Listar por Id Usuario
    @Override
    public Usuario listarId(int id) {
        return usuarioRepository.findById(id).orElse(new Usuario());
    }

    //Actualizar Usuario
    @Override
    public void actualizar(Usuario usuario) {usuarioRepository.save(usuario); }

    //Eliminar Usuario
    @Override
    public void eliminar(int id) {
        usuarioRepository.deleteById(id);
    }
}
