package com.upc.trabajotf.projectbienestarcompany.controller;

import com.upc.trabajotf.projectbienestarcompany.dtos.TratamientoDTO;
import com.upc.trabajotf.projectbienestarcompany.entities.Tratamiento;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.TratamientoServiceInterfaces;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tratamiento")
public class TratamientoController {

    @Autowired
    private TratamientoServiceInterfaces tratamientoServiceInterfaces;

    //Listar TrataMiento
    @GetMapping
    public List<TratamientoDTO> obtenerTratamientos(){

        return tratamientoServiceInterfaces.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,TratamientoDTO.class);
        }).collect(Collectors.toList());
    }

    //Registrar Cita
    @PostMapping
    public void registrar(@RequestBody TratamientoDTO tratamientoDTO){
        ModelMapper m = new ModelMapper();
        Tratamiento tratamiento = m.map(tratamientoDTO, Tratamiento.class);
        tratamientoServiceInterfaces.registrar(tratamiento);
    }

    //Listar por Id Cita
    @GetMapping("/{id}")
    public TratamientoDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        TratamientoDTO tratamientoDTO=m.map(tratamientoServiceInterfaces.listarId(id),TratamientoDTO.class);
        return tratamientoDTO;
    }

    //Actualizar Cita
    @PutMapping
    public void actualizar(@RequestBody TratamientoDTO tratamientoDTO){
        ModelMapper m=new ModelMapper();
        Tratamiento tratamiento=m.map(tratamientoDTO,Tratamiento.class);
        tratamientoServiceInterfaces.actualizar(tratamiento);
    }

    //Eliminar Cita
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tratamientoServiceInterfaces.eliminar(id);
    }


}
