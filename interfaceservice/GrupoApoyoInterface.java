package edu.com.upc.mindfulu.mindfulu.interfaceservice;

import edu.com.upc.mindfulu.mindfulu.entities.GrupoApoyo;

import java.util.List;

public interface GrupoApoyoInterface {

    public void insert(GrupoApoyo grupoApoyo);

    public List<GrupoApoyo> list();

    public void delete(int idGrupoApoyo);

    public GrupoApoyo listarId(int idGrupoApoyo);

    //modificar
    public void modificar(GrupoApoyo grupoApoyo);
}
