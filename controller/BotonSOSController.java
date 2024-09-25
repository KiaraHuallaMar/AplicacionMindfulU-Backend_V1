package edu.com.upc.mindfulu.mindfulu.controller;

import edu.com.upc.mindfulu.mindfulu.dtos.BotonSOSDTO;
import edu.com.upc.mindfulu.mindfulu.entities.BotonSOS;
import edu.com.upc.mindfulu.mindfulu.interfaceservice.BotonSOSInterface;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/botones")
public class BotonSOSController {

    @Autowired
    private BotonSOSInterface bI;

    @PostMapping("/insert")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','USUARIO', 'UNIVERSITARIO')")
    public void insert(@RequestBody BotonSOSDTO dto) {
        ModelMapper m = new ModelMapper();
        BotonSOS b = m.map(dto, BotonSOS.class);
        bI.insert(b);
    }

    @GetMapping("/list")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public List<BotonSOSDTO> list() {
        return bI.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, BotonSOSDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/delete/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public void delete(@PathVariable int id) {
        bI.delete(id);
    }

    @GetMapping("/listarId/{id}")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR')")
    public BotonSOSDTO listarId(@PathVariable int id) {
        ModelMapper m = new ModelMapper();
        BotonSOSDTO dto = m.map(bI.listarId(id), BotonSOSDTO.class);
        return dto;
    }

    @PutMapping("/modificar")
    @PreAuthorize("hasAnyAuthority('ADMINISTRADOR','USUARIO')")
    public void modificar(@RequestBody BotonSOSDTO dto) {
        ModelMapper m = new ModelMapper();
        BotonSOS b = m.map(dto, BotonSOS.class);
        bI.modificar(b);
    }

}


