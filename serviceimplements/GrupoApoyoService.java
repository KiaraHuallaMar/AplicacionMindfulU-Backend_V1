package edu.com.upc.mindfulu.mindfulu.serviceimplements;

import edu.com.upc.mindfulu.mindfulu.entities.GrupoApoyo;
import edu.com.upc.mindfulu.mindfulu.interfaceservice.GrupoApoyoInterface;
import edu.com.upc.mindfulu.mindfulu.repositories.GrupoApoyoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoApoyoService implements GrupoApoyoInterface {

    @Autowired
    private GrupoApoyoRepository gR;

    //Registrar GrupoApoyo
    @Override
    public void insert(GrupoApoyo grupoApoyo) {
        gR.save(grupoApoyo);
    }

    //Listar GrupoApoyo
    @Override
    public List<GrupoApoyo> list() {
        return gR.findAll();
    }

    //Eliminar GrupoApoyo
    @Override
    public void delete(int idGrupoApoyo) { gR.deleteById(idGrupoApoyo); }

    //Listar por Id GrupoApoyo
    @Override
    public GrupoApoyo listarId(int idGrupoApoyo) {
        return gR.findById(idGrupoApoyo).orElse(new GrupoApoyo());
    }

    //Actualizar GrupoApoyo
    @Override
    public void modificar(GrupoApoyo grupoApoyo) {
        gR.save(grupoApoyo);
    }
}
