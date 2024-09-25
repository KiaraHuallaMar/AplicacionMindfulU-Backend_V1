package edu.com.upc.mindfulu.mindfulu.controller;

import edu.com.upc.mindfulu.mindfulu.dtos.CitaDTO;
import edu.com.upc.mindfulu.mindfulu.entities.Cita;
import edu.com.upc.mindfulu.mindfulu.interfaceservice.CitaInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")
public class CitaController {

    @Autowired
    private CitaInterface cI;
    @PostMapping("/insert")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','USUARIO')")

    public void insert(@RequestBody CitaDTO dto) {
        ModelMapper m = new ModelMapper();
        Cita c = m.map(dto, Cita.class);
        cI.insert(c);
    }

    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public List<CitaDTO> list() {
        return cI.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, CitaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public void delete(@PathVariable int id) {
        cI.delete(id);
    }

    @GetMapping("/listarId/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public CitaDTO listarId(@PathVariable int id) {
        ModelMapper m = new ModelMapper();
        CitaDTO dto = m.map(cI.listarId(id), CitaDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','USUARIO')")
    public void modificar(@RequestBody CitaDTO dto) {
        ModelMapper m = new ModelMapper();
        Cita c = m.map(dto, Cita.class);
        cI.modificar(c);
    }

}


