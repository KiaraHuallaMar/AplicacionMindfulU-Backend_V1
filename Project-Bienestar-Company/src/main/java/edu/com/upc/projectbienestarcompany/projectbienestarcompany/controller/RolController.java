package com.upc.trabajotf.projectbienestarcompany.controller;

import com.upc.trabajotf.projectbienestarcompany.dtos.RolDTO;
import com.upc.trabajotf.projectbienestarcompany.entities.Rol;
import com.upc.trabajotf.projectbienestarcompany.serviceinterfaces.RolServiceInterfaces;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    private RolServiceInterfaces rolServiceInterfaces;

    //Listar Rol
    @GetMapping
    public List<RolDTO> obtenerRoles(){

        return rolServiceInterfaces.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RolDTO.class);
        }).collect(Collectors.toList());
    }

    //Registrar Rol
    @PostMapping
    public void registrar(@RequestBody RolDTO rolDTO){
        ModelMapper m = new ModelMapper();
        Rol rol = m.map(rolDTO, Rol.class);
        rolServiceInterfaces.registrar(rol);
    }

    //Listar por Id Rol
    @GetMapping("/{id}")
    public RolDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        RolDTO rolDTO=m.map(rolServiceInterfaces.listarId(id),RolDTO.class);
        return rolDTO;
    }

    //Actualizar Rol
    @PutMapping
    public void actualizar(@RequestBody RolDTO rolDTO){
        ModelMapper m=new ModelMapper();
        Rol rol=m.map(rolDTO,Rol.class);
        rolServiceInterfaces.actualizar(rol);
    }

    //Eliminar Rol
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        rolServiceInterfaces.eliminar(id);
    }

    //Buscar Rol
    @GetMapping("/busquedas")
    public List<RolDTO> buscar(@RequestParam String r){

        return rolServiceInterfaces.buscar(r).stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,RolDTO.class);
        }).collect(Collectors.toList());
    }
}
