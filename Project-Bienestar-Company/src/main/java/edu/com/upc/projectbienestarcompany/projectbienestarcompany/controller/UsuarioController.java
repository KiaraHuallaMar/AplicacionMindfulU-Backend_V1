package edu.com.upc.projectbienestarcompany.projectbienestarcompany.controller;

import edu.com.upc.projectbienestarcompany.projectbienestarcompany.dtos.UsuarioDTO;
import edu.com.upc.projectbienestarcompany.projectbienestarcompany.entities.Usuario;
import edu.com.upc.projectbienestarcompany.projectbienestarcompany.serviceinterfaces.UsuarioServiceInterfaces;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
@PreAuthorize("hasAuthority('ADMINISTRADOR')")
public class UsuarioController {

    @Autowired
    private UsuarioServiceInterfaces usuarioServiceInterfaces;

    @Autowired
    private PasswordEncoder passwordEncoder;

    //Listar Usuario
    @GetMapping
    public List<UsuarioDTO> obtenerUsuarios() {

        return usuarioServiceInterfaces.listar().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, UsuarioDTO.class);
        }).collect(Collectors.toList());
    }

    //Registrar Usuario
    @PostMapping
    public void registrar(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper m = new ModelMapper();
        Usuario usuario = m.map(usuarioDTO, Usuario.class);
        String encodedPassword = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(encodedPassword);
        usuarioServiceInterfaces.registrar(usuario);
    }

    //Listar por Id Usuario
    @GetMapping("/{id}")
    public UsuarioDTO listarId(@PathVariable("id") Integer id) {
        ModelMapper m = new ModelMapper();
        UsuarioDTO usuarioDTO = m.map(usuarioServiceInterfaces.listarId(id), UsuarioDTO.class);
        return usuarioDTO;
    }

    //Actualizar Usuario
    @PutMapping
    public void actualizar(@RequestBody UsuarioDTO usuarioDTO) {
        ModelMapper m = new ModelMapper();
        Usuario usuario = m.map(usuarioDTO, Usuario.class);
        usuarioServiceInterfaces.actualizar(usuario);
    }

    //Eliminar Usuario
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id) {
        usuarioServiceInterfaces.eliminar(id);
    }
}