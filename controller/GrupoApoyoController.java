package edu.com.upc.mindfulu.mindfulu.controller;

import edu.com.upc.mindfulu.mindfulu.dtos.GrupoApoyoDTO;
import edu.com.upc.mindfulu.mindfulu.entities.GrupoApoyo;
import edu.com.upc.mindfulu.mindfulu.interfaceservice.GrupoApoyoInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/grupos")
public class GrupoApoyoController {

    @Autowired
    private GrupoApoyoInterface gI;

    @PostMapping("/insert")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','USUARIO')")

    public void insert(@RequestBody GrupoApoyoDTO dto) {
        ModelMapper m = new ModelMapper();
        GrupoApoyo g = m.map(dto, GrupoApoyo.class);
        gI.insert(g);
    }

    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public List<GrupoApoyoDTO> list() {
        return gI.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, GrupoApoyoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public void delete(@PathVariable int id) {
        gI.delete(id);
    }

    @GetMapping("/listarId/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public GrupoApoyoDTO listarId(@PathVariable int id) {
        ModelMapper m = new ModelMapper();
        GrupoApoyoDTO dto = m.map(gI.listarId(id), GrupoApoyoDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','USUARIO')")
    public void modificar(@RequestBody GrupoApoyoDTO dto) {
        ModelMapper m = new ModelMapper();
        GrupoApoyo g = m.map(dto, GrupoApoyo.class);
        gI.modificar(g);
    }

}



