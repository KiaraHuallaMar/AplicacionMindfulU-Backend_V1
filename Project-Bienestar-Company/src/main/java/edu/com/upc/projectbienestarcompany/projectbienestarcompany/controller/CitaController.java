package com.upc.trabajotf.projectbienestarcompany.controller;

import com.upc.trabajotf.projectbienestarcompany.dtos.CitaDTO;
import com.upc.trabajotf.projectbienestarcompany.entities.Cita;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.CitaServiceInterfaces;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cita")
public class CitaController {
    @Autowired
    private CitaServiceInterfaces citaServiceInterfaces;

    //Listar Cita
    @GetMapping
    public List<CitaDTO> obtenerListadoCitas() {

        return citaServiceInterfaces.listar().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CitaDTO.class);
        }).collect(Collectors.toList());
    }

    //Registrar Cita
    @PostMapping
    public void registrar(@RequestBody CitaDTO citaDTO){
        ModelMapper m = new ModelMapper();
        Cita cita = m.map(citaDTO, Cita.class);
        citaServiceInterfaces.registrar(cita);
    }

    //Listar por Id Cita
    @GetMapping("/{id}")
    public CitaDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        CitaDTO citaDTO=m.map(citaServiceInterfaces.listarId(id),CitaDTO.class);
        return citaDTO;
    }

    //Actualizar Cita
    @PutMapping
    public void actualizar(@RequestBody CitaDTO citaDTO){
        ModelMapper m=new ModelMapper();
        Cita cita=m.map(citaDTO,Cita.class);
        citaServiceInterfaces.actualizar(cita);
    }

    //Eliminar Cita
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        citaServiceInterfaces.eliminar(id);
    }
}
