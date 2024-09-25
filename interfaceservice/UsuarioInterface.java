package edu.com.upc.mindfulu.mindfulu.interfaceservice;

import edu.com.upc.mindfulu.mindfulu.entities.Usuario;

import java.util.List;

public interface UsuarioInterface {

    public void insert(Usuario usuario);

    public List<Usuario> list();

    public void delete(int idUsuario);

    public Usuario listarId(int idUsuario);

    //modificar
    public void modificar(Usuario usuario);
}
