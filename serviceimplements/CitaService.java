package edu.com.upc.mindfulu.mindfulu.serviceimplements;

import edu.com.upc.mindfulu.mindfulu.entities.Cita;
import edu.com.upc.mindfulu.mindfulu.interfaceservice.CitaInterface;
import edu.com.upc.mindfulu.mindfulu.repositories.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaService implements CitaInterface {

    @Autowired
    private CitaRepository cR;

    //Registrar Cita
    @Override
    public void insert(Cita cita) {
        cR.save(cita);
    }

    //Listar Cita
    @Override
    public List<Cita> list() {
        return cR.findAll();
    }

    //Eliminar Cita
    @Override
    public void delete(int idCita) { cR.deleteById(idCita); }

    //Listar por Id Cita
    @Override
    public Cita listarId(int idCita) {
        return cR.findById(idCita).orElse(new Cita());
    }

    //Actualizar Cita
    @Override
    public void modificar(Cita cita) {
        cR.save(cita);
    }

     //Recaudo Total Cita
    @Override
    public List<String[]> totalRecaudado() {
        return cR.totalRecaudado();
    }
}
